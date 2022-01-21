package NumberRange;
import java.util.Collection;

public class NumberRangeTester {

	public static void main(String[] args) {
		
		NumberRange numberRange = new NumberRange();
		
		//Create the testing list
		Collection<Integer> list = numberRange.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31,33,34,35");
		
		String results = numberRange.summarizeCollection(list);
		
		System.out.println(results);
		

	}

}
