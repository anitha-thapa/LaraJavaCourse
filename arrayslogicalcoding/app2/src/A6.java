//6. Define an integer array with 11 location store 37 in the middle location and display the same
import java.util.*;
class A6
{
	public static void main(String[] args) 
	{
		int[] array= new int[11];
		array[5]=37;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element: " + array[5]);
	}
}
/*

D:\arrayslogicalcoding\app2\src>java -cp ../classes A6
final: [0, 0, 0, 0, 0, 37, 0, 0, 0, 0, 0]
element: 37


mid=(low+high)/2=(0+10)/2=5
*/

