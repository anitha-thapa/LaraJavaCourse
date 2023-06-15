class A10
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		for(int i = array.length - 2; i >= 1 ; i--)
		{
			System.out.println(array[i]);
		}
	}
}

/*
4
3
0
1
9
6
2
5
*/
