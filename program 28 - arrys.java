import java.util.*;

public class arrys {

    public static void main(String[] args) {
        
    

    int Mark[]= new int[100];
Scanner sc = new Scanner(System.in);



   Mark[0] = sc.nextInt();
   Mark[1] = sc.nextInt();
   Mark[2] = sc.nextInt();

   System.out.println("phy :"+ Mark[0]);
    System.out.println("chem :"+ Mark[1]);
     System.out.println("math :"+ Mark[2]);

     int percentage = (Mark[0]+Mark[1]+Mark[2])/3;
     System.out.println("percentage :"+ percentage + "%");


   

}


}