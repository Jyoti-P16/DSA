import java.util.*;
public class switchq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number : ");
        int n = sc.nextInt();
        /*switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
             System.out.println("WEEKEND");
             break;
        }
        //instead of writting for case 1 to 5 weekend without giving a brek we have written atlast the print statement in order and again same thing for 6 ad 7 
        //hence if we put any weekday number it will show weekday





        }*/

        //or case 
        switch(n){
            case 1, 2,3,4,5 -> System.out.println("WEEKDY");
            case 6,7 -> System.out.println("WEEKDAY");

        }

        
    }
}

                                
