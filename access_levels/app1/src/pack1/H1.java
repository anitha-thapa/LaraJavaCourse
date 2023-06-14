package pack1;
class  H1
{
	private int i;
	public void set(int i)
	{
		
		this.i = this.i;  
		
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
		H h1 = new H();
		System.out.println(h1.get());
		h1.set(100);
		System.out.println(h1.get());
	}
}