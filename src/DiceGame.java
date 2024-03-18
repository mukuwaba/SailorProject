import java.io.PrintStream;
import java.security.SecureRandom;

public class DiceGame {

    //Create object
    private static final SecureRandom randomNumber = new SecureRandom();

    //Define enum
    private enum Status {CONTINUE, WON, LOST};

    //Constant
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int LEVENSIES = 11;
    private static final int BOX_CARS = 12;

    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int myPoint = 0;
        Status  gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case LEVENSIES:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        } //switch end

        while( gameStatus == Status.CONTINUE ) {
            sumOfDice = rollDice();

            if( sumOfDice == myPoint ) {
                gameStatus = Status.WON;
            } //if1end
            else {
                if( sumOfDice == SEVEN ) {
                    gameStatus = Status.LOST;
                } //if2end
            } //else_end
        } //while_end


        if( gameStatus == Status.WON ) {
            System.out.println("Player wins!");
        }
        else {
            System.out.println("Player loses!");
        }



    } //main end

    private static int rollDice() {

        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("\n Die 1 = %d \n Die 2 = %d \n", die1, die2);

        return sum;
    } //rollDice

} //class end
