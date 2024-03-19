import java.util.Scanner;


public class Chptr3Test {
    public static void main(String[] args) {

        Chptr3 firstObjRef = new Chptr3();

        firstObjRef.setFirstName("Sailor");
        System.out.printf("User first name is: %s\n", firstObjRef.getFirstName() );


        Chptr3 lastObjRef = new Chptr3();

        lastObjRef.setLastName("Rooley");
        System.out.printf("User last name is: %s\n", lastObjRef.getLastName() );



    } //main end
    
} //class end
