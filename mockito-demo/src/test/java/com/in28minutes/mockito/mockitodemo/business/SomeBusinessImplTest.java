package com.in28minutes.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllData_basicTest() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl	= new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

}

class DataServiceStub implements DataService {
	
	@Override 
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
	
}
