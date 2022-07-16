package ie.gmit.dip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Ignore words are high-frequency words that are removed the representation of
 * natural language data. Method written that Removes ignorewords listed in
 * ignorewords.txt from the file (TagCloud.txt) and returns non stop words in an
 * arraylist
 */

public class IgnoreWords {

	public IgnoreWords() {
		super();
	}

	/**
	 * Generates a set for the stop words using a HashSet Inserting into a ArrayList
	 * - Running Time: O(n)
	 */

	public void stopwords() {

		try {

			Scanner ignoreWordsFile = new Scanner(new File("./IgnoreWords/ignorewords.txt"));

			Scanner textFile = new Scanner(new File("./TextFile/TagCloud.txt"));

			Set<String> ignorewords = new HashSet<String>();

			// to store ignore words For each word in the file

			// For each word in the ignoreWords file

			while (ignoreWordsFile.hasNext()) {

				ignorewords.add(ignoreWordsFile.next().trim().toLowerCase());
			}

			// split line to words Splits strings and stores each word into an Array list

			ArrayList<String> words = new ArrayList<String>();

			while (textFile.hasNext()) {

				words.add(textFile.next().trim().toLowerCase());
			}

			// Generate an empty Array list (a list because it allows duplicates)

			ArrayList<String> listOfWords = new ArrayList<String>();

			// Iterate over the array */

			for (String word : words) {

				// Converts current string index to lowercase */

				String toCompare = word.toLowerCase();

				// If the word isn't a stop word, add to listOfWords list */

				if (!ignorewords.contains(toCompare)) {

					listOfWords.add(word);
				}
			}

			ignoreWordsFile.close();

			textFile.close();

			for (String str : listOfWords) {
				// prints to the console
				System.out.print(ConsoleColour.GREEN);
				System.out.print(str + " ");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}
	}

}