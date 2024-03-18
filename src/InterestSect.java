public class InterestSect {
    public static void main(String[] args) {

        int counter = 1;

        System.out.println("DO_WHILE /////////////////////////////////////////////////////////");

        do {
            System.out.printf("%d \n", counter);
            counter++;
        } while( counter <= 10 );

        System.out.println("WHILE /////////////////////////////////////////////////////////");

        while( counter <= 10) {
            System.out.printf("%d \n", counter);
            counter++;
        }

        System.out.println("FOR /////////////////////////////////////////////////////////");

        for( counter = 1; counter <= 10; counter++) {
            System.out.printf("%d \n", counter);
            counter++;

        }



        /**
        //Init's
        double principal = 1_000.0;
        double rate = 0.05;

        //Calc amount over 10 years
        for( int year = 1; year <= 10; ++year) {
            //Calc
            double amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%, 20.2f%n", year, amount);

        }
*/

    } //main
} //class
