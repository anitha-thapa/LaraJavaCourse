package lara;
class  C extends A
{
	public static void main(String[]args)
	{
		C c1 = new C();
		System.out.println(c1.i);
	}
}
/*
D:\april-batch-lab\access_levels\app2\src>javac -d ../classes lara/C.java

D:\april-batch-lab\access_levels\app2\src>java -cp ../classes lara.C
0
*/