import java.util.Scanner;

public class lec3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("EQUAL");

        }else{
            if(a>b){
                System.out.println("a is greater");

            }else{
                System.out.println("a is lesser");
            }
        }
        
        /*or else if(a>b){
            System.out.println("a is greater");

        }
        else{
            System.out.println("b is greater");
        }*/
    }
    
}
