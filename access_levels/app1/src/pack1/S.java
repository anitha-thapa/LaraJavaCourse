package pack1;
class  S
{
	private S()
	{
		System.out.println("O()");
	}
	S(int i)
	{
	}
}
class T extends S
{
	T()
	{
		super(10);
	}
}
//compile successfully