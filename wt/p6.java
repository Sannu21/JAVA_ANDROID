//wap in java to print the following messages :
//when user input a-good morning,b-good afternoon,c-good evening
import java.util.*;
class p6
{
	public static void main(String[] args) {
		char i;
		System.out.print("Enter the Character : ");
		Scanner s1=new Scanner(System.in);
		i=s1.nextLine().charAt(0);
		if (i=='a') 
		{
			System.out.print(" A very good morning !!! ");
		}
		else if (i=='b') 
		{
			System.out.print(" A very good afternoon !!! ");
		}
		else if (i=='c')
		{
			System.out.print(" A very good evening !!! ");
		}
		else
		{
			System.out.print(" Invalid !!! ");
		}
	}
}