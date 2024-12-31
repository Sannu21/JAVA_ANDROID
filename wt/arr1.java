//wap in java to developed an app who is presenter today , use of random class with an array.

import java.lang.*;
import java.util.*;
class arr1
{
	public static void main(String[] args) {
	String[]names=new String[]{"Shivam","Shradha","Ramu","Anshika","Anuj"};
	String[]dare=new String[]{"Singing","Dancing","Slaping Anyone","Walking on one leg","Hand Shake"};
	int len=names.length;
	Random r=new Random();
	int n1=r.nextInt(5);
	int n2=r.nextInt(5);
	System.out.print("Wow !!! Today "+names[n1]+" is want to perform "+dare[n2]+" on stage.");	
	}
} 