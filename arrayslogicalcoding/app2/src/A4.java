//4. define an integer array with 5 blocks. store 27 in the last location and display the same 
import java.util.*;
class A4
{
	public static void main(String[] args) 
	{
		int[] array= new int[5];
		array[4]=27;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element " + array[4]);

	}
}
/*
D:\arrayslogicalcoding\app2\src>java -cp ../classes A4
final: [0, 0, 0, 0, 27]
element 27
*/