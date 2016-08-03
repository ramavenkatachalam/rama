package power;

import java.util.Scanner;


public class Pow1 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter a num");
	int num1=s.nextInt();
	int temp=num1;
	 int rem;
	 int rev=0;
 int n=0;
	 
	 while(num1>0)
	 {
		 rem=num1%10;
		 num1=num1/10;	
		 n++;
	 }
	int n1=n-1;
	
	num1=temp;
	 while(num1>0)
	 {
		 rem=num1%10;
		 rev+=Math.pow(rem,n1);
		num1=num1/10;		 
		 --n1;
		 int revc=rev;
	 }
	 System.out.println(rev);
	 
}
}


