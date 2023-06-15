//left rotate by two.
import java.util.Arrays;
class  A60
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 5, 13, 16, 4, 7, 20, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp1=elements[0];
		int temp2=elements[1];
		
		for (int i=0;i<elements.length-2; i++)
		{
			elements[i]= elements[i+2];
		}
		elements[elements.length-2]=temp1;
		elements[elements.length-1]=temp2;
			System.out.println("final  :" + Arrays.toString(elements));
	}
}
/*
initial:[10, 5, 13, 16, 4, 7, 20, 18]
final : [13, 16, 4,  7, 20, 18, 10, 5]


*/
