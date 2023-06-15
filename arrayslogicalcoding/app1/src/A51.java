//multiply every even values with 20 and add 20 unities to every odd values
import java.util.Arrays;
class A51 
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 15, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		for(int i=0; i<elements.length; i++)
		{
			if(elements[i] % 2 == 0)
			{
				elements[i] = elements[i] * 20;
			}
			else
			{
				elements[i] = elements[i] + 20;
			}
		}
		System.out.println("final:" + Arrays.toString(elements));
	}
}
/*
initial:[10, 15, 13, 16, 4, 7, 20, 18]
final:[200, 35, 33, 320, 80, 27, 400, 360]
*/
