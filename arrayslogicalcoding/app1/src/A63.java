//right rotate by one.
import java.util.Arrays;
class  A63
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp=elements[elements.length-1];
		for (int i=elements.length-1;i>0; i--)
		{
			elements[i]= elements[i-1]; 
		}
		elements[0]=temp;
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[18, 10, 5, 13, 16, 4, 7, 20]
*/

