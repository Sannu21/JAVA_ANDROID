//wap in java to print find the add, sub, multi, and div of three numbers.
import java.util.*;
class p1
{
	public static void main(String[] args) {
		int a,b,add,sub,multi,div;
		System.out.print("Enter the Numbers = ");
		Scanner a1=new Scanner(System.in);
		a=a1.nextInt();
		b=a1.nextInt();
		add=a+b;
		System.out.println("The Sum is =" +add);
		sub=a-b;
		System.out.println("The Substraction is =" +sub);
		multi=a*b;
		System.out.println("The Multiplication is =" +multi);
		div=a/b;
		System.out.println("The Division is =" +div);
	}
}