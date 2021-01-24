import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class SpaceGame extends JPanel {
	
	// variables 
	
	// width and height of frame
	private static final int WIDTH = 900;
	private static final int HEIGHT = 600;
	
	private BufferedImage image; 
	private Timer timer; 
	private Graphics g; 
	private Picture rocket;
	private Picture aliens[] = new Picture[5];
	private Picture meteor[] = new Picture[15];
	private int food_hits = 0;
	private int life = 3;	
	private boolean upKey, downKey, leftKey, rightKey;
	int movement = 20;
	
	public SpaceGame()
	{
		// background set to white
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();

		GraphicsUtilities.drawBackground(g, Color.WHITE, WIDTH, HEIGHT);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("BestersSupply", Font.PLAIN, 25)); 
		g.drawString("Move by Arrow Keys. Capture the Aliens! Beware of Meteors!", 10, HEIGHT - 50);
		
		// instantiate objects
		
		rocket = new Picture(WIDTH/2, HEIGHT/2, 40, 80);
		rocket.draw(g, "rocket.png");
		
		for(int i = 0; i < aliens.length; i++) {
			int x = (int) (Math.random()*WIDTH);
			int y = (int) (Math.random()*HEIGHT);
			aliens[i] = new Picture((double)x, (double)y, 45.0, 35.0);
			aliens[i].draw(g, "alien2.png");
			aliens[i].setXSpeed(5);
			aliens[i].setYSpeed(5);
		}
		
		for(int i = 0; i < meteor.length; i++) {
			int x = (int) (Math.random()*WIDTH);
			int y = (int) (Math.random()*HEIGHT);
			meteor[i] = new Picture(x, y, 40, 40);
			meteor[i].draw(g, "meteor.png");
			meteor[i].setXSpeed(3);
			meteor[i].setYSpeed(3);
		}
	
		timer = new Timer(100, new TimerListener());
		timer.start();
		
		addKeyListener(new Keyboard());
		setFocusable(true);
	
	}

	// moves side-side, up-down, and diagonal
	public void updateMovement() {
		if(upKey == true) {
			rocket.setY(rocket.getY() - movement);
		}
		if(downKey == true) {
			rocket.setY(rocket.getY() + movement);
		}
		if(leftKey == true) {
			rocket.setX(rocket.getX() - movement);
		}
		if(rightKey == true)
		{
			rocket.setX(rocket.getX() + movement);
		}
	}
	
	
	private class Keyboard implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				upKey=true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				downKey = true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKey = true;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKey = true;
			}
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				upKey=false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				downKey = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftKey = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightKey = false;
			}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	
			// draw a background color to cover up all the previous graphics
			GraphicsUtilities.drawBackground(g, Color.WHITE, WIDTH, HEIGHT);
			g.setColor(Color.BLACK);
			g.setFont(new Font("BestersSupply", Font.PLAIN, 25)); 
			g.drawString("Move by Arrow Keys. Capture the Aliens! Beware of Meteors!", 10, HEIGHT - 20);

	
			// keyboard movement
			updateMovement();
			
			// place all objects and draw them in their new locations to move
			rocket.move(WIDTH, HEIGHT);
			rocket.draw(g, "rocket.png");
	
			// if intersects with, rice respawns out of frame and food counter increases by one
			for(int i = 0; i < aliens.length; i++)
			{
				if (intersects(rocket, aliens[i])) {
					food_hits++;
					
					aliens[i].respawn(9999, 9999);
					
				}

				aliens[i].move(WIDTH, HEIGHT);
				aliens[i].draw(g, "alien2.png");
				
			}

			// if intersect with ghost, life decreases and ghost respawns while player movement decreases
			for(int i = 0; i < meteor.length; i++)
			{
				
				if (intersects(rocket, meteor[i])) {
					life--;
					meteor[i].respawn(WIDTH, HEIGHT);
					movement = movement - 2;
					
				}
				
				meteor[i].move(WIDTH, HEIGHT);
				meteor[i].draw(g, "meteor.png");
				
			}
			
			// string for counters: rice hit and ghost hit
			g.setColor(Color.BLACK);
			g.setFont(new Font("BestersSupply", Font.BOLD, 25)); 
			g.drawString("Hits: " + food_hits, 5, 20);
			g.drawString("Remaining Life: " + life, 5, 50);
			
			// This is the last line of actionPerformed
			repaint();
			
			//remaining ghost respawn error and rice error
			// goes after timer so respawn is not over background
			// shows "game over" or win screen depending on the end outcome
			if(life == 0) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, WIDTH, HEIGHT);
				g.setColor(Color.red.darker());
				g.setFont(new Font("BestersSupply", Font.BOLD, 50)); 
				g.drawString("GAME OVER", WIDTH/2 - 125, HEIGHT/2);
				timer.stop();
			} else if(food_hits == 5) {
				g.setColor(Color.BLUE.brighter());
				g.fillRect(0, 0, WIDTH, HEIGHT);
				g.setColor(Color.WHITE);
				g.setFont(new Font("BestersSupply", Font.BOLD, 50)); 
				g.drawString("You Win!", WIDTH/2 - 100, HEIGHT/2);
				timer.stop();
			}
		}
	}
	
	public boolean intersects(Picture one, Picture two) {
		
		// variable
		double x1 = one.getX();
		double y1 = one.getY();
		double x2 = two.getX();
		double y2 = two.getY();
		
		// intersection method
		if( ((x1 >= x2) && (x1 <= x2+two.getWidth())) && ((y1 >= y2) && (y1 <= y2+two.getHeight())) || 
			((x1+one.getWidth() >= x2) && (x1+one.getWidth() <= x2+two.getWidth())) && ((y1+one.getHeight() >= y2) && (y1+one.getHeight() <= y2+two.getHeight())) || 
			((x1 >= x2) && (x1 <= x2+two.getWidth())) && ((y1 >= y2) && (y1+one.getHeight() <= y2+two.getHeight())) || 
			((x1+one.getWidth() >= x2) && (x1+one.getWidth() <= x2+two.getWidth())) && ((y1 >= y2) && (y1 <= y2+two.getHeight()))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
		
	public static void main(String[] args) {
		JFrame frame = new JFrame("Space Chase");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new SpaceGame());
		frame.setVisible(true);
	}


}

