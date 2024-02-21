import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Multiplication table :");
        for(int i = 1;i<=10;i++){
            System.err.println(n + "X" + i + "=" + (n*i));
        }

    }
    
}
