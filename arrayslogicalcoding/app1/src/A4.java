class A4
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		System.out.println(array[4]);
		System.out.println(array[5]);
		//or
		System.out.println(array[(array.length/2) - 1]);
		System.out.println(array[(array.length/2)]);
	
	}
}

/*
9
1
*/
//if total num are even then 2 middle numbers are 2