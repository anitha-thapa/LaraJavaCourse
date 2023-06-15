//14.Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.swap the first and fifth elements and display the array elements before swapping and after swapping.
import java.util.*;
class A14
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before Swapping: " + Arrays.toString(array));
		int temp = array[0];
		array[0] = array[4];
		array[4] = temp;
		System.out.println("After Swapping: " + Arrays.toString(array));
	}
}
/*
Before Swapping: [10, 20, 30, 400, 500, 110, 540]
After Swapping: [500, 20, 30, 400, 10, 110, 540]
*/