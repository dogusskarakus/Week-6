import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DatabaseConnect {

    public static void main(String[] args) {

        Connection connect = null;
        String url ="jdbc:mysql://localhost/univercity?user=root&password=mysql";
        try {

            connect = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());

        }


    }
}
