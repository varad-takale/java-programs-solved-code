import java.util.Scanner;

public class twodarray {

    public static boolean search(int matrix[][],int key){
          for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                 if(matrix[i][j] == key){
                    System.out.println("key found at cell" + " ( " + i + "," +j+" ) ");
                   
                    return true;
                 }
    }
}
       System.out.println(" ohhooooo key not found");
       return false;
}
    public static void main(String[] args) {
        
        int matrix [][] = new int[3][3];
        int n = matrix.length ; int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                 matrix[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                 System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        while ((true)) {
             Scanner scn= new Scanner(System.in);
                    System.out.print("enter a key number which want to found at cell :");
                     int key = scn.nextInt();
                    
        search(matrix,key);
        
        
            
        }
        
        


    }
    
}