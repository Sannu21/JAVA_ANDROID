//wap in java to use of a class 
import java.lang.*;
class cls1
{
	public static void main(String[] args) {
		student.add();
	}
}     
class student
{
	static int a,b,c;
	public static void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.print("Sum is : "+c);
	}
}

2. Object : Object is provide the refrence of a class variables or methods.
=> object is real world entity.

Syntax : ClassName ObjectName=new ClassName();
Ex : student s=new student();

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



























