package week2.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] element= {2,5,1,3,7};
		int num1=0;
		int num2=0;
		Arrays.sort(element);
		System.out.println("Length of Array: "+element.length);
		for (int i = 0; i < element.length; i++) {
			num1=num1+element[i];
		}
		for (int j = 0; j <=10; j++) {
			num2=num2+j;
		}
		System.out.println("Missing Element in the Array: "+(num2-num1));
		
		

	}

}
