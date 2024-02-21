import java.util.*;
public class largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("largest = " + a);
        }else{
            System.out.println("Largest = " + b);
        }

    }
    
}
