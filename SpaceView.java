import java.awt.Color;


import java.awt.Image;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class SpaceView extends JPanel{
	private static final int WIDTH = 1390;
	private static final int HEIGHT = 810;
	private static final Color DARK_BLUE = new Color(0,10,45);

	private Graphics g;
	private Timer timer;
	private BufferedImage image;
	protected Keyboard keyboard;
	protected Mouse mouse;
	private boolean starClicked = false;
	
	public SpaceView() {
		keyboard = new Keyboard();
		mouse = new Mouse();
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		mainPage(g);
		addMouseListener(mouse);

	}
	public void paintComponent(Graphics g) {
		g.drawImage(image,  0, 0, WIDTH, HEIGHT, null);
	}
	 public static void drawBackground(Graphics g, Color color, int width, int height) {
			g.setColor(color);
			g.fillRect(0, 0, width, height);
		}
	 public static void goBackButton(Graphics g) {
		Color lightBlue = new Color(89,171,210);
		g.setColor(lightBlue);
		g.fillRect(15, 680, 350, 70);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,28));
		g.drawString("Back to Constellations Page", 22, 725);
	 }
	
	public void mainPage(Graphics g) {
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Constellations.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 0, 0,this);
	
		
		repaint();

	}
	

	
	public void pegasus(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Pegasus", 560, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Pegasus.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
	
	
	g.setFont(new Font("Times New Roman",Font.PLAIN,30));
	g.drawString("- Location: South of the Andromeda Constellation",15, 400);
	g.drawString("- Story Behind: In Greek mythology, Pegasus is a divine winged stallion and the son of Poseidon. In the story of", 15, 460);
	g.drawString("Pegasus saves princess Andromeda with Perseus. He also appears in Disney's \"Hercules\".", 15, 520);
	g.drawString("- Stars: This constellation is made of 23-29 stars, including Scheat, Algenib,", 15, 580);
	g.drawString("Enif, Homam,  and the brightest star, Markaab(\"the saddle\").", 15, 640);
	g.drawString("- Other Facts: It can be seen in late winter and spring", 0, 0);
}
	public void pisces(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Pisces", 620, 80);
		goBackButton(g);
		starClicked = true;
		Image image = null;
		try {
			image = ImageIO.read(new File("Pisces.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		int startYPix = 470;
		g.drawString("- Location: It is located northeast of Aquarius and to the northwest of the constellation Cetus, and it is 14.1" , 15,startYPix);
		g.drawString("years from the Earth", 15, startYPix+40);
		g.drawString("- Story Behind: In Greek Mythology, it represents fish.",15, startYPix+80);
		g.drawString("- Stars: There are 18 main stars, including Alreascha, Fumalsamakah, and Delta Piscium.", 15, startYPix+120);
		g.drawString("- Other Facts: It was discovered by Dutch-American astronomer Adriaan van Maane in 1917. It is the 12th Zodiac", 15, startYPix+160);
		g.drawString("representing those born between February 20th and March 20th", 15, startYPix+200);
	}
	public void cetus(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Cetus", 610, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Cetus.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		int startYPix = 460;
		g.drawString("- Location: It lies in the first quadrant of the southern hemisphere, neighboring Aquarius Aries, and other", 15, startYPix);
		g.drawString("constellations. ", 15, startYPix+40);
		g.drawString("- Story Behind: In Greek Mythology, it represents a large sea monster, fish, or whale.",15, startYPix+80);
		g.drawString("- Stars: There are 14 main stars, including Menkar, Mira, and Deneb Kaitos.", 15, startYPix+120);
		g.drawString("- Other Facts: It was discovered by English astronomer William Herschel in 1783. ", 15, startYPix+160);
	}
	public void taurus(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Taurus", 560, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Taurus.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		int startYPix = 460;
		g.drawString("- Location: It is located in the 1st quadrant of the N hemisphere, neighboring Aries, Auriga, Cetus and others. ", 15, startYPix);
		g.drawString("- Story Behind: In Greek Mythology, it represents Zeus changing himself into a beautiful white bull.",15, startYPix+40);
		g.drawString("- Stars: There are an estimated 500-1,000 stars, including Aldebaran (its giant red star), Elnath, and Alcyone.", 15, startYPix+80);
		g.drawString("- Other Facts: Taurus is known for its bright stars Aldebaran, Elnath, Alcyone, and its variable star T Tauri. ", 15, startYPix+120);

	}
	public void canisMinor(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Canis Minor", 480, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Canis Minor.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		int startYPix = 460;
		int delta = 50;
		g.drawString("- Location: Located in the 2nd quadrant of the N hemisphere, neighboring Canis Major and other constellations. ", 15, startYPix);
		g.drawString("- Story Behind: It represents the smaller of the two dogs following Orion, a Greek mythology hunter.",15, startYPix+delta);
		g.drawString("- Stars: There are 2 major stars that make up this constellation, including the brightest star, Procyon.", 15, startYPix+2*delta);
		g.drawString("- Other Facts: Discovered by the Greek astronomer Ptolemy in 1000 AD, and it is the 71st Largest Constellation. ", 15, startYPix+3*delta);

	}
	public void hydra(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Hydra", 570, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Hydra.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		g.drawString("- English Name: Sea Serpent", 15,400);
		g.drawString("- Discovery: Discovered by Ptolemy in the 2nd Century", 15,450); 
		g.drawString("- Fun Fact: It is the largest constellation in the sky", 15,500);
		g.drawString("- Story Behind: In Greek mythology, it represents a water snake, where the head is located of the constellation", 15, 550);
		g.drawString("Cancer and its tail is located between Centaurus and Libra.", 15,600);
		g.drawString("- Stars: Hydra has 17 primary stars, including Alphard and Epsilon Hydrae.", 15,650);

	}
	public void sextans(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Sextans", 540, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Sextans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		int startYPix = 430;
		int delta = 50;
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		g.drawString("- English Name: Sextant", 15,startYPix);
		g.drawString("- Discovery: Discovered by Polish astronomer Johannes Hevelius in 1687.", 15,startYPix+delta);
		g.drawString("- Fun Fact: Hevelius preferred to view this constellation through the naked-eye instead of through telescopes.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: It is not associated with any myths.", 15,startYPix+3*delta);
		g.drawString("- Stars: There are 3 main stars, including Alpha Sextantis, Gamma Sextantis,  and Beta Sextantis).", 15,startYPix+4*delta);

	}
	public void leo(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Leo", 620, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Leo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 430;
		int delta = 50;
		g.drawString("- English Name: Lion", 15,startYPix);
		g.drawString("- Discovery: Discovered by Greek astronomer Ptolemy in the 2nd century.", 15,startYPix+delta);
		g.drawString("- Fun Fact: Leo is the 12th largest constellation in magnitude of an area of 947 square degrees.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: In Greek mythology, it is known as a Nemean lion who was killed by Hercules.", 15,startYPix+3*delta);
		g.drawString("- Stars: There are 13 main stars, including Regulus and Alpha Leonis.", 15,startYPix+4*delta);

	}
	public void comaBerenices(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Coma Bernices", 420, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Coma Bernices.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 410;
		int delta = 50;
		g.drawString("- English Name: Bereniceís Hair", 15,startYPix);
		g.drawString("- Discovery: Discovered by Conon of Samos in the third century.", 15, startYPix+delta);
		g.drawString("- Fun Fact: The brightest star is Beta Comae, found 30 light years from Earth.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: In mythology, it represents the beautiful hair of Queen Berenice of Egypt.", 15,startYPix+3*delta);
		g.drawString("- Fun Fact: There are 44 main stars, including Diadem, Beta Comae Berenices, and Alpha Comae Berenices.", 15,startYPix+4*delta);

	}
	public void canesVenatici(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Canes Venatici", 420, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Canes Venatici.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 410;
		int delta = 50;
		g.drawString("- English Name: Hunting Dogs", 15,startYPix);
		g.drawString("- Discovery: Discovered by Pierre Mechain in 1799.", 15,startYPix+delta);
		g.drawString("- Fun Fact; It is the 38th largest constellation.", 15,startYPix+2*delta);
		g.drawString("- Story behind: In mythology, it represents hunting dogs being bound by a leash.", 15,startYPix+3*delta);
		g.drawString("- Stars: There are 2 main stars, including La superba, Tuiren, and Canes Venatici.", 15,startYPix+4*delta);

	}
	public void leoMinor(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Leo Minor", 510, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Leo Minor.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 410;
		int delta = 50;
		g.drawString("- English Name: Little Lion", 15,startYPix);
		g.drawString("- Discovery: Discovered by Johannes Hevelius in 1687.", 15,startYPix+delta);
		g.drawString("- Fun Fact: It is the 64th Constellation in size.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: No myth is associated.", 15,startYPix+3*delta);
		g.drawString("- Stars: 46 Leonis Minoris, Beta Leonis Minoris, 21 Leonis Minoris, 10 Leonis Minoris, 37 Leonis.", 15,startYPix+4*delta);

	}
	public void ursaMajor(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Ursa Major", 480, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Ursa Major.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 520, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 380;
		int delta = 50;
		
		g.drawString("- English Name: Big Bear", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy during the 2nd century.", 15,startYPix+delta);
		g.drawString("- Fun Fact: 31st Largest Constellation.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: Associated by the myth of a nymph who was turned into a bear.", 15,startYPix+3*delta);
		g.drawString("- Fun Fact: Oldest constellation of the 88 constellations", 15,startYPix+4*delta); 
		g.drawString("- Stars: The big dipper, Epsilon Ursae Majoris, Alpha Ursae Majoris, Beta Ursae Majoris, Eta Ursae Majoris.", 15,startYPix+5*delta);

	}
	public void lynx(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Lynx", 600, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("Lynx.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 560, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 400;
		int delta = 50;
		g.drawString("- English Name: Lynx", 15,startYPix);
		g.drawString("- Discovery: Johannes Hevelius during the 17th century.", 15,startYPix+delta);
		g.drawString("- Fun Fact: 28th Largest Constellation.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: Not associated with any myths.", 15,startYPix+3*delta);
		g.drawString("- Fun Fact: It is very faint , only people with a certain vision can see this constellation as said by the story", 15, startYPix + 4*delta);
		g.drawString("- Stars: Alpha Lyncis, 31 Lyrics, 38 Lyncis.", 15,startYPix+5*delta);

	}
	public void cancer(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Cancer", 560, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("cancer 14.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix=150;
		int delta = 50;
		g.drawString("- English Name: Crab", 15,startYPix);
		g.drawString("- Disovery: Claudius Ptolemy", 15, startYPix+delta);
		g.drawString("during the 2nd century.",15,startYPix+2*delta);
		g.drawString("- Fun Fact: 31st Largest Constellation.", 15,startYPix+3*delta);
		g.drawString("- Story Behind: Represents crabs that are", 860, startYPix);
		g.drawString("  sent to kill Hercules in mythology.", 860,startYPix+delta);
		g.drawString("- Zodiac Sign: June 21 - July 22", 860,startYPix+2*delta);
		g.drawString("- Stars: Alpha Cancri, Beta Cancri,", 860,startYPix+3*delta);
		g.drawString(" Delta Cancri, Gamma Cancri.", 860,startYPix+4*delta);
	}
	//FIX GEMINI
	public void gemini(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Gemini", 580, 80);
		goBackButton(g);
		starClicked = true;
		Image image = null;
		try {
			image = ImageIO.read(new File("gemini 15.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,26));
		int startYPix=150;
		int delta = 50;
		g.drawString("- English Name: Twins", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy discovered", 15,startYPix+delta);
		g.drawString("  in 1000 AD.", 15, startYPix+2*delta);
		g.drawString("- Fun Fact: 30th  Largest Constellation.", 15,startYPix+3*delta);
		g.drawString("- Story Behind: Represents twins Castor and ", 920, startYPix);
		g.drawString("  Pollux in mythology", 920,startYPix+delta);
		g.drawString("- Zodiac Sign: May 21 - June 21.", 920,startYPix+2*delta);
		g.drawString("- Stars: Alpha Geminorum, Beta Geminorum, ", 920, startYPix+3*delta);
		g.drawString("  Gamma Geminorum, Epsilon Geminorum.", 920,startYPix+4*delta);

		
		

	}
	public void auriga(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Auriga", 560, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("auriga 16.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		g.setFont(new Font("Times New Roman",Font.PLAIN,26));
		int startYPix=150;
		int delta = 50;
		g.drawString("- English Name: Charioteer", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy in 1000 AD.", 15,startYPix+delta);
		g.drawString("- Constellation Magnitude: 21st Largest", 15, startYPix+2*delta);
		g.drawString("  Constellation", 15,startYPix+3*delta);
		g.drawString("- Stars: Has 10 named stars - Alpha Aurigae,", 860, startYPix);
		g.drawString("  Beta Aurigae, Theta Aurigae.", 860,startYPix+delta);
		g.drawString("- Fun Fact: This is named after Charioteer.", 860,startYPix+2*delta);

	}
	public void perseus(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Perseus", 560, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("perseus 17.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,26));
		int startYPix=150;
		int delta = 50;
		
		g.drawString("- English Name: Perseus, hero who ", 15, startYPix);
		g.drawString("  saved Andromeda", 15,startYPix+delta);
		g.drawString("- Discovery: Claudius Ptolemy in 1000 AD.", 15,startYPix+2*delta);
		g.drawString("- Constellation Magnitude: 24th Largest", 15, startYPix+3*delta);
		g.drawString("  Constellation.", 15,startYPix+4*delta); 
		g.drawString("- Stars: Alpha Persei, Beta Persei,", 870, startYPix);
		g.drawString("  Zeta Persei, Epsilon Persei.", 870,startYPix+delta);
		g.drawString("- Story Behind: The Greek Hero Perseus", 870,startYPix+2*delta);

	}
	public void camelopardalis(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Camelopardalis", 440, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("camelopardalis 18.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 450;
		int delta = 50;
		
		g.drawString("- English Name: Giraffe", 15,startYPix);
		g.drawString("- Petrus Plancius and Jakob Bartsch during 1624", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 18th Largest Constellation.", 15,startYPix+2*delta);
		g.drawString("- Story Behind: There were no myths with this constellation as the region was empty.", 15,startYPix+3*delta);
		g.drawString("- Stars: Beta Camelopardalis, CS Camelopardalis, VZ Camelopardalis", 15,startYPix+4*delta);

	}
	public void ursaMinor(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Ursa Minor", 475, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("ursa minor 19.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,26));
		int startYPix=150;
		int delta = 50;
		g.drawString("English Name: Little Bear", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy in 1000 AD.", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 56th Largest", 15, startYPix+2*delta);
		g.drawString("Constellation", 15, startYPix+3*delta);
		g.drawString("- Story Behind: Named after caretaker of", 840, startYPix);
		g.drawString("baby Zeus on the island of Crete who was a nymph.", 840,startYPix+delta);
		g.drawString("- Fun Facts: The north celestial pole which", 840, startYPix+2*delta);
		g.drawString("  is the north star polaris", 840,startYPix+3*delta);
		g.drawString("- Stars: Polaris, Beta Ursae Minoris, Gamma Ursae", 840, startYPix+4*delta);
		g.drawString("  Minoris, Delta Ursae Minoris, Zeta Ursae Minoris", 840,startYPix+5*delta);

	}
	public void draco(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Draco", 610, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("draco 20.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 450;
		int delta = 50;
		g.drawString("- English Name: Dragon", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy discovered it in 1000 AD.", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 8th Largest Constellation", 15,startYPix+2*delta);
		g.drawString("- Story Behind: Named after the dragon in Hesperides mythology.", 15,startYPix+3*delta);
		g.drawString("- Stars: Gamma Draconis, Beta Draconis, Delta Draconis, Zeta Dracronis", 15,startYPix+4*delta);

	}
	public void cepheus(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Cepheus", 500, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("cepheus 21.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 520, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 450;
		int delta = 50;
		g.drawString("- English Name: King of Ethiopia", 15,startYPix);
		g.drawString("- Discovery: Claudius Ptolemy during 2nd century", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 27th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Greek Association:  Named after King Cepheus ", 15, startYPix+3*delta);
		g.drawString("- Main Stars:Alpha Cephei, Beta Cephei, Gamma Cephei, Zeta Cephei", 15, startYPix+4*delta);
	}
	public void cassiopeia(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Cassiopeia", 500, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("cassiopeia 22.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 460, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 450;
		int delta = 50;
		g.drawString("- English Name: Queen of Ethiopia", 15,startYPix);
		g.drawString("- Discovery: Discovered by Claudius Ptolemy during 2nd century", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 25th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Main Stars:Alpha Cassiopeiae, Beta Cassiopeiae, Gamma Cassiopeiae, and Delta Cassiopeiae", 15, startYPix+3*delta);
		
	}
	public void triangulum(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Triangulum", 500, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("triangulum 23.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 490, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 420;
		int delta = 50;
		g.drawString("- English Name: Triangle", 15, startYPix);
		g.drawString("- Discovery: Discovered by Claudius Ptolemy during 2nd century", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 78th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Shape: Resembles a triangle", 15, startYPix+3*delta);
		g.drawString("- Greek Association : Resembles the delta symbol and it was originally named by Deltoton", 15, startYPix+4*delta);
		g.drawString("- Main Stars: Beta Trianguli, Alpha Trianguli, Gamma Trianguli, Delta Trianguli", 15, startYPix+5*delta);
	}
	public void aries(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Aries", 600, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("aries 24.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 500, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,30));
		int startYPix = 400;
		int delta = 50;
		g.drawString("- English Name: Ram", 15, startYPix);
		g.drawString("- Discovery: Discovered by Claudius Ptolemy during 2nd century", 15, startYPix+delta);
		g.drawString("- Constellation Magnitude: 39th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Zodiac Months: March 21- April 19", 15, startYPix+3*delta);
		g.drawString("- Shape: Shaped like a rams horn", 15, startYPix+4*delta);
		g.drawString("- Main Stars: Alpha Arietis, Beta Arietis, Gamma Arietis, Delta Arietis", 15, startYPix+5*delta);
		
	}
	public void andromeda(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Andromeda", 495, 80);
		goBackButton(g);
		starClicked = true;
		
		Image image = null;
		try {
			image = ImageIO.read(new File("andromeda 25.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 450, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,25));
		int startYPix=150;
		int delta = 50;
		g.drawString("- English Name: Princess of Ethiopia", 15, startYPix);
		g.drawString("- Discovery: Claudius Ptolemy in 1000 AD", 15, startYPix+delta);
		g.drawString("- Size: 19th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Mythical Association: Mythical Princess", 930, startYPix);
		g.drawString("  Andromeda", 930, startYPix+delta);
		g.drawString("- Main Stars: Alpha Andromedae, Beta, ", 930, startYPix+2*delta);
		g.drawString("  Andromedae, Gamma Andromedae, ", 930, startYPix+3*delta);
		g.drawString("  Delta Andromedae", 930, startYPix+4*delta);
	}
	public void lacerta(Graphics g) {
		drawBackground(g, DARK_BLUE, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Times New Roman",Font.BOLD,80));
		g.drawString("Lacerta", 550, 80);
		goBackButton(g);
		starClicked = true;
		Image image = null;
		try {
			image = ImageIO.read(new File("lacerta 26.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image, 470, 110,this);
		
		g.setFont(new Font("Times New Roman",Font.PLAIN,26));
		int startYPix=150;
		int delta = 50;
		g.drawString("- English Name: Lizard", 15, startYPix);
		g.drawString("- Discovery:  Johannes Hevelius in 1687", 15, startYPix+delta);
		g.drawString("- Size: 68th Largest Constellation ", 15, startYPix+2*delta);
		g.drawString("- Shape: Shaped like a W", 900, startYPix);
		g.drawString("- Main Stars: Alpha Lacertae, Beta Lacertae,", 900, startYPix+delta);
		g.drawString("EV, Lacertae", 900, startYPix+2*delta);
	}

	
	private class Keyboard implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			//if up key is pressed ball goes up
			
		}
			
			
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	private class Mouse implements MouseListener {

		@Override

		public void mouseClicked(MouseEvent e) {
			System.out.println("X: " + e.getX() + " Y: " + e.getY());
			if(!starClicked && (e.getX()>= 174 && e.getX() <= 254) && (e.getY() >= 528 && e.getY() <= 558)) {
				pegasus(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 160 && e.getX() <= 240) && (e.getY() >= 261 && e.getY() <= 291)) {
				pisces(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 210 && e.getX() <= 290) && (e.getY() >= 20 && e.getY() <= 50)) {
				cetus(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 528 && e.getX() <= 608) && (e.getY() >= 67 && e.getY() <= 97)) {
				taurus(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 871 && e.getX() <= 951) && (e.getY() >= 17 && e.getY() <= 47)) {
				canisMinor(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 1213 && e.getX() <= 1293) && (e.getY() >= 90 && e.getY() <= 120)) {
				hydra(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 1196 && e.getX() <= 1276) && (e.getY() >= 196 && e.getY() <= 226)) {
				sextans(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 1067 && e.getX() <= 1147) && (e.getY() >= 325 && e.getY() <= 355)) {
				leo(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 1055 && e.getX() <= 1135) && (e.getY() >= 602 && e.getY() <= 632)) {
				comaBerenices(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 948 && e.getX() <= 1028) && (e.getY() >= 558 && e.getY() <= 588)) {
				canesVenatici(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 945 && e.getX() <= 1025) && (e.getY() >= 355 && e.getY() <= 385)) {
				leoMinor(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 843 && e.getX() <= 923) && (e.getY() >= 444 && e.getY() <= 474)) {
				ursaMajor(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 806 && e.getX() <= 886) && (e.getY() >= 290 && e.getY() <= 320)) {
				lynx(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 930 && e.getX() <= 1010) && (e.getY() >= 165 && e.getY() <= 195)) {
				cancer(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 778 && e.getX() <= 858) && (e.getY() >= 122 && e.getY() <= 152)) {
				gemini(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 633 && e.getX() <= 713) && (e.getY() >= 189 && e.getY() <= 219)) {
				auriga(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 511 && e.getX() <= 591) && (e.getY() >= 249 && e.getY() <= 279)) {
				perseus(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 593 && e.getX() <= 673) && (e.getY() >= 369 && e.getY() <= 399)) {
				camelopardalis(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 669 && e.getX() <= 749) && (e.getY() >= 544 && e.getY() <= 574)) {
				ursaMinor(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 668 && e.getX() <= 748) && (e.getY() >= 633 && e.getY() <= 663)) {
				draco(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 513 && e.getX() <= 593) && (e.getY() >= 530 && e.getY() <= 560)) {
				cepheus(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 477 && e.getX() <= 557) && (e.getY() >= 417 && e.getY() <= 447)) {
				cassiopeia(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 389 && e.getX() <= 469) && (e.getY() >= 257 && e.getY() <= 287)) {
				triangulum(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 336 && e.getX() <= 416) && (e.getY() >= 204 && e.getY() <= 234)) {
				aries(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 349 && e.getX() <= 429) && (e.getY() >= 345 && e.getY() <= 375)) {
				andromeda(g);
				repaint();
			}
			if(!starClicked &&(e.getX()>= 384 && e.getX() <= 464) && (e.getY() >= 549 && e.getY() <= 579)) {
				lacerta(g);
				repaint();
			}
			if(starClicked &&(e.getX()>= 15 && e.getX() <= 365) && (e.getY() >= 680 && e.getY() <= 750)) {
				mainPage(g);
				starClicked = false;
				repaint();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
		

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	
	public static void main(String [] args) {
		JFrame frame = new JFrame("Shooting Stars");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new SpaceView());
		frame.setVisible(true);
	}
}

