package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {3,2,11,4,6,7};
 int b[]= {1,2,8,4,9,7};
 List<Integer> first = new ArrayList<Integer>();
 List<Integer>second = new ArrayList<Integer>();
 for(int i=0;i<a.length;i++) {
	 first.add(a[i]);
 }
 for(int j=0;j<b.length;j++) {
	 second.add(b[j]);
 }
 for(int i=0;i<first.size();i++) {
	 for(int j=0;j<second.size();j++) {
		 if(first.get(i).equals(second.get(j))){
			 System.out.println(first.get(i));
		 }
	 }
 }
 
	}

}
