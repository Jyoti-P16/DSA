import java.util.Scanner;
public class lect2 {
    public static void main(String[] args) {
        //variables
        String name ="Jyoti";
       // int a = 8;
        //int b = 78;
        float c = 67.80f;
        double d=67.0000;
        //Java is a typed language meand we have to define a data type before a variale is declared 

        //DATA TYPES:-
        /*1.PRIMITIVE DATATYPES:- byte-8bits
         * short:-8 bits
         * char:-2 bytes
         * boolean:-1 byte
         * int:-4 byte
         * long:-8 byte
         * float:-4 byte
         * double:-8 byte
         
         2.NON-PRIMITIVE:
         String 
         Array
         Clas
         Object
         Interface

        */
        ///int sum=a+b;
       // System.out.println(sum);
        int a =10;
        int b=5;
        System.out.println(a*b/a-b);//this gives 0(zero) when we solve from left to right
        System.out.println((a*b)/(a-b));//this gives "10" as...it is solved acc to priority that is paranthesis is solved first


//in java BODMAS rule does not work 
//here priority is [+,/,% are greater priority than minus]
//and we solve from left to right

//INPUT
Scanner sc= new Scanner(System.in);
String n = sc.nextLine();//using "nextLine" we can take whole sentence or a line as input 
System.out.println(n);

//IDENTIFIERS AND LITERAL
int aa =45;
//here 45 is called as giteral and "a" is called as identifier
//to write 234million we usually put comma to separate digits .
//but in java we will put underscore
int e = 234_000_000;//234 million 
System.out.println(e);


    }
    
}
