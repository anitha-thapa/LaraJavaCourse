class A1512
{
	public static void main(String[] args) 
	{
		int[] array = {0, 2, 8, 6, 3, 7, 6, 9, 4, 5, 1};
		for(int i = array.length-1; i > array.length/2; i--)
			System.out.println(array[i]);
}
}

/*

1
5
4
9
6

*/