//17.Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.Multiply each element of an array by 10 then display the array elements before multiplication and after multiplication.
import java.util.*;
class A17
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before Multiplication: " + Arrays.toString(array));
		for (int i=0;i<=6;i++ )
		{
			array[i]=10*array[i];
		}
		System.out.println("After Multiplication: " + Arrays.toString(array));
	}
}
/*
Before Multiplication: [10, 20, 30, 400, 500, 110, 540]
After Multiplication: [100, 200, 300, 4000, 5000, 1100, 5400]
*/