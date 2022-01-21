package UnitTests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import NumberRange.NumberRange;

public class CollectListTester {

	@Test
	public void test() {
		
		NumberRange numberRange = new NumberRange();
		
		//Create the testing list
		Collection<Integer> outputList = numberRange.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
		
		List<Integer> testingList = new ArrayList<Integer>();
		
		testingList.add(1);
		testingList.add(3);
		testingList.add(6);
		testingList.add(7);
		testingList.add(8);
		testingList.add(12);
		testingList.add(13);
		testingList.add(14);
		testingList.add(15);
		testingList.add(21);
		testingList.add(22);
		testingList.add(23);
		testingList.add(24);
		testingList.add(31);
		
		assertEquals(outputList,testingList);
		
	}

}
