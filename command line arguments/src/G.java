class G
{
	public static void main(String[] args) 
	{
		String s1 = args[0];
		String s2 = args[1];

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int min = i;
		if (j<i)
		{
			min = j;
		}
		System.out.println("min b/w " + i + " and " + j + " is " +min);
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes G 12 15
min b/w 12 and 15 is 12
*/