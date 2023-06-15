//Create a byte array with 6 blocks.Store any number between -128 to +128 in the mid+1 position. Assign the element by creating an integer array with 7 blocks and store the element in the mid-1 position.Display both the elements.
import java.util.*;
class A9
{
	public static void main(String[] args) 
	{
		byte[] array= new byte[6];
		array[3]=126;
		System.out.println("final: " + Arrays.toString(array));
		System.out.println("element: " + array[3]);
		int[] arr = new int[7];
		arr[2]=array[3];
		System.out.println("final: " + Arrays.toString(arr));
		//System.out.println("byte element:"+array[3]+\n int array element: "+arr[3]);
		System.out.println("element: " + arr[2]);
	}
}
/*
byte mid=(0+5)/2=2(int)
int mid=(0+6)/2=3

D:\arrayslogicalcoding\app2\src>java -cp ../classes A9
final: [0, 0, 0, 126, 0, 0]
element: 126

final: [0, 0, 126, 0, 0, 0, 0]
element: 126
*/