
import java.util.Scanner;

    public class PersonalProject {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to my game! \n Press \"1\" to start.");

            System.out.println("What would you like to be called?");
            Scanner readName = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String userName = readName.nextLine();


            int choice;
            int room = 1;
            //need to create string for name and object for inventory


            //room 1 = homescreen
            //room 2 = intro: Welcome to the Butterfly Room, where each decision could have dir consequences.
            //room 3 = Stagtown






            if(room == 1) {

                System.out.print("Enter your name: ");
                userName = readName.nextLine();

                System.out.printf("Hello, %s", readName);

                System.out.println("Click 1 to continue");
                choice = input.nextInt();


                if( choice == 1) {
                    room = 2;

                }
            }

            if(room == 2) {
                System.out.println("Welcome to the Butterfly Room, where each decision could have dire consequences");

                System.out.printf("Hello, %s", userName);

                System.out.println("Click 1 to continue");
                choice = input.nextInt();


                if( choice == 1) {
                    room = 3;

                }
            }




            System.out.print("");
        }
    }

