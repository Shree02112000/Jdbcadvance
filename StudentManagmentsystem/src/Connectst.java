import java.sql.*;
public class Connectst {
public static void main(String[]args) {
	String url = "jdbc:mysql://127.0.0.1:3306/studentmanagementsystem";
	String username = "root";
	String password = "0211";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Database connected successfully");
		con.close();
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
