
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://127.0.0.1:3306/aliens";
        String uname = "root";
        String pass = "12345678";

        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        Connection con = DriverManager.getConnection(url, uname, pass);

        // Create a statement object
        Statement st = con.createStatement();


/*  This is DQL for quering the data
        // Query to fetch data
        String query = "SELECT id, username FROM students";

        // Execute the query
        ResultSet rs = st.executeQuery(query);

        // Loop through the results
        while (rs.next()) {
            int id = rs.getInt("id"); // Fetch the id as an integer
            String username = rs.getString("username"); // Fetch the username as a string

            // Print the result
            System.out.println(id + " : " + username);
        } */


        String query = "INSERT INTO students (userName) VALUES ('Ram');";

        int count = st.executeUpdate(query);
        System.out.println(count);

        // Close resources

        st.close();
        con.close();
    }
}
