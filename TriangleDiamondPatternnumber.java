package princemishra;

public class TriangleDiamondPatternnumber {
	 public static void main(String[] args) {
	        int n = 4;

	        // Increasing part
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	        // Decreasing part
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	    }

}
