//print 3 elements which are first 2's sum is 3rd one
class A44
{
	public static void main(String[] args) 
	{
		int[] array = {0, 5, 7, 1, 5, 6, 3, 1, 6, 4, 10, 1, 26};
		//			   0  1  2  3  4  5  6  7  8   
		for(int i = 0; i < array.length-2; i++)
		{
			if(array[i+1] + array[i] == array[i+2] )
		{
			System.out.println(array[i] + " " + array[i+1] + "=" + array[i+2]);

		}
}
}
}

/*
1 5=6
6 4=10
*/