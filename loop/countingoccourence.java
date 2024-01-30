import java.util.*;
public class countingoccourence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //count the occurence of a device taken as input from a number 
        System.out.println("Enter the digit to count : " );
        int n = sc.nextInt();
        System.out.println("Enter the number from ehich digit will be counted : ");
        int number = sc.nextInt();
        int count = 0;
        while (number>0) 
        {
            int last_digit = number %10;
            if(last_digit == n){
                count++;

            }
            number = number/10;

            
        }
        System.out.println("occourence of " + n + "= " + count);

    }
    
}
