package lara;
class  B
{
	public static void main(String[]args)
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
D:\april-batch-lab\access_levels\app2\src>javac -d ../classes lara/B.java

D:\april-batch-lab\access_levels\app2\src>java -cp ../classes lara.B
0
*/