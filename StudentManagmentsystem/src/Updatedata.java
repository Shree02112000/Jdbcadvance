import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatedata {

	public void update()throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/studentmanagementsystem";
		String username = "root";
		String password = "0211";
		String Query = "update studentdata set LastName='sm' where studentID = 'S101'";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
	    pst.executeUpdate();
	    con.close();
	    
	}
public static void main(String[]args)throws Exception {
	Updatedata obj = new Updatedata();
	obj.update();
}

}
