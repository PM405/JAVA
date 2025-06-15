package princemishra;

import java.util.*;

public class contitional {
	
	public static int statement(int x,int y) {
		if(x>y) {
			return x;
			
		}else if(x==y) {
			return y;
		}else {
			return x-y;
		}
		
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
	   System.out.print("Enter the Number:");
	   int a=Sc.nextInt();
	   System.out.print("Enter the Number:");
		int b=Sc.nextInt();
		
		int result=statement(a,b);
		System.out.print("Result=:"+result);
		
	}

}
