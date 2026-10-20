public class largestofArray {
          public static int getlargest(int numbers[]){

             int largest = Integer.MIN_VALUE;
             int index = 0;

            for (int i =0; i<numbers.length;i++) {
            
                if(largest < numbers[i]){
                    largest = numbers[i] ;
                    index = i;
                }
          }
            return index;
         }    
    public static void main(String[] args) {
        int numbers[]= {10,7,5,8,2,9,1,4};
        int index = getlargest(numbers);
            
        System.out.println("LARGEST VALUE IN ARRAY IS :"+ numbers[index]);
        System.out.println("NUMBER AT INDEX :" + index);
    }
}