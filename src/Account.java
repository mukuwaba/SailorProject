import java.sql.*;
import java.util.Scanner;


public class Account {
    public static void main(String[] args) {

        String databaseURL = "";

        Scanner finput = new Scanner(System.in);
        String FirstName = finput.next();
        Scanner linput = new Scanner(System.in);
        String LastName = linput.next();
        Scanner uinput = new Scanner(System.in);
        String UserName = uinput.next();
        Scanner pinput = new Scanner(System.in);
        String Password = pinput.next();



        try( Connection connection = DriverManager.getConnection(databaseURL) ) {
                String sql = "INSERT INTO Account (FirstName, LastName, ) VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, finput.next());
                preparedStatement.setString(2, linput.next());
                preparedStatement.setString(3, uinput.next());
                preparedStatement.setString(4, pinput.next());
                int row = preparedStatement.executeUpdate();
                if( row > 0 ) {
                    System.out.println("A row has been inserted");
                } //if end

            preparedStatement.close();
            connection.close();
        } //try end
        catch (SQLException ex) {
                    ex.printStackTrace();
        } //catch end


    } // main end
} // class end
