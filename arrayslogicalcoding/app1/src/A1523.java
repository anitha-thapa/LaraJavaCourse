class A1523 
{
	public static void main(String[] args) 
	{
		int[] array = {0, 2, 8, 6, 3, 7, 6, 9, 4, 5, 1};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println("max:" + max);
	}
}

/*

max:9


*/
