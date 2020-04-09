import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashMap;
import java.util.TreeMap;

public class ListManipulator {
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){
		//Accepts an array list of integers and sorts it in ascending or descending order.
		//Make sure to account for cases with duplicate values. The method returns the sorted list. 
		if(ascending.equals(true)) {
			Collections.sort(myLst);
		}
		else {
			Collections.sort(myLst, Collections.reverseOrder());
		}
		return myLst;	
	}
	
	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		//Accept an array list of integers and swamps positions of the largest and the 
		//smallest elements. If multiple values representing largest/smallest elements are 
		//present then pick the first position. The method returns the modified list. 
		int min = Collections.min(myLst);
		int max = Collections.max(myLst);
		Collections.swap(myLst, min, max);
		return myLst;
	}
	
	void table(ArrayList<Integer> myLst) {
		//Accepts an array list of integers, creates a table of unique values and the 
		//number of times each value occurs, sorts this table, and outputs it to command line. 
		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
		for(Integer i: myLst) {
			Integer j = map.get(i);
			if(j == null) {
				map.put(i,1);
			} else {
				map.put(i, j + 1);
			}
		}
	}
	
}
