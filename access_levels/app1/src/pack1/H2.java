package pack1;
class  H2
{
	private int i;
	public void set(int i)
	{
		this.i=i;    //0,100
		this.i = this.i;  //0,0
		i=this.i
		
	}
	public int get()
	{
		return i;
	}
}
class I2
{
	public static void main(String[] args) 
	{
		H2 h1 = new H2();
		System.out.println(h1.get());
		h1.set(100);
		System.out.println(h1.get());
	}
}
/*
0
0
