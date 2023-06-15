//7. Create an integer array with 14 locations, store 41 in the mid position.store 76 in the mid-3 position.store 65 in the mid+2 position and display all the elements.Also find the sum of all those elements and display the result
import java.util.*;
class A7
{
	public static void main(String[] args) 
	{
		int[] array= new int[14];
		array[6]=41;
		array[3]=76;
		array[8]=65;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element: " + array[3]);
		System.out.println("element: " + array[6]);
		System.out.println("element: " + array[8]);
		int sum=array[3]+array[6]+array[8];
		System.out.println("sum: " + sum);
	}
}
/*
mid=(0+13)/2=6.5=6(integer)
D:\arrayslogicalcoding\app2\src>java -cp ../classes A7
final: [0, 0, 0, 76, 0, 0, 41, 0, 65, 0, 0, 0, 0, 0]
element: 76
element: 41
element: 65
sum: 182
*/