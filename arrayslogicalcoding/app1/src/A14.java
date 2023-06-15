class A14
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		for(int i =  array.length-1 ; i >= 0 ; i -= 2) //i=i-2
		{
			System.out.println(array[i]);
			}
		}

	}

/*
5
3
1
6
5
*/
