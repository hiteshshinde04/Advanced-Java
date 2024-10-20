package ADJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	
	public static void main(String[]args) throws Exception {
		String city1="Chalisgaon";
		String email1="nitin123@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "admin");
		
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1,city1);
		ps.setString(2, email1);
		
		int count = ps.executeUpdate();
		if(count > 0) {
			System.out.println("Updated Successfully");
		}
		else {
			System.out.println("Updated Failed");
		}
		
	}
}
