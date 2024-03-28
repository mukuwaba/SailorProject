public class IntArray {
    public static void main(String[] args) {

        //int the array
        //10 elements (0-9)
        int[] array = new int[10];

        //print header row
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for ( int counter = 0; counter < array.length; counter++ ){
            System.out.printf("%5d%8d%n", counter, array[counter]);

        }

        array[0] = 123423;
        array[5] = 999999;

        int sum = 0;

        //no guarantee of order
        for ( int someElementInTheArray : array ) {
            sum += someElementInTheArray + 2;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for ( int counter = 0; counter < array.length; counter++ ){
            System.out.printf("%5d%8d%n", counter, array[counter]);

        }

    }
} //class end
