package U.baseDeDades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection cony = null;
        try {
			Class.forName("com.mysql.jdbc.Driver");
			cony = DriverManager.getConnection("jdbc:mysql://192.168.4.1/futbol", "foot", "ball");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
