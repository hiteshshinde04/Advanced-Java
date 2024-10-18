package ADJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[]args) throws Exception {
		
		//------------USer Values------------
		String name1= "Vaibhav";
		String email1="vaibhav@gmail.com";
		String pass1="vaibhav123";
		String gender1="male";
		String city1="Pune";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","admin");
		
		
		/*PreparedStatement ps= con.prepareStatement("insert into register values('Hitesh','hitesh@gmail.com','hitesh123','male','Pune') ");
		
		OR*/
		
		PreparedStatement ps= con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4,gender1);
		ps.setString(5, city1);
		
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}
}
