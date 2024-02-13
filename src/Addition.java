
// Begin

import java.util.Scanner;

public class Addition{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    // text question

    int number1 = input.nextInt();
    // get value from user

    System.out.println(number1);
    // resend variable typed

    System.out.printf("Enter second integer: ");


    int number2 = input.nextInt();

    System.out.println(number2);
    // resend variable typed

    int sum = number1 + number2;

    System.out.printf("The sum of the numbers is: %d%n", sum );


    }
    // END: main
}
// END: class Addition

