//12.Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.swap the first and third elements and display the array elements before swapping and after swapping.
import java.util.*;
class A12
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before Swapping: " + Arrays.toString(array));
		int temp = array[0];
		array[0] = array[2];
		array[2] = temp;
		System.out.println("After Swapping: " + Arrays.toString(array));
	}
}
/*
D:\arrayslogicalcoding\app2\src>java -cp ../classes A12
Before Swapping: [10, 20, 30, 400, 500, 110, 540]
After Swapping: [30, 20, 10, 400, 500, 110, 540]
*/