package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		Random r = new Random();
		int low = 1;
		int high = 30;

		try {
			File myObj = new File("filename23.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			FileWriter myWriter = new FileWriter("filename23.txt");

			for (int i = 0; i < 30; i++) {
				int n = r.nextInt(high - low) + low;
				myWriter.write(String.valueOf(n));
				myWriter.write("\n");
			}
			myWriter.close();
			int sum = 0;
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				for (int i = 0; i < 10; i++) {
					String data = myReader.nextLine();
					sum += Integer.valueOf(data);
				}
				System.out.println("Sum is " + sum + " Average is" + sum / 10);
				sum=0;
			}
			
			myReader.close();

		} catch (

		Exception e) {

		}

		int result = r.nextInt(high - low) + low;

	}

}
