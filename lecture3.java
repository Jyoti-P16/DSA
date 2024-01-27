import java.util.Scanner;
public class lecture3 {
    public static void main(String[] args) {
        //CONDITIONAL STATEMENTS
        //AGE>18
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("ADULT");


        }else{
            System.out.println("Notadult ");
        }

    }
    
}
