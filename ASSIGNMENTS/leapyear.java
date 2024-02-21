import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year : ");
        year = sc.nextInt();
        boolean is_leapyear = false;
        if (year % 4 == 0) {
            is_leapyear = true;
 
            // To identify whether it is a
            // century year or not//
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leapyear = true;
                else
                    is_leapyear = false;
            }
        }
 
        // We land here when corresponding if fails
        // If year is not divisible by 4
        else
 
            // Flag dealing-  Non leap-year
            is_leapyear = false;
 
        if (!is_leapyear)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
        
    }
//OR

    /* // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not
        // century year 
     if ((year % 400 == 0)
            || ((year % 4 == 0) && (year % 100 != 0))) {
  */
    

/*A leap year is a year that is exactly divisible vy 4 except for century year(years ending eith 00)
 * the century year cab=n be a leap year only if it is perfectly divisible by 400
 */
//if a leap year is exactly divisible by 4 then it should not be divisible by 100.and if it is divisible by 100 then it should be divisible by 400
