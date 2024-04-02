/**
public class PassArray {
    public static void main(String[] args) {
        int[] array = {};

        System.out.printf(
                "Effects of passing reference to an array: %n" +
                "The values of the original array are: %n"
                );

        for ( int value : array ) {
            System.out.printf("%d", value);

        }

        modifyArray(array);
        System.out.printf("%n%nValues of modified array are:%n");


        for ( int value : array ) {
            System.out.printf("%d", value);

        }

        System.out.printf("%n%nEffects of passing array element value:%n" +
                "array[3] before modifyElement: %d%n", array[3]);

        modifyArray(array[3]);
        System.out.printf("%n%nArray[3] after modifyElement %d%n%n", array[3]);

        private static void modifyElement(int i) {

        }


    } //main end
} //class end
*/

