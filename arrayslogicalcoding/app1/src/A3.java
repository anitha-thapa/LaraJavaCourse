class A3
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		//or
		System.out.println(array[array.length - 3]);
		System.out.println(array[array.length - 2]);
		System.out.println(array[array.length - 1]);
	}
}

/*3
 4
 5
 
 last element is length - 1