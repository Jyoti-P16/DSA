import java.util.Scanner;
public class Alphabetcasecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        //trim() means it removes extra spaces from a input 
        // to check upper case or lower case 
        //using ASCIIIII
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Upper case ");
        }


    }
    
}
