//10. Create an integer an array with 4 blocks store any number between 70 to 110 in the last position. Assign that element by creating a character array with 3 blocks and store the element in first position.Display both elements.
import java.util.*;
class A10
{
	public static void main(String[] args) 
	{
		int[] array= new int[4];
		array[3]=109;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element: " + array[3]);
		char[] ch = new char[3];
		ch[0] = (char)array[3];
		System.out.println("final: " + Arrays.toString(ch));
		System.out.println("element: " + ch[0]);

	}
}
/*
D:\arrayslogicalcoding\app2\src>java -cp ../classes A10
final: [0, 0, 0, 109]
element: 109
final: [m, , ]
element: m
*/