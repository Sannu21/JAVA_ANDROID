// wap in java to use of inheritance
class p20
{
	public static void main(String[] args) {
		B s1=new B();
		s1.f2();
		s1.f1();
	}
}
class A
{
	public void f1()
	{
		System.out.println("This is non-static method ");
	}
}
class B extends A
{
	public void f2()
	{
		System.out.println("This is child class method ");
	}
}