package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Account;
import com.dao.AccountDao;
import com.dao.AccountDaoImpl;

public class ClientCode {

	public static void main(String[] args) {

	    ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
	    AccountDaoImpl accDao = (AccountDaoImpl)application.getBean("accdao");
	    
	    Account account = new Account();
	    account.setAccno(1);
	    account.setAccname("imitaz");
	    account.setAcctype("savings");
	    account.setBalance(2000.00);    
	    accDao.set(account);

	}
}	
