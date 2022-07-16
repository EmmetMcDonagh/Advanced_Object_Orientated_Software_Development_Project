package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Read in file (TagCloud.txt) and return a Tree Map of the most frequently used
 * words (all in lower case) contained in the text.
 */

public class WordFreqMap extends EnterfilePath {

	public WordFreqMap() {
		super();
	}

	/**
	 * display word frequency count 
	 * Check for key in a TreeMap - Running Time:
	 * O(1)/O(log n)
	 */

	public void WordFrequencyMap() {

		try {
			@SuppressWarnings("unused")
			int number_of_words = 0;
			int i = 0;
			TreeMap<String, Integer> wordFreqMap = generateWordFrequencyTable();
			for (String key : wordFreqMap.keySet()) {
				number_of_words += wordFreqMap.get(key);
			}

			for (String key : wordFreqMap.keySet()) {
				System.out.print(ConsoleColour.GREEN);
				System.out.println(i + ")" + " Frequency  =" + wordFreqMap.get(key) + "\t" + "word=" + key);
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static TreeMap<String, Integer> generateWordFrequencyTable() throws IOException {
		// Initialize a tree map */

		TreeMap<String, Integer> WordFrequency = new TreeMap<String, Integer>();
		String file = "./TextFile/TagCloud.txt";
		// read in the file (TagCloud.txt) using Buffered Reader */

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split("\\s+");
			for (String token : tokens) {
				token = removePunctuation(token);
				// Find if the word is present in map then increase the frequency else add new
				// record with its frequency as 1

				if (!WordFrequency.containsKey(token.toLowerCase())) {
					WordFrequency.put(token.toLowerCase(), 1);
				} else {
					int count = WordFrequency.get(token.toLowerCase());
					WordFrequency.put(token.toLowerCase(), count + 1);
				}
			}
		}
		return WordFrequency;
	}

	private static String removePunctuation(String token) {
/// If your file contains punctuations other than , and . then include more replace all
		token = token.replaceAll("[^a-zA-Z]", "");
		return token;
	}
}