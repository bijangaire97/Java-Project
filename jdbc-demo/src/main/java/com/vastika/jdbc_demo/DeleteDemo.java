package com.vastika.jdbc_demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbc_demo.util.DBUtililities;

public class DeleteDemo {

	public static final String SQL = "delete from user_tbl where id = 3";

	public static void main(String[] args) {
		try (Connection con = DBUtililities.getConnection(); Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);
			System.out.println("data deleted..");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
