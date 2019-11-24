package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {9,3,4,5,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		Arrays.sort(data);
		for (int i= data[0]; i < data.length-1; ++i) {
			if (data[i]+1 != data[i+1])
	{
		System.out.println(data[i]+1);	
	}
	
		}
	
	}

}
