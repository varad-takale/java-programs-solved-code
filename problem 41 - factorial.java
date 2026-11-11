import java.util.Scanner;

public class factorial {

    public static void factorial(int n ){

        int f = 1 ;

    for (int i =1 ; i<=n ; i++){
                f = f*i;
    }
    System.out.println("Factorial is = " + f);

   
}


    public static void main (String args[]) {
      
        while (true) {
             Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        factorial(n);
            
        }
       

        //System.out.println(factorial(7));
    }
   
}




    