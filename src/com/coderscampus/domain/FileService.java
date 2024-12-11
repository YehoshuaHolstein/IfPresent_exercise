package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	
	public List<SuspectLocation> getSuspectsFromFile(String filePath) throws IOException {
		String line;
		List<SuspectLocation> suspectLocationArray = new ArrayList<>();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			String headerLine = bufferedReader.readLine();
			while((line = bufferedReader.readLine()) != null) {
				String[] lineData = line.split(",");
				SuspectLocation suspectLocation = new SuspectLocation(lineData[0], lineData[1]);
				suspectLocationArray.add(suspectLocation);
			}
		} catch (IOException e) {
			System.out.println("There was a problem: " + e.getMessage());			
		}
		
		return suspectLocationArray;		
	}	
		
}


