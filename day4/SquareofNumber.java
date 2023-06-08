package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SquareofNumber {

	static void square(int []a){
		List<Integer> list=new LinkedList<>();
		
		for(int b:a) {
			list.add(b);
			
		}
		
		List<Integer> list1=list.stream().map(i->i*i).collect(Collectors.toList());
		 Collections.sort(list1);
		list1.forEach(System.out::println); ;
		
	}
	
	public static void main(String[] args) {
		int a[]= {-4,-3,0,1,2,3};
		square(a);
		
	}
}
