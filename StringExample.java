package princemishra;

public class StringExample {
    public static void main(String[] args) {

        String name = "Prince ";

        System.out.println("Length: " + name.length()); // 13
        System.out.println("First character: " + name.charAt(0)); // P
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring: " + name.substring(0, 6)); // Prince
        System.out.println("Contains 'Prince'? " + name.contains("Mishra")); // true

    }
}

