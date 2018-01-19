package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;

import com.beans.Account;

public class AccountDaoImpl implements AccountDao {
	
	private DataSource datasource;
	
	public AccountDaoImpl(){
		
	}

	@Required
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void set(Account account) {
	    Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // Get connection.
            con = datasource.getConnection();
            // Create statement.
            pstmt = con.prepareStatement("INSERT INTO account VALUES(?,?,?,?)");
            // Set parameters.
            pstmt.setInt(1, account.getAccno());
            pstmt.setString(2, account.getAccname());
            pstmt.setString(3, account.getAcctype());
            pstmt.setDouble(4, account.getBalance());
            // Execute statement.
            pstmt.execute();
            System.out.println("Record Inserted successfully");
        } catch (Exception e) {// Handle Exceptions
            e.printStackTrace();
        } finally {// Clean up resources to avoid memory leaks problems.
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

	}

	public Account get(int accno) {
		return null;
	}

	public void update(Account account) {
		
	}

	public void remove(int accno) {
		
	}

}
