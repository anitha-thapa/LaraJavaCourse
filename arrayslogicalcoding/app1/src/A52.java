//swap first elements with last element

import java.util.Arrays;
class  A52
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp;
		for(int i=0; i<elements.length-1; i++)
		{
			temp = elements[0];
			elements[0] = elements[7];
			elements[7] = temp;
	}
			System.out.println("final  :" + Arrays.toString(elements));
}
}

/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final  :[18, 5, 13, 16, 4, 7, 20, 10]
*/
