package pack1;
class  Q1
{
	private Q()
	{
		System.out.println("O()");
	}
}
class R1 extends Q1
{
	R1()
	{
		//super();
	}
}
/*
 error: invalid method declaration; return type required
        private Q()
                ^
				*/