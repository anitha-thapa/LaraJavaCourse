//18. Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.add each element of an array by 10 then display the array elements before addition and after addition.
import java.util.*;
class A18
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before addition: " + Arrays.toString(array));
		for (int i=0;i<=6;i++ )
		{
			array[i]=array[i]+10;
		}
		System.out.println("After addition: " + Arrays.toString(array));
	}
}
/*
Before addition: [10, 20, 30, 400, 500, 110, 540]
After addition: [20, 30, 40, 410, 510, 120, 550]
*/