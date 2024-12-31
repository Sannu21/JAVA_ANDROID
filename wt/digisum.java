//wap in java sum of digits
import java.util.*;
class digisum
{

	public static void main(String[] args)
	 	{
		int n,sum=0,value;
		System.out.print("Enter any Number :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++ ) 
			{
				value=sc.nextInt();
				sum=sum+value;
			}
		System.out.println("Addition = "+sum);
		}
	
}