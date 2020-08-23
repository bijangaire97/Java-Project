package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtililities;

public class UpdateDemo {
	public static final String SQL = "update user_tbl set user_name = 'uuu', password = 'abc' where id=2";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); Statement st = con.createStatement();) {

			st.executeUpdate(SQL);
			System.out.println("data updated...");
		}

		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
