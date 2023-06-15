package pack1;
class  Q
{
	private Q()
	{
		System.out.println("O()");
	}
}
class R extends Q
{
}
/*
 error: Q() has private access in Q
class R extends Q
*/