package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String pass = config.getInitParameter("pass");
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String des = req.getParameter("des");
		
		try {
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement("insert into employees value(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, des);
			
			int i = ps.executeUpdate();
			boolean s=(i>0)?true:false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
