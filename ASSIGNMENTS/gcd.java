public class gcd {


    public static void main(String[] args) {
    
    }

    int gcd(int a, int b){
        int tmp;
        while(b>0){
            tmp=b;
            b = a%b;
            a = tmp;

        }
        return a;
    }
    
}
