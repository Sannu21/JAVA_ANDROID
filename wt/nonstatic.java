//wap in java to use of an object

class nonstatic
{
	public static void main(String[] args) {
		message m=new message();
		m.msg();
	}
}
class message
{
	public void msg()
	{
        System.out.print("This is a non-static method ");
	}
}