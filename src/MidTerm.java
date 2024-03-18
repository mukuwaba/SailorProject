import java.util.Scanner;

public class MidTerm {
    public static void main(String[] args) {

        //get data
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of wanted asterisks between 1-100: ");

        //store count
        int asterisk = input.nextInt();
        int counter = 1;

        //write asterisks till reach number limit
        while( counter <= asterisk ) {

            if(asterisk <= 100) {
                System.out.printf("*");
                counter = counter + 1;
            } else{
                System.out.printf("Please enter a number less than 100");
                counter = counter + asterisk;
            }

        } //while_end
    } //main_end
} //class_end
