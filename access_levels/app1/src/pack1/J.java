package pack1;
class  J
{
	private int x;	//x is private
	//private access
	//within the class itself THAT'S ALL
	//private members not inheriting to the sub-class
	//y is default/package/friendly
	//default member can be inherited to the subclass within the same package
	//default access
	//same class ok
	//sub-class - same package == ok
	//non-sub-class - same package == ok
	//outside the package == No
	int y;	
}
class K extends J
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println(k1.x);
		System.out.println(k1.y);
	}
}
/*
 error: x has private access in J
                System.out.println(k1.x);
                                     ^
									 */