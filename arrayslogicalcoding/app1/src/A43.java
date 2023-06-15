//print all two consecutive odd elements
class A43
{
	public static void main(String[] args) 
	{
		int[] array = {0, 5, 7, 11, 16, 2, 3, 1, 6, 4, 13, 1, 26};
		//			   0  1  2  3  4  5  6  7  8   
		for(int i = 0; i < array.length-1; i++)
		{
			if(array[i+1] % 2 !=  0 && array[i] % 2 != 0 )
		{
			System.out.println(array[i] + " " + array[i+1] + " ");

		}
}
}
}

/*
5 7
7 11
3 1
13 1
*/