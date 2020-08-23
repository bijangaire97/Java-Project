package com.vastika.jdbc_demo.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.util.DBUtililities;

public class DeleteDemo {

	public static final String SQL = "delete from user_tbl where id =?";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); PreparedStatement ps = con.prepareStatement(SQL);

		) {
			ps.setInt(1, 4);
			ps.executeUpdate();
			System.out.println("data deleted..");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
