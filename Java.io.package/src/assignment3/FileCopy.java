package assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("filename23.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("outfile.txt");
		String line;

		int lineNum = 0;
		while ((line = br.readLine()) != null) {

			if (lineNum > 1) {

				if (line.trim().length() > 0) {
					line = line.trim().replaceAll("\\s+", " ") + " ";
				}
			} else {
				line = line.trim().replaceAll("\\s", "");
				line = line + "\n";
			}
			fw.write(line);
			lineNum++;
		}
		fr.close();
		fw.close();
	}

}
