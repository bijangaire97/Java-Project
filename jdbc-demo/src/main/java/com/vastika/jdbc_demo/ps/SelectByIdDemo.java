package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtililities;

public class SelectByIdDemo {
	public static final String SQL = "select * from user_tbl where id =?";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); PreparedStatement ps = con.prepareStatement(SQL);) {
			ps.setInt(1, 2);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
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
