p;
        
        }
        System.out.println("digits = " + digits);
        temp =n;//write this to assign n to tmp neither previous tmp value will execute
        //to calvulate power
    while(n>0){
        last = temp%10;
        Sum +=  (Math.pow(last, digits));
        temp = n/10;//last digit removed updated 
    }
    System.out.println("Sum = " + Sum);
    if(n==Sum){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not palindrome");
    }
    
    }
    
}
