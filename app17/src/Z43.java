class Z43
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int i = 1;
		test(++i + i); // 2+2=4
		System.out.println("main end:" + i);  
	}
	public static  void test(int i)
	{
				
		System.out.println("from test:" + i);
		++i;
	}
				
}

/*

main begin
from test:4
main end:2

*/





