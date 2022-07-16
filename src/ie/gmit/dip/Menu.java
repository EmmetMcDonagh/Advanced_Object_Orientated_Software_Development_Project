package ie.gmit.dip;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Inside the menu class, there are different methods each displaying a prompt
 * to process the user response. Scanner is imported to read in the filename.
 * The menu is kept alive inside a loop. When (4) is selected, the loop control
 * is set to false. Inside the code, contains next() and then when inputting a
 * number to select a menu choice, if the number entered is incorrect I have it
 * in the loop to sysout "[ERROR] invalid input".
 **/

public class Menu extends WordFreqMap2 {

	public static void main(String[] args) {
	}

	private Scanner s;
	private boolean keepRunning = true;

	/**
	 * The line s = new Scanner(System.in)is called once, inside a method called
	 * public menu()
	 * 
	 * @return
	 **/

	public Menu() {

		s = new Scanner(System.in);
	}

	private void wordCloud2() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
					ex.printStackTrace();
				}

				JFrame frame = new JFrame("Word Cloud");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new WordCloudMap());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	public class WordCloudMap extends JPanel {

		/**
		 * draw random text with fontSize based on word frequency on the BufferedImage
		 */
		private static final long serialVersionUID = 1L;
		private BufferedImage img;

		public WordCloudMap() {
			img = new BufferedImage(1200, 650, BufferedImage.TYPE_INT_ARGB);
			try (BufferedReader br = new BufferedReader(new FileReader(new File("./WordCloudMap/WordCloudMap.txt")))) {
				List<String> words = new ArrayList<>(30);
				String text = null;
				System.out.print(ConsoleColour.GREEN);
				System.out.println("Read in text file WordCloudMap.txt");
				while ((text = br.readLine()) != null) {
					words.add(text);
				}
				System.out.print(ConsoleColour.GREEN);
				System.out.println("Loaded text file " + words.size());

				Collections.sort(words);

				Random rnd = new Random();
				Font font = getFont();
				Graphics2D g2d = img.createGraphics();
				g2d.setColor(Color.WHITE);
				g2d.fillRect(0, 0, 1200, 650);

				List<Rectangle2D> used = new ArrayList<>(30);
				for (String word : words) {
					int size = rnd.nextInt(37) + 11;
					Font produceFont = font.deriveFont((float) size);
					FontMetrics fm = g2d.getFontMetrics(produceFont);
					Rectangle2D bounds = fm.getStringBounds(word, g2d);
					System.out.print(ConsoleColour.GREEN);
					System.out.println("arranging " + word);
					do {
						int xPos = rnd.nextInt(1200 - (int) bounds.getWidth());
						int yPos = rnd.nextInt(650 - (int) bounds.getHeight());

						bounds.setFrame(xPos, yPos, bounds.getWidth(), bounds.getHeight());
					} while (collision(used, bounds));
					used.add(bounds);
					g2d.setFont(produceFont);
					g2d.setColor(Color.BLUE);
					g2d.drawString(word, (float) bounds.getX(), (float) bounds.getY() + fm.getAscent());
					g2d.draw(bounds);
				}
				g2d.dispose();
			} catch (IOException exp) {
				exp.printStackTrace();
			}
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(1200, 650);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.drawImage(img, 0, 0, this);
			g2d.dispose();
		}

		protected boolean collision(List<Rectangle2D> used, Rectangle2D bounds) {
			boolean collides = false;
			for (Rectangle2D check : used) {
				if (bounds.intersects(check)) {
					collides = true;
					break;

				}
			}

			return collides;
		}

	}

	private void Quit() {
		System.out.println(ConsoleColour.BLUE);
		System.out.println("(8) Quit");
	}

	public void start() {

		while (keepRunning) {
			// the menu is kept alive inside a loop. */
			showOptions();
			int choice = Integer.parseInt((s.next()));

			if (choice == 1) {
				EnterFilePath();

			} else if (choice == 2) {
				stopwords();

			} else if (choice == 3) {
				WordFrequencyMap();

			} else if (choice == 4) {
				WordFreqMapWithStopWords();

			} else if (choice == 5) {
				WordCloud();

			} else if (choice == 6) {
				WordFreqmap2();

			} else if (choice == 7) {
				wordCloud2();

			} else if (choice == 8) {
				Quit();
				System.out.print(ConsoleColour.RED_BACKGROUND_BRIGHT);
				System.out.println("[INFO] Shutting down...please wait...");
				keepRunning = false;
				// When (7) is selected, the loop control variable is set to false

			} else {
				System.out.print(ConsoleColour.RED_BACKGROUND_BRIGHT);
				System.out.println("[ERROR] invalid input");
				System.out.println("Please enter a value between 1 and 8 ");
			}

		}
	}

	private void showOptions() {
		System.out.println(ConsoleColour.BLUE); // To print colour in the console, the ANSI escape codes are used to use
												// colour in the output

		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*        Generating a Word Cloud from Text        *");
		System.out.println("*     H.Dip in Science (Software Development)     *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		System.out.println("(1) Load a new File "); // Asks the user to specify the file to process.
		System.out.println("(2) Remove ignorewords listed in ignorewords.txt from the file (TagCloud.txt)");
		System.out.println("(3) Determine the most frequent words in the file (TagCloud.txt)");
		System.out.println("(4) Determine the most frequent words in the file (TagCloud.txt) with Stop Words removed");
		System.out.println(
				"(5) Generate Word Cloud of the most frequent words in the file (TagCloud.txt) with Stop Words removed ");
		System.out.println("(6) [Extra] Determine the most frequent words in the file (TagCloud.txt) using a HashMap");
		System.out.println("(7) [Extra] Draw random text with fontSize based on word frequency on the BufferedImage ");
		System.out.println("(8) Quit ");
		System.out.println("Select an option (1-7)>");
		System.out.print(ConsoleColour.BLUE);

		System.out.println(ConsoleColour.RESET);
	}

}
