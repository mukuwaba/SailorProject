import java.util.Scanner;

public class Chptr5pt2 {
    public static void main(String[] args) {

        String star  = "*";
        String space = " ";

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int count = 1; //big loop

        int count2 = size - 1; //start spaces
        int count3 = 1; // start stars

        int loop = 0;
        int loop2 = 0;



        if(size <= 19 & size >= 1) {

            while ( count < size - 1 ) {
                while (loop < count2) {
                    System.out.printf("%s", space );

                    loop = loop + 1;
                } //while 1 close
                while ( loop2 < count3 ) {
                    System.out.printf("%s", star );

                    loop2 = loop2 + 1;
                } //while 2 close
                if ( loop2 == count3 & loop == count2 ) {
                    System.out.printf("\n");

                    count2 = count2 - 1;
                    count3 = count3 + 2;

                    loop = 0;
                    loop2 = 0;

                    count = count + 1;
                } //if close
            } //while end



            int count4 = 1; //big loop

            int count5 = count2 + 2; //middle spaces
            int count6 = count3 - 4; // middle stars

            int loop3 = 0;
            int loop4 = 0;



            while ( count4 < size - 2 ) {
                while (loop3 < count5) {
                    System.out.printf("%s", space );

                    loop3 = loop3 + 1;
                } //while 1 close

                while ( loop4 < count6 ) {
                    System.out.printf("%s", star );

                    loop4 = loop4 + 1;
                } //while 2 close

                if ( loop3 == count5 & loop4 == count6 ) {
                    System.out.printf("\n");

                    loop3 = 0;
                    loop4 = 0;

                    count5 = count5 + 1;
                    count6 = count6 - 2;

                    count4 = count4 + 1;
                } //if close

            } //while 2 end

        } //main size if end

    } //main end
} //class end
