package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcInsertDemo {

	public static void main(String[] args) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	String url = "jdbc:mysql://localhost:3306/telstra";
	String username="root";
	String password = "<MY_PASSWORD_GOES_HERE !>";

	
	String insertCommand="INSERT INTO employee values (8417,'Aniket','CEO')";
	int i=0;
	
		Connection cn = null;
		Statement st = null;
		try {
		cn = DriverManager.getConnection(url,username,password);
		st = cn.createStatement();
		i = st.executeUpdate(insertCommand);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println(i + "RECORD ADDED ! ");

}
}












