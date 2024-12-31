/*wap in java to chek armstrong of a number.*/
import java.util.*;
class arms
{
	public static void main(String[] args) {
		int d,sum=0,rem=0,cube=0,i;
		System.out.print("Enter any digit : ");
		Scanner s1=new Scanner(System.in);
		d=s1.nextInt();
		for(i=d;i>0;i=i/10)
		{
			rem=i%10;
			cube=rem*rem*rem;
			sum=sum+cube;
		}
		if(sum==d)
			System.out.print(d+ " is an armstrong");
		else
			System.out.print(d+ " is not an armstrong");
	}
}