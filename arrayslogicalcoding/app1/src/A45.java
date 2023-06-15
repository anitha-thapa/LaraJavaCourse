//find out all the two elements whose sum is zero
class A45
{
	public static void main(String[] args) 
	{
		int[] array = {0, 5, 7, -5, 3, 6, -3, 1};
		//			   0  1  2  3  4  5  6  7  8   
		for(int i = 0; i < array.length-1; i++)
		{
			for(int j=i+1; j<array.length-1;j++)
			{
			if(((array[i]) + (array[j])) == 0 )
		{
			System.out.println(array[i] + " ");
			System.out.println(array[j] + " ");
			System.out.println();

		}
}
}
}
}
/*
5
-5

3
-3

