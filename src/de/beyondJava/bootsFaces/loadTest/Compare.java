package de.beyondJava.bootsFaces.loadTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Compare {

	public static void main(String[] args) throws IOException {
		File in = new File("riccardo.txt");
		File out = new File("riccardo-compact.txt");
		readFile1(in, out);
		in = new File("stephan.txt");
		out = new File("stephan-compact.txt");
		readFile1(in, out);
	}

	private static void readFile1(File fin, File fout) throws IOException {
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.contains("staff")) {
				int pos = line.indexOf("staff") + 6;
				line = line.substring(pos);
				pos = line.lastIndexOf(' ');
				line = line.substring(0, 8) + line.substring(pos);
			}
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
