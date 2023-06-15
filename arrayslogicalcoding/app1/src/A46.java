//46.find out all the three elements whose sum is zero....
class A46
{
	public static void main(String[] args) 
	{
		int[] array = {-4,5,6,7,9,-5,4,3,1,8};
		//			    0 1 2 3 4  5 6 7 8 9 
		for(int i = 0; i < array.length-1; i++)
		{
			for(int j=i+1; j<array.length;j++)
			{
				for(int k=j+1; k<array.length;k++)
				{
					if (((array[i]) + (array[j]) + (array[k])) == 0)
		{
			System.out.println(array[i] + " ");
			System.out.println(array[j] + " ");
			System.out.println(array[k] + " ");
			System.out.println();

		}
}
}
}
}
}

/*
-4
9
-5

-4
3
1

-5
4
1
*/
