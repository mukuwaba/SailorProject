import java.util.Scanner;

public class Chptr2 {
    public static void main(String[] args) {

        //2.18 Exercise
        System.out.println("*********   ***     *       *");
        System.out.println("*       *  *   *   ***     * *");
        System.out.println("*       * *     * *****   *   *");
        System.out.println("*       * *     *   *    *     *");
        System.out.println("*       * *     *   *   *       *");
        System.out.println("*       * *     *   *    *     *");
        System.out.println("*       * *     *   *     *   *");
        System.out.println("*       *  *   *    *      * *");
        System.out.println("*********   ***     *       *");


        //2.32 Exercise
        Scanner input = new Scanner(System.in);

        for( int counter = 1; counter <= 5; counter++ ) {
            //Ask
            System.out.print(" \n Enter a value: \n");
            int total = input.nextInt();

            if( total < 0) {
                System.out.printf("%d is less than 0 \n", total );
            }
            if( total > 0) {
                System.out.printf("%d is greater than 0 \n", total);
            }
            if( total == 0) {
                System.out.printf("%d is equal to 0 \n", total);
            }

        }//for_loop end

    }//main end

}//class end
