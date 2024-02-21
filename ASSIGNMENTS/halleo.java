import java.util.Scanner;

public class halleo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input;
        while (true) {
            System.out.println("Enter a number (or 'x' to stop): ");
            input = sc.nextLine();
            if (input.equals("x")) {
                break;
            }
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

           
            
        }
        sc.close();
        System.out.println("The sum of all numbers = " + sum); // Printing the sum after the loop
       
    }
}
