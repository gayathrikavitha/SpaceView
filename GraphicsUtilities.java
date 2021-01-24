import java.awt.Color;
import java.awt.Graphics;

public class GraphicsUtilities {

	/**
	 * Draws a rectangle of the given color from (0, 0) with the given width and height
	 * @param g the Graphics object
	 * @param color the Color of the background
	 * @param width the width of the rectangle
	 * @param height the height of the background
	 */
	public static void drawBackground(Graphics g, Color color, int width, int height) {
		g.setColor(color);
		g.fillRect(0, 0, width, height);
		
		//pegasus
		g.drawString("Location: South of the Andromeda Constellation",0, 0);
		g.drawString("Story Behind: In Greek mythology, Pegasus is a divine winged stallion and the son of Poseidon. In the story of Perseus, Pegasus saves princess Andromeda with Perseus. He also appears in Disney's \"Hercules\".", 0, 0);
		g.drawString("Stars: This constellation is made of 23-29 stars, including Scheat, Algenib, Enif, Homam,  and the brightest star, Markaab(\"the saddle\"). ", 0, 0);
		g.drawString("Other Facts: It can be seen in late winter and spring", 0, 0);
		
		//pisces
		g.drawString("Location: It is located northeast of Aquarius and to the northwest of the constellation Cetus, and it is 14.1 light years from the Earth", 0, 0);
		g.drawString("Story Behind: In Greek Myhtology, it represents fish.",0, 0);
		g.drawString("Stars: There are 18 main stars, inclduing Alreascha, Fumalsamakah, and Delta Piscium.", 0, 0);
		g.drawString("Other Facts: It was discovered by Dutch-American astronomer Adriaan van Maane in 1917. It is the 12th Zodiac Sign, representing those born between February 20th and March 20th", 0, 0);
		
		//Cetus
		g.drawString("Location: It lies in the first quadrant of the southern hemisphere, neighboring Aquarius Aries, and other constellations. ", 0, 0);
		g.drawString("Story Behind: In Greek Myhtology, it represents a large sea monster, fish, or whale.",0, 0);
		g.drawString("Stars: There are 14 main stars, inclduing Menkar, Mira, and Deneb Kaitos.", 0, 0);
		g.drawString("Other Facts: It was discovered by English astronomer William Herschel in 1783. ", 0, 0);
		
		//Taurus
		g.drawString("Location: It is located in the first quadrant of the northern hemisphere, neighboring Aries, Auriga, Cetus and others. ", 0, 0);
		g.drawString("Story Behind: In Greek Mythology, it represents Zeus changing himself into a beautiful white bull.",0, 0);
		g.drawString("Stars: There are an estimated 500-1,000 stars, including Aldebaran (its giant red star), Elnath, and Alcyone.", 0, 0);
		g.drawString("Other Facts: It was dTaurus is known for its bright stars Aldebaran, Elnath, and Alcyone, as well as for the variable star T Tauri. ", 0, 0);
		

		
	}
	

	
	/**
	 * Creates a grid of vertical and horizontal lines starting at (0,0) to the given 
	 * width and height at the given interval.
	 * @param g the Graphics object
	 * @param color the color of the lines
	 * @param width the width of the grid
	 * @param height the height of the grid
	 * @param increment the distance between each line
	 */
	public static void drawGrid(Graphics g, Color color, int width, int height, int increment) {
		
	}
}
