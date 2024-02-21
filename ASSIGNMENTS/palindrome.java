import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //boolean ispalindrome = false;
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);

        }
        System.out.println("REVERSED String = " + rev);
        if(str.equals(rev)){
           System.out.println("Palindrome");
        }
        else{
            System.out.println("not");
            
        }
        sc.close();
       
       
    }
    
}
