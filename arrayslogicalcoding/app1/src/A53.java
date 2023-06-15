//swap every elements with its next element.
import java.util.Arrays;
class  A53
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp;
		for(int i=0; i<elements.length-1; i += 2)
		{
			temp = elements[i];
			elements[i] = elements[i+1];
			elements[i+1] = temp;
	}
			System.out.println("final  :" + Arrays.toString(elements));
}
}

/*

initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[5, 10, 16, 13, 7, 4, 18, 20]

*/
