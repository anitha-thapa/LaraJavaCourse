//right rotate by two.
import java.util.Arrays;
class  A64
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp1=elements[elements.length-1];
		int temp2=elements[elements.length-2];
		for (int i=elements.length-1; i>1; i--)
		{
			elements[i]= elements[i-2]; 
		}
		elements[0]=temp2;
		elements[1]=temp1;
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[20, 18, 10, 5, 13, 16, 4, 7]
*/

