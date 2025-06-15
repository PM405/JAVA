package princemishra;
import java.util.Scanner;
public class TWODARRAYFROMUSER {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Input number of rows and columns
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        // Step 2: Declare 2D array
	        int[][] arr = new int[rows][cols];

	        // Step 3: Input elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element at [" + i + "][" + j + "]: ");
	                arr[i][j] = sc.nextInt();
	            }
	        }
	     // Step 4: Print the 2D array
	        System.out.println("The 2D array is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println(); // new line after each row
	        }

	        sc.close();
	    }
}
