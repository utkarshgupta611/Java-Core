package com.prvt.fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class UsingfFilePath {

	public static void main(String[] args) {
		Path sourceFile = Paths.get("File", "LoreamIspun.txt");
		Path targetFile = Paths.get("File", "Target2.txt");
		
		try {
			Files.copy(sourceFile, targetFile, StandardCopyOption.COPY_ATTRIBUTES);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
