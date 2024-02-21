import java.util.Scanner;
public class SimpleInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P,T and R: ");
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        int T = sc.nextInt();

        double SI = (P*T*R)/100;
        System.out.println("Simple Interest = "+ SI + "RS");
    }
    
}
