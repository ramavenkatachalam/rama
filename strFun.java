package power;

import java.util.Scanner;

public class strFun {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a string");
	String w=s.next();
	int n=w.length();
	int c=w.charAt(n-1)-96;
	int encode=0;
	
	for(int i=0;i<=n-2;i++)
	{int d=0;
		 encode=(int)w.charAt(i);
		 d=encode+c;
	System.out.print((char)d);
}System.out.println((w.charAt(n-1)));
}

}
