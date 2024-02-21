import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        int last;
        int sum = 0;

        // to calculate number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        System.out.println("digits = " + digits);

        temp = n; // assign n to temp to retain the original value

        // to calculate power
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }
        System.out.println("Sum = " + sum);

        if (n == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
