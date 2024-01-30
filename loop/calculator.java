import java.util.*;
public class calculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    

    while(true){
    
    System.out.println();
    System.out.println("Enter the operator ");
    char op = sc.next().trim().charAt(0);
    
    if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
        System.out.println("Enter two numbers : ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
        if(op=='+'){
            ans = n1 + n2;

        }
        if(op=='-'){
            ans = n1 - n2;
        
        }
        if(op=='*'){
            ans = n1 * n2;

        }
        if(op=='/'){
            if(n2!=0){
            ans = n1 / n2;
            }

        }
        if(op=='%'){
            ans = n1 % n2;

        }


        

    }
    else if(op == 'X' || op == 'X'){
        break;
    }else{
        System.out.println("Invalid Operator");

    }
    System.out.println("output = " + ans); 
   }
   
}
}
