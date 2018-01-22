package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.beans.Account;

public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private DataSource datasource;
	
	public AccountDaoImpl(){
		
	}

	public void set(Account account) {
	    Connection con = null;
        PreparedStatement pstmt = null;
        System.out.println(datasource);
        try {
            con = datasource.getConnection();
            pstmt = con.prepareStatement("INSERT INTO account VALUES(?,?,?,?)");
            pstmt.setInt(1, account.getAccno());
            pstmt.setString(2, account.getAccname());
            pstmt.setString(3, account.getAcctype());
            pstmt.setDouble(4, account.getBalance());
            pstmt.execute();
            System.out.println("Record Inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
