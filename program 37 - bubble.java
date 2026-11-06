import java.util.Scanner;

public class bubble{

    public static void bubblesort(int arr[]){

        for(int turn=0; turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
         Scanner sc = new Scanner(System.in);


          System.out.print("enter the size of array : ");
         int n = sc.nextInt();
         int arr[] = new int[n];
              
         System.out.println("enter numbers : ");

         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
         }
          System.err.print(" original array = ");
            bubblesort(arr);
            printarr(arr);

            System.out.print("sorted array = ");
            
            printarr(arr);

            sc.close();

    }
}