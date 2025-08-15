package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseStringElements {
	public static void main(String[] args) {
		
	
String value[] = {"HCL","Wipro","Aspire Systems","CTS"};
List<String>company = new ArrayList<String>();
for (String string : value) {
	company.add(string);
}
Collections.sort(company);
System.out.println(company);
System.out.println("----------------------------------------------");
for(int i=company.size()-1;i>=0;i--) {
	System.out.println(company.get(i));
}
}
}