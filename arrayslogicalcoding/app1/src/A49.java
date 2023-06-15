//decrement every value to 10 unites
class  A49
{
	public static void main(String[] args) 
	{
		int[] array = {15, 19, 80, 94, 17, 26, 12, 3, 10};
		for(int i = 0; i<=array.length-1; i++)
		{
			array[i]=array[i]-10;
		System.out.println(array[i]);
	}
}
}

/*
5
9
70
84
7
16
2
-7
0
*/