/*wap in java to print fibonacci series.
    0 1 1 2 3 5 8 13 ......*/
import java.util.*;
class fibonacci
{
	public static void main(String[] args) {
		int t,n1=0,n2=1,n3,i;
		System.out.print("How many terms you want to print into series ");
		Scanner s1=new Scanner(System.in);
		t=s1.nextInt();
		System.out.print(n1+"\t"+n2+"\t");
		for(i=1;i<=t-2;i++)
		{
			n3=n1+n2;
			System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
		}
	}
}