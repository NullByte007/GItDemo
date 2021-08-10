package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

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

String insertCommand1="CREATE TABLE customer(custId INT(4),custName VARCHAR(30),primeMember boolean)";
String insertCommand2="INSERT INTO customer values (1,'Aniket',true)";

int i=0;

	Connection cn = null;
	Statement st = null;
	try {
	cn = DriverManager.getConnection(url,username,password);
	st = cn.createStatement();
	i = st.executeUpdate(insertCommand1);
	i = st.executeUpdate(insertCommand2);
	
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	System.out.println(i + "RECORD ADDED ! ");
		
	}

}
