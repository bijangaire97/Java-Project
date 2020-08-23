package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDbDemo {
	// Statement - prefered when an operation has to be carried out for single time
	// PreparedStatement - prefered when multiple operations has to be carried out

	public static final String SQL = "create database user_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);
			System.out.println("db created..");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
