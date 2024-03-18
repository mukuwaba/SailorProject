import java.util.Scanner;

//
// looping examples
public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        //Loop through and process grades
        while( grade != -1 ){

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }


        if( gradeCounter != 0 ) {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of all %d grades is %d%n", total);
            System.out.printf("Class average is %.2f%n", average);
        } else{
            System.out.println("No grade were entered.");
        }

    } //END main
} //END class

