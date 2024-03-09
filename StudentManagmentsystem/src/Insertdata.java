import java.sql.*;

public class Insertdata {
	
	public void insert()throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/studentmanagementsystem";
		String username = "root";
		String password = "0211";
		String Query = "insert into studentdata value(?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1,"S102");
	    pst.setString(2,"Divya");
	    pst.setString(3,"shree");
	    pst.setString(4,"11/05/99");
	    pst.setString(5,"female");
	    pst.setString(6,"ds@gmail.com");
	    pst.setString(7,"9944842072");
	    pst.executeUpdate();
	    con.close();
	    
	}
public static void main(String[]args)throws Exception {
	Insertdata obj = new Insertdata();
	obj.insert();
}
}
