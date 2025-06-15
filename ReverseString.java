package princemishra;

public class ReverseString {
	
	 public static void main(String[] args) {
	        String original = "Prince";
	        
	        StringBuilder sb = new StringBuilder(original);
	        sb.reverse(); // built-in method to reverse

	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + sb.toString());
	    }

}
