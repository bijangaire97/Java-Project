package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtililities;

public class SelectDemo {
	public static final String SQL = "select * from user_tbl";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); Statement st = con.createStatement();) {
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				System.out.println("User id : " + rs.getInt("id"));
				System.out.println("User name is: " + rs.getNString("user_name"));
				System.out.println("User password is: " + rs.getString("password"));
				System.out.println("===============");
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
