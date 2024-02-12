import java.util.Scanner;
public class enhancedswitch{
    public static void main(String[] args) {
        System.out.println("enter a case");
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();
        switch(buttom){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("INVALID BUTTOM");

            
        }
        
    }
    
}
// /sothis i the important factor of the year 
