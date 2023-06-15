package rst;
class  O
{
	public static void main(String[] args) 
	{
		lara.N n1 = new lara.N();
		System.out.println(n1.i);
	}
}
/*
here N is public, we can create the object but we cannot access 'i', bcoz i is in A class(default)
error: cannot find symbol
                lara.N n1 = new lara.N();
                    ^
*/