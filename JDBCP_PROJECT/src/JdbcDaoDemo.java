//Example with Design Pattern - DAO = Data Access Object

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDaoDemo {

    public void DAO_fun() throws Exception {
        PlayerDAO pd = new PlayerDAO();

        // Connection Enable
        pd.connect();

        // Fetching data using DAO
        Player p = pd.getPlayer("Shotput");
        System.out.println("The Sportperson name of Shotput is " + p.firstname + " " + p.lastname);

        // Adding a player to DB
        Player p1 = new Player();
        p1.playerid = 133;
        p1.firstname = "ABC";
        p1.lastname = "xyz";
        p1.sports = "Long Jump";

        pd.addPlayer(p1);

    }
}

class PlayerDAO {

    Connection con = null;

    public void connect() throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String uname = "sys as sysdba";
        String pass = "oracle";
        // load the driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // create the connection object
        con = DriverManager.getConnection(url, uname, pass);
    }

    public void addPlayer(Player p) throws Exception {

        String query = "insert into player values(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, p.playerid);
        stmt.setString(2, p.firstname);
        stmt.setString(3, p.lastname);
        stmt.setString(4, p.sports);

        int rowsaff = stmt.executeUpdate();
        System.out.println(rowsaff + " row/s are affected");

    }

    public Player getPlayer(String sports) throws Exception {
        String query = "select firstname, lastname from player where sports = '" + sports + "'";
        Statement stmt = con.createStatement();
        ResultSet Playername = stmt.executeQuery(query);
        Playername.next();
        String fname = Playername.getString(1);
        String lname = Playername.getString(2);
        Player p = new Player();
        p.firstname = fname;
        p.lastname = lname;
        return p;
    }
}

class Player {
    int playerid;
    String firstname;
    String lastname;
    String sports;

}