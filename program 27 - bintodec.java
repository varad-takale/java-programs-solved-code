public class bintodec {

    public static void bintodec(int binum){
       int mynumb = binum;
        int decnum = 0;
        int pow = 0;
         while( binum>0){
            int lastdigit = binum % 10;
            decnum = decnum +( lastdigit *(int) Math.pow(2,pow));

            pow++;
            binum= binum/10;

         }
         System.out.println("binary of " + mynumb + " = " +decnum);
    }
    public static void main(String[] args) {
        bintodec(1111);
    }
}