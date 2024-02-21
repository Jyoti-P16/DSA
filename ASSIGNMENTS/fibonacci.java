import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n upto which u want series: ");
        int n= sc.nextInt();
        int a=0, b =1;
        //;//as wehave aleardy taken first two fibo numbers i.e 0 and 1
        System.out.print(a + " " + b + " ");
        for(int i =2;i<n;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(b + " ");
            
        }
    }
    
}
