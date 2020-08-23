package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtililities;

public class InsertDemo {

	public static final String SQL = "insert into user_tbl(user_name,password) values(?,?)";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); PreparedStatement ps = con.prepareStatement(SQL);

		) {
			ps.setString(1, "user4");
			ps.setString(2, "ff");
			ps.executeUpdate();
			System.out.println("data inserted..");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
