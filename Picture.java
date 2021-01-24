import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Picture {
	
	// declare variables
	private double x;		// x-coordinate (center)
	private double y;		// y-coordinate (center)
	private double width;	// width of pic
	private double height;	// height of pic
	private double xSpeed;	// x-speed: change in x
	private double ySpeed;	// y-speed: change in y
	
	// constructors
	//default
	/**
	 * Default constructor
	 * Create Picture at (15,15)
	 * Width and Height at 10
	 * Speed at 1
	 */
	public Picture() {
		this.x = 15;
		this.y = 15;
		this.width = 10;
		this.height = 10;
		this.xSpeed = 1;
		this.ySpeed = 1;
	}
	
	// six parameters
	/**
	 * @param x (x-coord (center))
	 * @param y (y-coord (center))
	 * @param width
	 * @param height
	 * @param xSpeed: set to 0
	 * @param ySpeed: set to 0
	 */
	public Picture(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.xSpeed = 0;
		this.ySpeed = 0;
	}

	
	// getters and setters for all private variables
	/**
	 * Returns the x-coordinate of the Picture
	 * @return the x-coordinate of the Picture
	 */
	public double getX() {
		return x;
	}

	/**
	 * Set the x-coordinate of the Picture
	 * @param the x-coordinate of the Picture
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Returns the y-coordinate of the Picture
	 * @return the y-coordinate of the Picture
	 */
	public double getY() {
		return y;
	}

	/**
	 * Set the y-coordinate of the Picture
	 * @param the y-coordinate of the Picture
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Returns the width of the Picture
	 * @return the width of the Picture
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Set the width of the Picture
	 * @param the width of the Picture
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Returns the height of the Picture
	 * @return the height of the Picture
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set the height of the Picture
	 * @param the height of the Picture
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the xSpeed of the Picture
	 * @return the xSpeed of the Picture
	 */
	public double getXSpeed() {
		return xSpeed;
	}

	/**
	 * Set the xSpeed of the Picture
	 * @param the xSpeed of the Picture
	 */
	public void setXSpeed(double xSpeed) {
		this.xSpeed = xSpeed;
	}

	/**
	 * Returns the ySpeed of the Picture
	 * @return the ySpeed of the Picture
	 */
	public double getYSpeed() {
		return ySpeed;
	}

	/**
	 * Set the ySpeed of the Picture
	 * @param the ySpeed of the Picture
	 */
	public void setYSpeed(double ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	/**
	 * draws the image
	 * center at (x,y)
	 * @param g
	 * @param file
	 */
	public void draw(Graphics g, String file) {
		ImageIcon image = new ImageIcon(file);
		g.drawImage(image.getImage(), (int)(getX() - width/2), (int)(getY() - height/2), (int)(getWidth()), (int)(getHeight()), null);
	}
	
	/**
	 * moves the Picture with Speed
	 * goes opposite speed when in contact with edges
	 * @param rightEdge
	 * @param bottomEdge
	 */
	public void move(int rightEdge, int bottomEdge) {
		if (getX() >= rightEdge - getWidth() || x <= 0)
		{
			getXSpeed();
			xSpeed = xSpeed * -1;
			setXSpeed(xSpeed);
		}
		else
		{
		}
		setX(getX() + getXSpeed());
		
		if (getY() >= bottomEdge - getHeight() || y <= 0)
		{
			getYSpeed();
			ySpeed = ySpeed * -1;
			setYSpeed(ySpeed);
		}
		else
		{
		}
		setY(getY() + getYSpeed());
	}

	/**
	 * respawns the Picture at a new, random location
	 * @param rightEdge
	 * @param bottomEdge
	 */
	public void respawn(int rightEdge, int bottomEdge) {
		this.setX((int) (Math.random()*rightEdge));
		this.setY((int) (Math.random()*bottomEdge));
	}

}


