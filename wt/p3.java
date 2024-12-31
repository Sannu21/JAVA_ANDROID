//wap in java to find the volume of following formula d=(b*b-4*a*c).
import java.util.*;
class p3
{
	public static void main(String[] arr)
	{
		double a,b,c,d;
		System.out.print("Enter the value of a,b,c : ");
		Scanner s1=new Scanner(System.in);
		a=s1.nextDouble();
        b=s1.nextDouble();
        c=s1.nextDouble();
        d=(b*b-4*a*c);
        System.out.print("The volume of D is :"+d);
	}
}