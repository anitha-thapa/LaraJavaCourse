class Z
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin");
		boolean i = test(); 
		System.out.println("in the main:" + i);
		System.out.println("main end");
	}
	public static  int test()//return type int  return value int 
	{
		System.out.println("from test");
		return 100;
	}
				
}


//incompatible types