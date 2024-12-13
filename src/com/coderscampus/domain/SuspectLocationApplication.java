package com.coderscampus.domain;

import java.io.IOException;

public class SuspectLocationApplication {

	public static void main(String[] args) throws IOException {
		
		SuspectService suspectService = new SuspectService();
		suspectService.filterData("InterpolWatchReport-Week1.csv");
		suspectService.filterData("InterpolWatchReport-Week2.csv");
		suspectService.filterData("InterpolWatchReport-Week3.csv");
	}

}
