import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int fCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in a range 0-100",
                "Type the end of file indicator to terminate the input",
                "On UNIX/Linux/mac(S type <ctrl> z then press Enter",
                "On Windows type <ctrl> d then press Enter" );


        while( input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

         switch (grade / 10) {
            case 9:
            case 10:
                ++aCounter;
                break;
            case 8:
                ++bCounter;
                break;
            case 7:
                ++cCounter;
                break;
            case 6:
                ++dCounter;
                break;
            default:
                ++fCounter;
                break;
         }
        }

        if( gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of %d grades entered is %d%n", gradeCounter, total );
            System.out.printf("Class average is %.2f%n", average );
            System.out.printf("%n%s %n%s%d%n%s%d%n%s%d%n%s%d%n%s%d",
            "Number of students who received each grade.",
            "A: ", aCounter,
            "B: ", bCounter,
            "C: ", cCounter,
            "D: ", dCounter,
            "F: ", fCounter
            );
        }




    } //main

} //class
