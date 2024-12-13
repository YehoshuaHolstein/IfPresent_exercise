package com.coderscampus.domain;

import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SuspectService {
	
	private final FileService fileService = new FileService();
	
	void filterData(String filePath) throws IOException {
		List<SuspectLocation> suspectLocationLineUp = fileService.getSuspectsFromFile(filePath);
		
		Optional<SuspectLocation> suspectLocationFilter = suspectLocationLineUp.stream()
				.filter(p -> p.getName().equals("CARMEN SANDIEGO"))
				.findAny();
		
//		suspectLocationFilter.ifPresent(SuspectLocation -> System.out.println("Carmen Sandiego is in... " 
//						+ SuspectLocation.getCountry()));	
		suspectLocationFilter.ifPresentOrElse(SuspectLocation -> System.out.println("Carmen Sandiego is in... " 
				+ SuspectLocation.getCountry()), () -> System.out.println("Galdang, just missed her!"));	
	} 

}
