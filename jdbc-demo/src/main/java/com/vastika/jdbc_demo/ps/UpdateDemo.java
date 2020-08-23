package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtililities;

public class UpdateDemo {

	public static final String SQL = "update user_tbl set user_name=?, password=? where id =?";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); PreparedStatement ps = con.prepareStatement(SQL);

		) {
			ps.setString(1, "updated user");
			ps.setString(2, "pooo");
			ps.setInt(3, 4);
			ps.executeUpdate();
			System.out.println("data updated..");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
