import java.util.*;
public class user10 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("enter the number :");
            int n = sc.nextInt();
         
            if (n%10==0){break;}
               System.out.println(n);
            
        }
        while(true);
            {
            System.out.println("error : multiple of 10");
        }
    }
    
}