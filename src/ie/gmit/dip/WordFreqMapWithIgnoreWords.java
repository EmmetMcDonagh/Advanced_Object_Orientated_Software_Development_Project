package ie.gmit.dip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Removes ignorewords listed in ignorewords.txt from the file (TagCloud.txt)
 * and produces a table of the most frequency words found in the text The output
 * is in decreasing usage of words.
 */

public class WordFreqMapWithIgnoreWords extends WordFreqMap {

	public WordFreqMapWithIgnoreWords() {
		super();
	}

	/**
	 * display word frequency table of the file TagCloud.txt with ignorewords taken
	 * out. Inserting into a HashMap - Running Time: O(1)/O(log n) for HashMap
	 */
	public void WordFreqMapWithStopWords() {
		// read file TagCloud.txt */
		File f = new File("TextFile/TagCloud.txt");

		// read file ignorewords.txt
		File f2 = new File("IgnoreWords/ignorewords.txt");

		Scanner s = null;
		{

			try {
				s = new Scanner(f);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			Scanner s2 = null;

			try {

				s2 = new Scanner(f2);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			// display the words in a frequency table in descending order, in the list view

			HashSet<String> set = new HashSet<String>();

			HashMap<String, Integer> wordfrequency = new HashMap<String, Integer>();
			// Hashmap to store words */

			while (s2.hasNext()) {

				String t = s2.next();

				set.add(t);
			}

			while (s.hasNext())

			{

				String temp = s.next();

				if (set.contains(temp))

					continue;

				else {
					// add non space words to array list */

					if (wordfrequency.get(temp) == null)

						wordfrequency.put(temp, 0);

					int count = wordfrequency.get(temp) + 1;

					wordfrequency.put(temp, count);
				}

			}
			// get last index of string stopwordlist.get(i) from wordlstUpper */
			for (int i = 0; i < 30; i++)

			{

				String max = "";

				for (String x : wordfrequency.keySet())

				{

					if (max.equals("") || wordfrequency.get(max) < wordfrequency.get(x))

						max = x;

				}

				// display word frequency table of the file TagCloud.txt with stopwords taken
				// out
				System.out.print(ConsoleColour.GREEN);

				System.out.println(max + " -Word Frequency count- " + wordfrequency.get(max));

				wordfrequency.put(max, -wordfrequency.get(max));
			}

		}

	}

}