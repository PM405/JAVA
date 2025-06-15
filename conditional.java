package princemishra;
import java.util.*;
public class conditional {
	public static int Calculater(int a,int b) {
		if(a==b) {
			return a+b;
			
		}else if(b>a) {
			return b-a;
		}else {
			return a;
		}
	}
	
	public static void main(String[] agrs) {
		Scanner Sc=new Scanner(System.in);
		
		   System.out.print("Enter the Number:");
		   int x=Sc.nextInt();
		   System.out.print("Enter the Number:");
			int y=Sc.nextInt();
			
			int result=Calculater(x,y);
			System.out.print("Result=:"+result);
	}
	

}
