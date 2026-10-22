import java.util.*;

public class binar {
public static int binarrysearch(int numbers[],int key){

        int start = 0, end= numbers.length-1;
        while(start <= end){
               int mid  = (start + end )/2;

               if(numbers[mid]==key){
                return mid;
               }
               if (numbers[mid]<key){
                start = mid+1;
               }else{
                  end=mid-1;
        }
    }
    return -1;
    
}



    public static void main(String[] args) {
        int numbers[] ={2,4,5,6,7,8,9,1};
        Scanner sc = new Scanner (System.in);
        int key = sc.nextInt();

      System.out.println("index for key is :"+ binarrysearch(numbers,key ));
        
    }
}
