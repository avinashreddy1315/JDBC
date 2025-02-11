import java.sql.*;


public class PreparedStatment {
    public static void main(String[] args)throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/aliens";
        String uname = "root";
        String pass = "12345678";
        String userName = "murthi";
        String query = "INSERT INTO students (userName) VALUES (?)";


        // Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, userName);


        // Execute the update
        int count = st.executeUpdate();
        System.out.println(count + " row(s) inserted.");



        Statement st1 = con.createStatement();

        ResultSet rs = st1.executeQuery("select * from students");

        while(rs.next()){
            int id = rs.getInt(1);
            String username = rs.getString(2);

            System.out.println(id + " : " + username);

        }


        st.close();
        st1.close();
        con.close();
        rs.close();
    }

}
