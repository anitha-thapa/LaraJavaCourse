//read all the elements from a given array except first and last
class A6
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		for(int i = 1; i < array.length - 1; i++)
		{
			System.out.println(array[i]);
		}
	}
}

/*
5
2
6
9
1
0
3
4

*/