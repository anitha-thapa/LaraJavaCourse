package pack1;
class  H
{
	private int i;
	public void set(int k)
	{
		//this represents current object
		//if the local and global are having the same name, then local will be given the preference, that why when we are refering  to global variable include 'this'
		this.i=k;
	}
	/*public void set(int i)
	{                               output:0
		i=i;                               0
	}*/
	public int get()
	{
		return i;
	}
}
class I
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.get());
		h1.set(90);
		System.out.println(h1.get());
	}
}
/*
D:\april-batch-lab\access_levels\app1\src>javac -d ../classes pack1/H.java

D:\april-batch-lab\access_levels\app1\src>java -cp ../classes pack1.I
0
90
*/
