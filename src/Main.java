import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;



public class Main {



    public static void main(String[] args) throws Exception {



        String sql = "select name from demo where id=2";

        String url = "jdbc:postgresql://localhost:5432/mydb";
        String username = "postgres";
        String password = "721999";


            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();


            String name = rs.getString(1);
            System.out.println(name);
            


    }
}