package com.in28minutes.mockito.mockitodemo.business;

public class SomeBusinessImpl {

	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		
		int greatestVal = Integer.MIN_VALUE;
		for(int val:data) {
			if (val > greatestVal) {
				greatestVal = val;
			}
		}
		return greatestVal;
	}
	
	
}

interface DataService {
	int[] retrieveAllData();
}