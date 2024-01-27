import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class lec3_hw_q2{
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);    
int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();

        switch(operation){
            case 1: System.out.println("a + b = " + (a + b));
            break;
            case 2: System.out.println("a-b = " + (a - b));
            break;
            case 3:System.out.println("a * b =" + (a*b));
            break;
            case 4:System.out.println("a / b =" + (a/b));
            break;
            case 5:
            System.out.println("a %b = " + (a%b));
            break;

            default:
            System.out.println("INVALID OPERATOR");


        }

    }

}
