package day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListWithNonSimilarElements {
	
	
	static List<List<Integer>> function(int []a,int []b){
		
		List<List<Integer>> list = new ArrayList<>();
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int c:a) {
			set1.add(c);
		}
		for(int d:b) {
			set2.add(d);
		}
		
		Set<Integer> distinct1=new HashSet<>(set1);
		distinct1.removeAll(set2);
		
		Set<Integer> distinct2 = new HashSet<>(set2);
		distinct2.removeAll(set1);
		
		list.add(new ArrayList<>(distinct1));
		list.add(new ArrayList<>(distinct2));
		
		return list;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] nums1 = {1, 2, 3};
	        int[] nums2 = {2, 4, 6};
	        List<List<Integer>> distinctIntegers = function(nums1, nums2);
	        System.out.println(distinctIntegers);  
	}

}
