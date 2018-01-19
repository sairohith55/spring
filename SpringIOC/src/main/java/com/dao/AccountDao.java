package com.dao;

import com.beans.Account;

public interface AccountDao {

	public void set(Account account);
	public Account get(int accno);
	public void update(Account account);
	public void remove(int accno);
	
}
