import java.util.*;
public class stringpalindrome {

    public static boolean ispalindrome(String str){

        int n = str.length();

        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        
        while (true) {
            System.out.println();
             Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a name :");
        String str = sc.nextLine();
                System.out.print(ispalindrome(str));
              
               //sc.close();
    }
   
            
}
}