//print the even elements which are in the middle of two odd elements
class A41
{
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//			   0  1  2  3  4  5  6  7  8   //index number
		for(int i = 1; i < array.length-1; i++)
		{
			if(array[i-1] % 2 !=  0 && array[i+1] % 2 !=  0 && array[i] % 2 == 0 )
		{
			System.out.println(array[i] + " ");
	}
		}
}
}


/*
2
4
6
8
*/