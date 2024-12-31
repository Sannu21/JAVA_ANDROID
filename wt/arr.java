//wap in java to use of an array
import java.util.*;
class arr
{
	public static void main(String[] args) {
		int[]list=new int[10];
		int i;
		System.out.print("Enter 10 Elements into an array : ");
		Scanner s1=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			list[i]=s1.nextInt();
		}
		System.out.println("Input Elements by user is  ");
		for(i=0;i<10;i++)
		{
			System.out.print(list[i]+"\t");
		}
	}
}         