class A1524 
{
	public static void main(String[] args) 
	{
		int[] array = {0, 2, 8, 6, 3, 7, 6, 9, 4, 5, 1};
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length/2 ; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.println("min:" + min);
	}
}

/* min:0 */