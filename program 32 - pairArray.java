public class pairArray {
 
    public static void paiarray (int numbers[]){

        int tp = 0;

        for (int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
            tp++;
            System.out.print("(" + curr + numbers[j] + ")");
        }
        System.out.println();
    }
    
 System.out.println("Total Pairs = " + tp);
        
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8};
        paiarray(numbers);
       

    }
    
}