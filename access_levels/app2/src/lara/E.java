package lara;
class  E
{
	public static void main(String[]args)
	{
		A a1 = new A();
		System.out.println(a1.i);
		C c1 = new C();
		System.out.println(c1.i);
		D d1 = new D();
		System.out.println(d1.i);
	}
}
/*
E is non sub-class to A class

D:\april-batch-lab\access_levels\app2\src>javac -d ../classes lara/E.java

D:\april-batch-lab\access_levels\app2\src>java -cp ../classes lara.E
0
0
0
*/

