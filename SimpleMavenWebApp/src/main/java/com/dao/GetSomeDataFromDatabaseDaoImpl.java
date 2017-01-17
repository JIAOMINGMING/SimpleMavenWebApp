package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.bean.controllerBean.InputForm;

@Repository
public class GetSomeDataFromDatabaseDaoImpl implements GetSomeDataFromDatabaseDao{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<User> getSomeDataFromDatabase(InputForm inputForm) {


		System.out.println("you access the dao start");

		String sql = "SELECT * FROM user_information_table ";
		java.sql.Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			List<User> userList = new ArrayList<User>();
			ResultSet rs = ps.executeQuery();
			while  (rs.next()) {
				System.out.println("get data from database in dao : username: " + rs.getString("userName"));
				User user = new User(
					rs.getString("userName"),
					rs.getString("passWordD"),
					rs.getString("email"),
					rs.getString("sex"),
					rs.getString("address"),
					rs.getString("description")
				);
				userList.add(user);

			}
			rs.close();
			ps.close();
			System.out.println("you access the dao end");
			return userList;

		}catch(Exception e){
			throw new RuntimeException(e);
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
