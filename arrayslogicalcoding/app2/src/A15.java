//15. Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.swap the last and fourth elements and display the array elements before swapping and after swapping.
import java.util.*;
class A15
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before Swapping: " + Arrays.toString(array));
		int temp = array[6];
		array[6] = array[3];
		array[3] = temp;
		System.out.println("After Swapping: " + Arrays.toString(array));
	}
}
/*
Before Swapping: [10, 20, 30, 400, 500, 110, 540]
After Swapping: [10, 20, 30, 540, 500, 110, 400]
*/