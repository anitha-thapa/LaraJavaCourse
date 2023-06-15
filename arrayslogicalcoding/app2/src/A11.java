//11. Initialize an integer array with the elements 10, 20, 30, 400, 500, 110, 540.swap the first two elements and display the array elements before swapping and after swapping.
import java.util.*;
class A11
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 400, 500, 110, 540};
		System.out.println("Before Swapping: " + Arrays.toString(array));
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("After Swapping: " + Arrays.toString(array));
	}
}
/*
instead of line 8 & 12 we can write,
for(int i:a)
{	
	System.out.println(i+" "); 
}

D:\arrayslogicalcoding\app2\src>java -cp ../classes A11
Before Swapping: [10, 20, 30, 400, 500, 110, 540]
After Swapping: [20, 10, 30, 400, 500, 110, 540]
*/