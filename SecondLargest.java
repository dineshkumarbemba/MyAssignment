package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
public static void main(String[] args) {
	int a[]= {3, 2, 11, 4, 6, 7};
	List<Integer>list = new ArrayList<Integer>();
	for(int i =0;i<a.length;i++) {
		list.add(a[i]);
	}
	Collections.sort(list);
	//System.out.println(list);
	System.out.println("second largest num is "+ list.get(4));
	
}
}
