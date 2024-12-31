// dual class use
class client
{
	public static void main(String[] args) {
		mt.f1();
		mt1 m=new mt1();
		m.f2();
	}
}
class mt
{
	public static void f1()
	{
		System.out.println("Welcome to mt");
	}
}
class mt1
{
	public void f2()
	{
		System.out.println("thanks !!!");
	}
}
