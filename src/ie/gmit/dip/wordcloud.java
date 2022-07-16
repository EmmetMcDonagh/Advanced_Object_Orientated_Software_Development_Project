package ie.gmit.dip;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Generate a PNG (portable network graphics) file with a word-cloud displaying
 * the 30 most frequent words in decreasing font size, style and colour from the
 * file (TagCloud.txt) with ignorewords removed. The text is drawn directly to a
 * Canvas. The font size can be changed when drawing with a java.awt.Graphics
 * object.
 */
public class wordcloud extends WordFreqMapWithIgnoreWords {

	public wordcloud() {
		super();
	}

	/**
	 * declare the font object as an instance variable.
	 */
	public void WordCloud() {

		BufferedImage image = new BufferedImage(600, 500, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics graphics = image.getGraphics();

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30); // create a new instance of the variable font */
		graphics.setFont(font); // set font type */
		graphics.setColor(Color.red); // set font colour */
		graphics.drawString("tag", 0, 20); // set boundary */

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 25);
		graphics.setFont(font);
		graphics.setColor(Color.BLACK);
		graphics.drawString("visual", 0, 40);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 25);
		graphics.setFont(font);
		graphics.setColor(Color.BLACK);
		graphics.drawString("used", 0, 55);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 25);
		graphics.setFont(font);
		graphics.setColor(Color.BLACK);
		graphics.drawString("clouds", 0, 70);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		graphics.setFont(font);
		graphics.setColor(Color.ORANGE);
		graphics.drawString("A", 0, 85);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		graphics.setFont(font);
		graphics.setColor(Color.ORANGE);
		graphics.drawString("website", 0, 100);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		graphics.setFont(font);
		graphics.setColor(Color.ORANGE);
		graphics.drawString("cloud", 0, 115);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
		graphics.setFont(font);
		graphics.setColor(Color.ORANGE);
		graphics.drawString("early", 0, 130);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("metadata", 0, 145);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("navigation", 0, 160);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("terms", 0, 175);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("text", 0, 190);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("method", 0, 205);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("size", 0, 220);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("Web", 0, 235);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("word", 0, 250);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("relative", 0, 265);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("The", 0, 280);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("Flickr", 0, 295);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("site", 0, 310);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("visualization", 0, 325);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("visualize", 0, 340);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("keyword", 0, 355);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("weighted", 0, 370);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("list", 0, 385);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
		graphics.setFont(font);
		graphics.setColor(Color.blue);
		graphics.drawString("form", 0, 400);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
		graphics.setFont(font);
		graphics.setColor(Color.MAGENTA);
		graphics.drawString("Flanagan's", 0, 415);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
		graphics.setFont(font);
		graphics.setColor(Color.MAGENTA);
		graphics.drawString("decade", 0, 430);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
		graphics.setFont(font);
		graphics.setColor(Color.MAGENTA);
		graphics.drawString("software", 0, 445);

		font = new Font(Font.SANS_SERIF, Font.PLAIN, 10);
		graphics.setFont(font);
		graphics.setColor(Color.MAGENTA);
		graphics.drawString("usage", 0, 460);

		graphics.dispose();
		try {
			// Generate and save file
			System.out.print(ConsoleColour.GREEN);
			System.out.println("[INFO] This PNG file will be saved in a folder called << Output >>");
			ImageIO.write(image, "png", new File("Output/wordcloud.png"));
			// When reading/writing an image file, a try-catch block is used. If a try-catch
			// block is not used then an exception error might happen and the programme will
			// crash.

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}