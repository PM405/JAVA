package princemishra;
import java.util.*;
public class age {
 
	public static void  main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.print("You are not Adult");
		}else {
			System.out.print("You are  Adult");
		}
		
	}
}
