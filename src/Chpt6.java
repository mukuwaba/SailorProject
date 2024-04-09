import java.security.SecureRandom;
import java.util.Scanner;

public class Chpt6 {

    private static final SecureRandom randomNumber = new SecureRandom();


    public static void main(String[] args) {
        int myPoint = 0;

        while ( myPoint <= 10 ) {
            int die1 = 1 + randomNumber.nextInt(9);
            int die2 = 1 + randomNumber.nextInt(9);
            int sum = die1 * die2;

            System.out.printf("\n What is %d * %d ?\n", die1, die2);


            Scanner total =  new Scanner(System.in);
            int userInput = Integer.parseInt(total.next());

            if ( userInput == sum ) {
                System.out.printf("\nVery Good!\n");

                myPoint = myPoint + 1;

                System.out.printf("Score: %d\n", myPoint);
            }
            else {
                System.out.printf("\nNo. Please try Again.\n");
            } //else end
        } // while end
    } //main end
} //class

