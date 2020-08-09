package bean;
import java.sql.*;
public class DbConnect {
	private static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String userName="sa";
	private static String userPwd="123";
	private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=School";
	public static Connection getDBconnect() {
		try {
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url, userName, userPwd);
			System.out.println("ok!");
			return con;	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("no!");
		}
		return null;
		
	}
	public static void closeDB(Connection con,PreparedStatement pstm,ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(pstm!=null) pstm.close();
			if(con!=null) con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}