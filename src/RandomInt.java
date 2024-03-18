import java.security.SecureRandom;

public class RandomInt {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        //loop 20 dice roll
        for(int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d", face);

            //#of roles
            if( counter %  5 == 0 ){
                System.out.println();
            }
        } //loop

    }//main
}//class
