package com.coderscampus.domain;

import java.io.IOException;

import java.util.List;
import java.util.Map;

public class SuspectService {
	
	private final FileService fileService = new FileService();
	
	private void filterData(String filePath) throws IOException {
		List<SuspectLocation> suspectLocationLineUp = fileService.getSuspectsFromFile(filePath);
		
		List<SuspectLocation> suspectLocationFilter = suspectLocationLineUp.stream()
				.filter(p -> p.getName().equals("CARMEN SANDIEGO"))
				.findAny()
				.ifPresent(System.out.println("Carmen Sandiego is in... " 
						+ SuspectLocation.getCountry()));
				
				
	}

}
