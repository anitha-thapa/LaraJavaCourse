//increment first half values with 5 unites and decrement 2nd half value with 10 units
class  A50
{
	public static void main(String[] args) 
	{
		int[] array = {15, 19, 80, 94, 17, 26, 12, 3, 10, 63};
		for(int i = 0; i<=array.length/2-1; i++)
		{
			array[i]=array[i]+5;
		System.out.println(array[i]);
		}
		for(int i = array.length/2; i<=array.length-1; i++)
		{
			array[i]=array[i]-10;
		System.out.println(array[i]);
	}
}
}
/*

20
24
85
99
22
16
2
-7
0
53

*/
