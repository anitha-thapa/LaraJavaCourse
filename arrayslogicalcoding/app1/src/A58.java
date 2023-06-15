//left shift by two.
import java.util.Arrays;
class  A58
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		for (int i=0;i<elements.length-2; i++)
		{
			elements[i]= elements[i+2];
		}
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[13, 16, 4, 7, 20, 18, 20, 18]

*/
