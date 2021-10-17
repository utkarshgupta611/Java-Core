package com.prvt.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		String sourceFile = "File/loreamIspun.txt";
		String targetFile = "File/target1.txt";

		try (
				FileReader fReader = new FileReader(sourceFile);
				BufferedReader bReader = new BufferedReader(fReader);
				FileWriter writer = new FileWriter(targetFile);
				) {
			while (true) {
				String line = bReader.readLine();
				if (line == null) {
					break;
				}
				writer.write(line);
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
