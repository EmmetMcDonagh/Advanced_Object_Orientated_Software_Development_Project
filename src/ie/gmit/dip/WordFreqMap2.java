package ie.gmit.dip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Displays the words (from TagCloud.txt) in a frequency table in descending
 * order using a HashMap
 */
public class WordFreqMap2 extends wordcloud {

	public WordFreqMap2() {
		super();
	}

	/**
	 * display word frequency count Inserting into a HashMap - Running Time:
	 * O(1)/O(log n) for HashMap
	 */

	public void WordFreqmap2() {

		File f = new File("./TextFile/TagCloud.txt");

		Scanner s = null;
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		HashMap<String, Integer> wordfrequency = new HashMap<String, Integer>();
		// HashMap to store words

		while (s.hasNext())

		{

			String temp = s.next();

			if (wordfrequency.get(temp) == null)

				wordfrequency.put(temp, 0);

			int count = wordfrequency.get(temp) + 1;

			wordfrequency.put(temp, count);

		}

		for (int i = 0; i < 30; i++)

		{

			String max = "";

			for (String x : wordfrequency.keySet())

			{

				if (max.equals("") || wordfrequency.get(max) < wordfrequency.get(x))

					max = x;

			}
			// prints to the console
			System.out.print(ConsoleColour.GREEN);
			System.out.println(max + " -Word Frequency count- " + wordfrequency.get(max));

			wordfrequency.put(max, -wordfrequency.get(max));

		}

	}

}