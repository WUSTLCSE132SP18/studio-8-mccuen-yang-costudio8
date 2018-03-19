package studio8;

import java.io.File;
import java.io.File.*;
import java.util.Scanner;

public class CountSteps {
	// TODO: Develop an algorithm to count steps in accelerometer data
	// Major steeps:
	// 1. Create a class and main method.
	// 2. Using a Scanner and File object, read data from your .csv file.
	// 3. Develop and test algorithms to count the "peaks" in the data.
	private Scanner scanner;
	final private File file;

	public CountSteps() throws Exception {
		file = new File("CSE132-studio8/data/step.csv");
		scanner = new Scanner(file);
	}

	public void main(String[] args) {

		while (scanner.hasNextLine()) {
			String[] data = scanner.nextLine().split(",");
			int z = Integer.parseInt(data[2]);
		}
	}

}