
public class typecasting {
    //we are giving integer to a float input and it is automatically converted to float .by computer.
    //how????
    
    //the source type (in left hand ) shold be greter than destination type(right hand)
    //example int a = nextFloat(); //in right side it is float>int hence eror ..
    //float a=sc.nextInt(); possible
    public static void main(String[] args) {
        
    

    int num= (int)67.5;//here we typecasted float value 67.5 to integer
    System.out.println(num);

    int a =257;
    byte b= (byte)a;
    System.out.println(b);

    //maximun value we can store in a byte is 256
    //hence we can not store 257 in byte as its maximun is 256
    //in this case when value 257 is cast into  byte .it prints or the result is REMAINDER OF 256 and the maximum value of byte



    /*here byte multiplied by byte will give byte . hence 40 X 50 = 2000. and we know that byte maximu is 256 . now how 2000 is stored in byte
     * to handle this problem java automatically converting or promoting each byte to integer when it is evaluating the expression "c *d"
     * since it is a byte it is automatically converted to larger than its that is to integer.
     * but we can not assign a int value to byte
     */
     byte c = 40;
     byte d = 50;
     byte e = 100;
     int f = (c*d)/e;
     System.out.println(f);


     //we cannot assign int to byte
     //byte g = 50;
     //g = g *2;

     //this gives error as g * 2 is integer but we are assigning it to a byte . which is not possible 
     //here we have to do casting explicitly
     
     //Automatic type conversion
     int number = 'A';//it gives ASCII value of "A"
     System.out.println(number);

    }

}
