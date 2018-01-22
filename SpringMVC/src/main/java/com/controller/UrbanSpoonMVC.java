package com.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dao.UserDAO;
import com.dto.User;

public class UrbanSpoonMVC implements Controller{ 

	

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("home");
		String action = request.getParameter("action");
		if(action!=null){
			if(action.equals("user_registration")){
				String uname = request.getParameter("firstName")+" "+request.getParameter("lastName");
				String gender = request.getParameter("gender");
				String email=request.getParameter("email");
				String pswd = request.getParameter("password");
				String dt = request.getParameter("date");
				String mno= request.getParameter("mobileNumber");
				
				User u = new User();
				u.setName(uname);
				u.setGender(gender);
				u.setEmail(email);
				u.setPassword(pswd);
				u.setDate(Date.valueOf(dt));;
				u.setMobileNo(Long.parseLong(mno));
				UserDAO u1 = new UserDAO();
				u1.save(u);
				System.out.println("user registered ");
			}
		}
		return mv;
	}
	
	
}
