//start
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number to START: ");
        // text question

        int number1 = input.nextInt();
        // get value from user

        System.out.print("Enter second number: ");

        int number2 = input.nextInt();


        System.out.print("Enter Operation:");
        // enter operation

        System.out.print("\n add \n subtract \n multiply \n divide \n");

        String add = "+"; // variable
        String subtract = "-"; // variable
        String multiply = "*"; // variable
        String divide = "/"; // variable


        String operation = input.next(); //prompt user

        System.out.printf("%b", operation.equals("+"));

        if ( operation.equals(add) ) {
            int result = number1 + number2;
            System.out.printf("%s%n%d + %s%n%d = %s%n%d", number1, number2, result, "All Done.");
        }

        //if( operation.equals(subtract) ) {
            //int result2 = number1 - number2;
            //System.out.printf("%s%n%d - %d%n%s%n = %d", number1, number2, result2, "All Done.");
        //}
        //if( input.equals(multiply) ) {
            //int result3 = number1 * number2;
            //System.out.printf("%s%n%d * %d%n%s%n = %d", number1, number2, result3, "All Done.");
        //}
        //if( input.equals(divide) ) {
            //int result4 = number1 / number2;
            //System.out.printf("%s%n%d / %d%n%s%n = %d", number1, number2, result4, "All Done.");
        //}




    }
}
