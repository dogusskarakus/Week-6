import java.sql.*;

public class DBConn {


    // Veri tabanına bağlanma
/*    public static final String DB_URL = "jdbc:mysql://localhost/univercity";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql =" SELECT * FROM student";
        String insertSql = "INSERT INTO (student_name, student_class) VALUES ('Damla') );


        try {
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.println("ID :"+ data.getInt("student_id"));
                System.out.println("Ad :"+ data.getString("student_name"));
                System.out.println("Sınıf :"+ data.getInt("student_class"));
                System.out.println("########");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/



    public static final String DB_URL = "jdbc:mysql://localhost/univercity";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        Connection connect = null;

        try {
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name,student_class VALUES (?,?)" );
            pr.setString(1,"John");
            pr.setInt(2,1);
            pr.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

}


