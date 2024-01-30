import java.util.*;
public class Reverse_num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        String ans = " ";
        while(n>0){
            int lastdigit = n %10;
            ans += String.valueOf(lastdigit);
            n=n/10;
        }

        System.out.println("Reversed Number =  " + ans );*/

        int num = 28479;
        int ans = 0;
        while(num>0){
            int rem =  num %10;

            ans = ans *10 + rem;
            num = num/ 10;


        }
        System.out.println("Reversed number = " + ans);


    }
    
}
