import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottom = sc.nextInt();
        if(bottom==1){
            System.out.println("Hello");
        }else if(bottom==2){
            System.out.println("Namaste");

        }else if(bottom==3){
            System.out.println("BONJOUR");
        }else{
            System.out.println("Nothing bro");
        }

    }

    
}
