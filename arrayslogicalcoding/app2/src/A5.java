//5.Define an integer array with 10 blocks. Store 200 in the last location and store 34 in the last but one location and display both the elements
import java.util.*;
class A5
{
	public static void main(String[] args) 
	{
		int[] array= new int[10];
		array[9]=200;
		array[8]=34;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element: " + array[9]);
		System.out.println("element: " + array[8]);

	}
}
/*
D:\arrayslogicalcoding\app2\src>java -cp ../classes A5
final: [0, 0, 0, 0, 0, 0, 0, 0, 34, 200]
element: 200
element: 34
*/