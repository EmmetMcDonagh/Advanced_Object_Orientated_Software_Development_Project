package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ParserTest {
	
	public static void main(String[] args) {
		
	}

	Set<String> ignorewords = new TreeSet<>();
	Map<String, Integer> wordMap = new HashMap<>();

	public void parse(InputStream in) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./ignorewords/ignorewords.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String s : words) {

					if (!ignorewords.contains(s)) {

					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
