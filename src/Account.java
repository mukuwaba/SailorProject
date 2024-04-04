import java.sql.*;
import java.util.Scanner;


public class Account {
    public static void main(String[] args) {

        String databaseURL = "";


        System.out.println("Do you have an account?");
        System.out.println("Type: \n  login \n  create");

        Scanner loginput = new Scanner(System.in);
        String login = loginput.next();

        if (login == "login") {
            try( Connection connection = DriverManager.getConnection(databaseURL) ) {
                String sql = "SELECT";

                //enter username
                System.out.println("Username:");

                //search username
                //"username not found"
                //enter password
                

                connection.close();
            } //try end
            catch (SQLException ex) {
                ex.printStackTrace();
            } //catch end

        } else if (login == "create") {

            //set name
            System.out.println("Please enter your first name");
            Scanner finput = new Scanner(System.in);
            String FirstName = finput.next();
            System.out.println("Please enter your last name");
            Scanner linput = new Scanner(System.in);
            String LastName = linput.next();

            //set username
            System.out.println("Choose a username");
            Scanner uinput = new Scanner(System.in);
            String UserName = uinput.next();

            //set password
            System.out.println("Choose a password");
            Scanner pinput = new Scanner(System.in);
            String Password = pinput.next();


            try( Connection connection = DriverManager.getConnection(databaseURL) ) {
                String sql = "INSERT INTO Account (FirstName, LastName, UserName, Password) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, FirstName);
                preparedStatement.setString(2, LastName);
                preparedStatement.setString(3, UserName);
                preparedStatement.setString(4, Password);
                int row = preparedStatement.executeUpdate();
                if( row > 0 ) {
                    System.out.println("account has been created");
                } //if end

                preparedStatement.close();
                connection.close();
            } //try end
            catch (SQLException ex) {
                ex.printStackTrace();
            } //catch end

        } //end else if


    } // main end
} // class end
