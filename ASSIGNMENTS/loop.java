import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int sum =0;
        while(true){
            System.out.println("Enter a number n(or x to stop )");
            input = sc.nextLine();
            if(input.equals("x")){
                break;
            }
            else{
                try{
                    int n = Integer.parseInt(input);
                    sum+=n;

                }catch(NumberFormatException e){
                    System.out.println("Invalid Input. Enter a valid input.");
                }
            }
        }
        sc.close();
        System.out.println("SUM= " + sum);
    }
    
}
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
