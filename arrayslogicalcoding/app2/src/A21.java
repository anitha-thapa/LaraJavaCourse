//21. Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540. Current element should be difference of previous 2 elements. Display the array elements before addition and after addition.
import java.util.*;
class A21
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Initial Array: " + Arrays.toString(array));
		for (int i=6;i>=2;i-- )
		{
			array[i]=array[i-1]-array[i-2];
		}
		System.out.println("Modified Array: " + Arrays.toString(array));
	}
}
/*
Initial Array: [10, 20, 30, 400, 500, 110, 540]
Modified Array: [10, 20, 10, 10, 370, 100, -390]
*/