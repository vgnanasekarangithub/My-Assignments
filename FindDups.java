package week2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int[] num = {2,5,7,7,5,9,2,3};
		System.out.println(num.length);
		Arrays.sort(num);
				
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
				System.out.println(num[i]);
				//break;
				}
			}
		}
		
	}

}
