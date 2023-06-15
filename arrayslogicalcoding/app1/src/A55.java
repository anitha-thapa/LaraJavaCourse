//replace array elements with the index numbers.
import java.util.Arrays;
class  A55
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		for (int i=0;i<elements.length; i++)
		{
			elements[i]= i;
		}
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[0, 1, 2, 3, 4, 5, 6, 7]
*/