package assignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriterClass {

	public static void main(String[] args) {

		 try {
		      File myObj = new File("filename1.txt");
		      Date obj=new Date();
		      double num=98374.65;
		      long lng=42544444;
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		      FileWriter myWriter = new FileWriter(myObj.getPath());
		      
		      
		      System.out.println("Writing date to file");
		      myWriter.write(obj.toString());
		      myWriter.write("\n");
		      
		      
		      System.out.println("Writing Double to file");
		      myWriter.write(Double.toString(num));
		      myWriter.write("\n");

		      System.out.println("Writing Long to file");
		      myWriter.write(Long.toString(lng));
		      
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 System.out.println();
		 
		 System.out.println("*****Printing data from Files*******");
		 try {
		      File myObj = new File("filename1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
