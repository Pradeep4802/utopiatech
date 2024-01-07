package com.bank.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.bank.management.bean.User;
import com.mysql.cj.protocol.Resultset;

public class UserDao {
	public final String REGISTER_USER = "Insert into user values(?,?,?,?,?,?,?)";
	public final String SELECT_BY_ID = "select * from user where UserID = ?";
	public final String BALANCE_UPDATE = "update user set Balance = ? where UserId = ?";
	public final String LOGIN = "select AccountNumber,Password from user Where AccountNumber=? and Password=?;";
	public final String SELECT_ALL = "select * from user";

	public Connection getConnection() {
		Connection con = null;
		try {	
			String Driver = "org.sqlite.JDBC";
			String url = "jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//BankUser.db";
			Class.forName(Driver);
			con = DriverManager.getConnection(url);
		}catch(Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	// register
	public int register(User e1 )throws SQLException {
		int status = 0;

		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(REGISTER_USER);
		ps.setString(1, e1.getId());
		ps.setString(2, e1.getName());
		ps.setString(3, e1.getPassword());
		ps.setString(4, e1.getEmail());
		ps.setString(5, e1.getContact());
		ps.setString(6, e1.getAccountNo());
		ps.setString(7, e1.getAccountType());

		status = ps.executeUpdate();

		return status;
	}

	// login
	public boolean login(String AccountNo, String Password) throws SQLException {

		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement(LOGIN);
		ps.setString(1, AccountNo);
		ps.setString(2, Password);
		ResultSet rs = ps.executeQuery();

		// check user entered account number and password is correct or not
		if(AccountNo.equals(rs.getString("AccountNumber")) && Password.equals(rs.getString("Password"))) {
			return true;
		} 

		return false;
	}

	// Admin Login
	public boolean adminLogin(String AccountNo, String Password) throws SQLException {
		String adminAccountNo = "12345";
		String adminPassword = "admin123";
		
		if(AccountNo.equals(adminAccountNo) && Password.equals(adminPassword)) {
			return true;
		}
		return false;
	}

	// deposit 
	public void deposit(long money) {

	}

	// Withdraw 
	public void withdraw(long money) {

	}

	public List<User> getAllUser() throws SQLException {
		Connection con = getConnection();
		List<User> ls = new ArrayList();
		PreparedStatement ps = con.prepareStatement(SELECT_ALL);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			User us = new User();
			us.setId(rs.getString("UserId"));
			us.setName(rs.getString("Name"));
			us.setPassword(rs.getString("Password"));
			us.setEmail(rs.getString("Email"));
			us.setContact(rs.getString("Contact"));
			us.setAccountNo(rs.getString("AccountNumber"));
			us.setAccountType(rs.getString("AccountType"));

			ls.add(us);

			return ls;
		}

		return null;
	}
}
