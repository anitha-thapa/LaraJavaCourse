class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		int i= 0;

		 if(i++ == 0 && i++ == 0);
		 {
			System.out.println("if: "+ i++);
		 }
		 else
		{
			System.out.println("else: "+ i++);
			i++;
		 }
			System.out.println("main end: "+ i);
	}
}

/* o/p -->'else' without 'if'