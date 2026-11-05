import java.util.Scanner;

public class selection {
     
     public static void selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int minpose = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpose] > arr[j]){
                    minpose = j;
                }

                
            }
            int temp = arr[minpose];
                arr[minpose] = arr[i];
                arr[i] = temp;
        }
        
    }
        
            
        

        public static void printarr(int arr[]){
            for(int i=0;i<arr.length;i++){
               System.out.print(arr[i] + " ");
            }
            
        }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       System.out.print("Enter the size of the arr : ");

       int n =sc.nextInt();
       int arr[] = new int[n];

       System.out.println("Enter numbers : " );

       for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }

       System.out.print("original array = ");
       printarr(arr);
       selectionsort(arr);

       System.out.println();

       System.out.print("sorted array = ");
       printarr(arr);

       sc.close();

       
        }
        
    }

