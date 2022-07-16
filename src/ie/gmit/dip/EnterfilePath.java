package ie.gmit.dip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The user will be able to select a text file from its own machine, typing the
 * full path and entering a name to save the new file. This file will be saved
 * in a folder called << Output >>, which is located in the src folder.
 */

public class EnterfilePath extends IgnoreWords {
	/**
	 * method which prompts the user to specify the file path that reads in a file,
	 * therefore a File class is imported. When executing read/write operations also
	 * known as I/O or exception handling, errors might occur in the code. To handle
	 * the errors, the IOException class has been imported into menu.class and a
	 * try-catch block is used. 
	 */
	public EnterfilePath() {
		super();
	}

	public void EnterFilePath() {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		
		System.out.print(ConsoleColour.GREEN);
		
		System.out.print("[INFO] Enter input file name: ");
		
		System.out.println("./TextFile/TagCloud.txt   ");
		
		String filename_in = sc.nextLine();

		System.out.print("[INFO] Enter output file name: ");

		sc.nextLine();

		File file = new File(filename_in);

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("./Output/output.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {

			pw.print(sc.nextLine() + "\n");

		}

		pw.close();

	}

}