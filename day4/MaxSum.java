package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSum {

	static int sum(int[] a){
		
		Arrays.sort(a);
		int sum=0;
		
		//List<Integer> list1=list.stream().filter(sum->sum+i).collect(Collectors.toList());
		
		for(int i=0;i<a.length;i+=2) {
			
			sum=sum+a[i];
			//List<Integer> list1=list.stream().filter(sum->sum+i).collect(Collectors.toList());
		}
		return sum;
			
	}
	public static void main(String... args) {
		int[] a= {2,1,4,3,5,6};
		int rs=sum(a);
		System.out.println(rs);
	}
}
