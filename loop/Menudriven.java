import java.util.Scanner;
public class Menudriven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
      
            do{
                System.out.println("Enter your mark : ");
                int mark = sc.nextInt();
                if(mark>=90){
                    System.out.println("This is Good");
                }else if(mark>=60 && mark<=89){
                    System.out.println("This is also good");
                }else if(mark>=0 && mark<=59){
                    System.out.println("This is good as well");
                }
                else{
                    System.out.println("work harder.");
                }

                System.out.println("to continue yes(1) or No(0)");
                input = sc.nextInt();


            } while(input==1);
        

    }
}
