package NumberRange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberRange implements NumberRangeSummarizer {
	
	//Implement the interfaces
	public Collection<Integer> collect(String input) {
		
		//Initialize a list 
		List<Integer> output = new ArrayList<Integer>();
		
		int number;
		String stringValueOfOutput[] = input.split(",");
		
		for(String i: stringValueOfOutput) {
			
			number = Integer.parseInt(i);
			output.add(number);
		}
		
		return output;
	}
	
	//Summarize the lists and return them as the combined string
	public String summarizeCollection(Collection<Integer> input) {
		
		String output="";
		
		//Get the ordered and sequential lists
		List<List<Integer>> sequentialLists = GetSequentialLists(input);
		
		//The indices of first and last element
		int firstElement =0;
		int lastElement=0;
		
		//Loop the lists and compile the output
		for(List<Integer> currentList : sequentialLists) {
			
			//check the size of the list and if the current list is the last one
			if(currentList.size() == 1) {
				firstElement = currentList.get(0);
				
				output += firstElement+", " ;
			}
			else {
				
				//get the first and last element on the list
				firstElement = currentList.get(0);
				lastElement = currentList.get(currentList.size()-1);
			
				//add into output
				output += firstElement + "-" + lastElement+", ";
			}
			
		}
		output = removeLastChar(output);
		
		
		return output;
	}
	
	//Method for Getting the set of lists in the range where they are sequential
	public List<List<Integer>> GetSequentialLists(Collection<Integer> input) {
		
		List<Integer> newList = (List<Integer>) input;
		//Collections.sort(newList);

	    List<List<Integer>> outputList = new ArrayList<List<Integer>>();
	    List<Integer> tempList = new ArrayList<>();
	    
	    //variable to hold the current difference
	    //int difference = newList.get(1) - newList.get(0);
	    
	    for (int i = 0; i < newList.size(); i++) {
	    	
	    	
			if ((i + 1 < newList.size()) && ( newList.get(i) +1 == newList.get(i+1))) {
	        	
	            tempList.add(newList.get(i));
	            //difference = newList.get(i+1) - newList.get(i);
	        }
			else {
				
	            tempList.add(newList.get(i));
	            outputList.add(tempList);
	            tempList  = new ArrayList<>();
			}
	        
	       
	    }
	 
	    return outputList;
		
	}
	
	public String removeLastChar(String input) {
		
		String output="";
		//loop through the input string and remove the last character
		for(int i=0; i<input.length()-2;i++) {
			
			output += input.charAt(i);
		}
		
		return output;
			
	}

}
