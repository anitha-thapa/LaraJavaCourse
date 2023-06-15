//20. Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540. Current element should be sum of next 2 elements. Display the array elements before addition and after addition.
import java.util.*;
class A20
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Initial Array: " + Arrays.toString(array));
		for (int i=0;i<=4;i++)
		{
			array[i]=array[i+1]+array[i+2];
		}
		System.out.println("Modified Array: " + Arrays.toString(array));
	}
}
/*
Initial Array: [10, 20, 30, 400, 500, 110, 540]
Modified Array: [50, 430, 900, 610, 650, 110, 540]
*/