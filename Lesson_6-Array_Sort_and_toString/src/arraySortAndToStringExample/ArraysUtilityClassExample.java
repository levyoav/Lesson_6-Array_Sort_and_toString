package arraySortAndToStringExample;

import java.util.Arrays;

public class ArraysUtilityClassExample {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 6, 4, 9, 5, 3, 6, 5 };

		//Using Arrays utility class to print an array
		System.out.println(Arrays.toString(arr));

		//Using Arrays utility class to sort an array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
