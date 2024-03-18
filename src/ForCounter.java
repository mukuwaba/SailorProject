public class ForCounter {
    public static void main(String[] args) {

        //Inits
        int total = 0;


        //Loop 10x, Printing each
        for( int counter = 2; counter <= 20; counter+= 2 ) {
           total += counter;
           System.out.printf("counter=%d -->Sum =%d \n",counter, total);
        } //for-loop 1



    } //main
} //class
