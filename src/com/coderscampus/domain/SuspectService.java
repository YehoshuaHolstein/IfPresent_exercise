package com.coderscampus.domain;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import main.domain.Suspect;

public class SuspectService {
	
	private final FileService fileService = new FileService();
	
	private void filterData(String filePath) throws IOException {
		List<SuspectLocation> suspectLocationLineUp = fileService.getSuspectsFromFile(filePath);
		Map<String, List<SuspectLocation>> suspectLocations = null; // Map - declaration
		suspectLocations = suspectLocationLineUp.stream()
				.filter(p -> p.getName().equals("CARMEN SANDIEGO"))
				.
	}

}
