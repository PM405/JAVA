package princemishra;
 import java.util.*;
public class printmyname {
	 public static int calsum(int x,int y) {
		 int sum =x+y;
		 return sum;
	 }
	
	
	
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int a=Sc.nextInt();
		System.out.print("Enter the Number:");
		int b=Sc.nextInt();
		
		int sum=calsum(a,b);
		
		System.out.print("sum="+sum);
	}

}
