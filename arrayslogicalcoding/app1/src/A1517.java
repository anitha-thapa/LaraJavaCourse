class A1517
{
	public static void main(String[] args) 
	{
		int[] array = {0, 2, 8, 6, 3, 7, 6, 9, 4, 5, 1};
		int sum = 0;
		for(int i = 0; i <array.length; i ++)
		{
			sum += array[i]; 
		}
		double avg = (double) sum / array.length;
			System.out.println("avg:" + avg);
}
}

/*

avg:4.636363636363637

*/