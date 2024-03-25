public class Chptr5 {
    public static void main(String[] args) {

        String star  = "*";
        String space = " ";

        int count = 1;

        int count2 = 9;
        int count3 = 1;

        int loop = 0;
        int loop2 = 0;

        int count4 = 1;

        int count5 = 6;
        int count6 = 7;

        int loop3 = 0;
        int loop4 = 0;



        while ( count < 6 ) {
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



        while ( count4 < 5 ) {
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




    } //main end
} //class end
