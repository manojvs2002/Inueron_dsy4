package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewArrayWithsimilarElements {
	
	static List<Integer> function(int a[],int b[],int c[]){
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		
		List<Integer> result = new ArrayList<>(); 
		
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length && k<c.length) {
			if(a[i]==b[j] && b[j]==c[k]) {
				result.add(a[i]);
				i++;j++;k++;
			}
			else if(a[i]<b[j]) {
				i++;
			
			}
			else if(b[j]<c[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		int[] a= {2,6,3,5,1,7,8};
		int[] b= {8,4,2,6,3,8,7,1,9};
		int c[]= {9,3,7,1,6,3,7};
		
		List<Integer> intersect=function(a,b,c);
		System.out.println(intersect);
		
	}

}
