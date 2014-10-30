package com.demo.rotate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DoRotationTest {
	ArrayList<Integer> initialList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
	ArrayList<Integer> resultlist = null;
	ArrayList<Integer> expectedList = null;
	
	@Test
	public void testDoRotaion() {
		
		//Sequence test with step =1
		resultlist = DoRotation.doRotaion(initialList, 0);
		expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		assertNotNull(resultlist);assertNotNull(expectedList);
		assertArrayEquals("Do rotaion of array 0", resultlist.toArray(), expectedList.toArray());
		//Do rotaion of the arraylist using step value =1
		
		//Use same result of previous rotation and apply other rotation by step = 1
		resultlist = DoRotation.doRotaion(expectedList, 1);
		expectedList = new ArrayList<>(Arrays.asList(6, 1, 2, 3, 4, 5));
		assertNotNull(resultlist);assertNotNull(expectedList);
		assertArrayEquals("Do rotaion of array 0", resultlist.toArray(), expectedList.toArray());
		
		//Use same result of previous rotation and apply other rotation by step = 1
		resultlist = DoRotation.doRotaion(expectedList, 1);
		expectedList = new ArrayList<>(Arrays.asList(5, 6, 1, 2, 3, 4));
		assertNotNull(resultlist);assertNotNull(expectedList);
		assertArrayEquals("Do rotaion of array 0", resultlist.toArray(), expectedList.toArray());
		
		//this test must be the same if we use step = 2
		ArrayList<Integer> resultlist_Step2 = DoRotation.doRotaion(initialList, 2);
		expectedList = new ArrayList<>(Arrays.asList(5, 6, 1, 2, 3, 4));
		assertNotNull(resultlist_Step2);assertNotNull(expectedList);
		assertArrayEquals("Do rotaion with step = 2", resultlist_Step2.toArray(), expectedList.toArray());
	}

	@Test
	public void testSwichposition() {
		
		
		//swich take as parameter the list and the two positions to be permuted
		resultlist = DoRotation.swichposition(initialList, 0, 0);
		expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		assertNotNull(resultlist);assertNotNull(expectedList);
		assertArrayEquals("Switching position from 0 to 0", resultlist.toArray(), expectedList.toArray());
		
//		resultlist = DoRotation.swichposition(initialList, 0, 5);
//		expectedList = new ArrayList<>(Arrays.asList(6, 2, 3, 4, 5, 1));
//		assertNotNull(resultlist);assertNotNull(expectedList);
//		assertArrayEquals("Switching position from 0 to 5", resultlist.toArray(), expectedList.toArray());
		
//		resultlist = DoRotation.swichposition(initialList, 5, 0);
//		expectedList = new ArrayList<>(Arrays.asList(6, 2, 3, 4, 5, 1));
//		assertNotNull(resultlist);assertNotNull(expectedList);
//		assertArrayEquals("Switching position from 5 to 0", resultlist.toArray(), expectedList.toArray());
		
		resultlist = DoRotation.swichposition(initialList, 2, 3);
		expectedList = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 5, 6));
		assertNotNull(resultlist);assertNotNull(expectedList);
		assertArrayEquals("Switching position from 2 to 3", resultlist.toArray(), expectedList.toArray());
	}


}
