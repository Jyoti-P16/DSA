import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
       float a = sc.nextFloat();
       float b = sc.nextFloat();
       System.out.println("Enter a operator(+,-,*,/): ");

       char op = sc.next().charAt(0);
      
       if(op == '+'){
         System.out.println("a + b = " +( a+b));


       } 
       else if(op == '-'){
        System.out.println("a - b = " + (a-b));
       }
       else if(op == '*'){
        System.out.println("a x b = "+ (a*b));
       }
       else if(op == '/'){
        if(b==0){
            System.out.println("dividion not possible");
        }
        System.out.println("a x b = "+ (a*b));
       }
       else{
        System.out.println("Invalid operator entered ");
       }

    }
    
}
//Note is that we should take operator as input in char data type and while equalling or checking or matching write operator in single coat not in double
