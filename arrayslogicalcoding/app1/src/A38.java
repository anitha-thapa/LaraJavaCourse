//print the elements which are prev to even elements
class A38
{
	public static void main(String[] args) 
	{
		//int[] array = {1, 5, 6, 9, 7, 5, 3, 4, 5, 8};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int i = 1; i < array.length-1; i++)
		{
			if(array[i] % 2==  0)
		{
			System.out.println(array[i-1] + " ");
	}
		}
}
}

/*
1
3
5
7
*/


