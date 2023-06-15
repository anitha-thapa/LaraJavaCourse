class A36
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 6, 9, 7, 5, 3, 4, 5, 8};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		boolean asc = true, desc = true;
		System.out.print(array[0] + ",");
		for(int i = 1 ; i < array.length ; i ++)
		{
			if(asc && array[i - 1] < array[i])
			{
				System.out.print(array[i] + ",");
				asc = true;
				desc = false;
			}
			else if(!desc)
			{
				System.out.println();
				System.out.print(array[i] + ",");
				desc = true;
				continue;
			}
			if(desc && array[i - 1] > array[i])
			{
				System.out.print(array[i] + ",");
				asc = false;
				desc = true;
			}
			else if(!asc)
			{
				System.out.println();
				System.out.print(array[i] + ",");
				asc = true;
			}
		}
		
		}

}

/* 
1,5,6,9,
7,5,3,
4,5,8,

*/
