import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
/*method 1 
        int max = a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;

        }
       
        System.out.println("maximun = " + max);

    }
    

    //METHOD 2
    int max = 0;
    if(a>b){
        max = a;

    }else{
        max = b;
    }

    if(c>max){
        max = c;
    }
    System.out.println("Largest = " + max);*/

    //METHOD 2
    int max = Math.max(c, Math.max(a,b));
    System.out.println(max);

}
}
