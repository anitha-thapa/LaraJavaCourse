class  A1520
{
	public static void main(String[] args) 
	{
		int[] array = {0, 2, 8, 6, 3, 7, 6, 9, 4, 5, 1};
		int sum = 0;
		for(int i = array.length/2; i< array.length ; i++)
		{
			sum += array[i];
		}
		System.out.println("sum:" + sum);
	}
}


/*

sum:32

*/