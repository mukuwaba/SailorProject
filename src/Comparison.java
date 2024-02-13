

import java.util.Scanner;

//booleans
public class Comparison {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        if( number1 == number2 ) {
            System.out.printf("%s%n%d = %d%n%s%n", "Hello", number1, number2, "All Done.");
        }
        //IF 1 CLOSE

        if( number1 != number2 ) {
            System.out.printf("%d != %d%n", number1, number2);
        }
        // IF 2 CLOSE

        if (number1 < number2){
            System.out.printf("%d < %d%n", number1, number2);
        }
        // IF > CLOSE

        if (number1 > number2){
            System.out.printf("%d > %d%n", number1, number2);
        }

    }
    // MAIN CLOSE

}
// CLASS CLOSE