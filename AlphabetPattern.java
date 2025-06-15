package princemishra;

public class AlphabetPattern {
   
	public static void main(String[] args) {
		
		int row=5;
		for(int i=0; i<=row;i++) {
			char ch = (char) ('A' + i);
			for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println(); // Move to next line
        }
		}
		
	}

