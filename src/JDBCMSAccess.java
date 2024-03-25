import java.sql.*;
import java.util.Scanner;


public class JDBCMSAccess {
    public static void main(String[] args) throws SQLException {

        //creates a reference to a connection object
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/sailor.rooley/DatabaseSR.accdb");

        //creates statement object
        Statement st = con.createStatement();

        Scanner stringScanner = new Scanner(System.in);
        String userInput = stringScanner.next();


        //creates a reference to execute the SQL statement
        ResultSet rs = st.executeQuery("SELECT * FROM Student");


        // get header row information
        ResultSetMetaData rsmd = rs.getMetaData();
        int numberColumns = rsmd.getColumnCount();

        //print header row per se
        for( int count = 1; count <= numberColumns; count ++ ) {
            System.out.printf("%s\t ", rsmd.getColumnName(count));
        }



        //loop through each row and print table
        while ( rs.next() ){
            System.out.println("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\n" );
        }


        //close connection
        rs.close();
        st.close();
        con.close();

    } //main end
} //class end
