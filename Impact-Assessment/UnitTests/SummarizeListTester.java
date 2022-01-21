package UnitTests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.Test;

import NumberRange.NumberRange;

public class SummarizeListTester {

	@Test
	public void test() {
		

		NumberRange numberRange = new NumberRange();
		
		//Create the testing list
		Collection<Integer> outputList = numberRange.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
		String results = numberRange.summarizeCollection(outputList);
		
		String expectedResults = "1, 3, 6-8, 12-15, 21-24, 31";
		
		assertEquals(results,expectedResults);
	}

}
