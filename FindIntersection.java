package week2.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int num1[]={2,5,7,5,9,3}; 
		int num2[]={1,2,8,4,9,7};
		Arrays.sort(num1);
		Arrays.sort(num2);
		System.out.println("Display match values between Two Arrays:");
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if(num1[i]==num2[j])
				{
					System.out.println(num1[i]);
				}
			}
			
		}
	}
}
