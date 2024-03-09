import java.sql.*;
public class Getdata {
	
	public void get() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/studentmanagementsystem";
		String username = "root";
		String password = "0211";
		String Query = "select * from studentdata";
		Connection con = DriverManager.getConnection(url, username, password);
	Statement smt = con.createStatement();
	ResultSet rst = smt.executeQuery(Query);
	while(rst.next()) {
		System.out.println("StudentId :"+rst.getString(1));
        System.out.println("FirstName :"+rst.getString(2));
		System.out.println("LastName :"+rst.getString(3));
		System.out.println("Dob :"+rst.getString(4));
		System.out.println("Gender :"+rst.getString(5));
		System.out.println("Email :"+rst.getString(6));
		System.out.println("Phone :"+rst.getString(7));
		
		
	}
	con.close();
	}
	
public static void main(String[]args) throws Exception {
     Getdata obj = new Getdata();
     obj.get();
}
}
