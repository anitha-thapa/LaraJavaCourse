//replace array elements with the index numbers.
import java.util.Arrays;
class  A56
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		for (int i=0;i<elements.length; i++)
		{
			elements[i]= 2*i;
		}
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[0, 2, 4, 6, 8, 10, 12, 14]
*/