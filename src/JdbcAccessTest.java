import java.sql.*;

public class JdbcAccessTest {
    public static void main(String[] args) throws SQLException {

        String databaseURL = "jdbc:ucanaccess://C:/Users/sailor.rooley/DatabaseSR.accdb";

        try( Connection connection = DriverManager.getConnection(databaseURL) ){
            String sql = "INSERT INTO Student (FirstName, LastName) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Timothy");
            preparedStatement.setString(2, "ned@yahoo.com");
            int row = preparedStatement.executeUpdate();
            if( row > 0 ){
                System.out.println("A row has been inserted");
            } //if end
            preparedStatement.close();

        } catch( SQLException ex ){
            ex.printStackTrace();
        }


    } //main end
} //class end
