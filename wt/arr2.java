
//wap in java to develope a console app of future app

import java.lang.*;
import java.util.*;
class arr2
{
	public static void main(String[] args) {
		String name;
		int n;
		System.out.print("Enter your Name : ");
		Scanner s1=new Scanner(System.in);
		name=s1.nextLine();
		Random r=new Random();
		n=r.nextInt(6);
		switch(n)
		{
			case 0:
			{
				System.out.print("Hello ! "+name+" You can become a CM of U.P");
				break;
			}
			case 1:
			{
				System.out.print("Hello ! "+name+" You can become a Software Engineer");
				break;
			}
			case 2:
			{
				System.out.print("Hello ! "+name+" You can become a PM of India");
				break;
			}
			case 3:
			{
				System.out.print("Hello ! "+name+" You can get good marks in your exam");
				break;
			}
			case 4:
			{
				System.out.print("Hello ! "+name+" You are selected in interview");
				break;
			}
			case 5:
			{
				System.out.print("Hello ! "+name+" You can marry soon");
				break;
			}
			default:
			{
				System.out.print("Hello ! "+name+" You are died soon");
				break;
			}

		}
	}
}