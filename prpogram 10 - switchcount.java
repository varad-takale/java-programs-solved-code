import java.util.Scanner;

public class switchcount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1: System.out.println("i am rich");
                
                break;

                case 2 : System.out.println("i am intelligent");
                   break;

        
            default: System.out.println(" you are handsome");
                break;
        }
    }
}