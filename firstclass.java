import java.util.*;
public class firstclass{
    //public means anyone can access this class 
    //function is a collection of code 
//class is gropu of properties and functions 
//we are using "STATIC " because we want to run below psvm (main) function without creating a object of class "firstclass"
//void is the return type pf the function
//strings args[] is a command line argument 
//whatever we will give in terminal it will print that 
    public static void main(String[] args) {
        //whatever we will give in terminal it will print that 
        //System.out.println(args[0]);

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);

        System.out.println("Hello World \n Hiiiiii");
        System.out.println("Hello iter");
        

    }
}
//system has a variable called out which is a type called printstream and out has method called println
