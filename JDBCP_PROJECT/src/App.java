import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 7 Steps to Connect Application to database
 * 1)Import the package
 * 2)Load and Register driver
 * 3)Create Connection
 * 4)Create Statement
 * 5)Execute the query
 * 6)process the results
 * 7)close connection
 */

public class App {
    public static void main(String[] args) throws Exception {

        JdbcDaoDemo jdo = new JdbcDaoDemo();
        jdo.DAO_fun();

        // Basic JDBC Concpets
        /*
         * String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         * String uname = "sys as sysdba";
         * String pass = "oracle";
         * String query = "select * from player";
         * String sportz = "Athletic";
         * 
         * // Prepared Statement Query
         * String p_query = ("insert into player values (?,?,?,?)");
         * 
         * // load the driver class
         * Class.forName("oracle.jdbc.driver.OracleDriver");
         * 
         * // create the connection object
         * Connection con = DriverManager.getConnection(url, uname, pass);
         * 
         * // create the statement object
         * Statement stmt = con.createStatement();
         * ResultSet total_row = stmt.executeQuery("select count(*) from player");
         * total_row.next();
         * int tot = total_row.getInt(1);
         * System.out.println("The total number of rows in table : " + tot);
         * 
         * System.out.println("Ex., execute query == using DML statement - Insert");
         * 
         * // int count = stmt.executeUpdate("insert into player values(4,'Usha','PT','"
         * +
         * // sportz + "')"); // Returns number
         * // System.out.println("No. of row/s affected in DB " + count);
         * 
         * System.out.println(" Example for Prepared Statement");
         * PreparedStatement ps = con.prepareStatement(p_query);
         * ps.setInt(1, tot + 1);
         * ps.setString(2, "Amulu");
         * ps.setString(3, "R");
         * ps.setString(4, "Cycling");
         * int count1 = ps.executeUpdate();
         * System.out.println("The no of row/s affected " + count1);
         * 
         * System.out.println("Ex., execute query == using DML statement - Select ");
         * ResultSet rs = stmt.executeQuery(query);
         * while (rs.next()) {
         * System.out.println(
         * "=============================================================");
         * System.out.println(" | " + rs.getInt(1) + " | " + rs.getString(2) + " | " +
         * rs.getString(3) + " | ");
         * }
         * 
         * // close the connection object
         * stmt.close();
         * con.close();
         */

    }
}
