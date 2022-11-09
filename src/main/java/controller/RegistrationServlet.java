package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import contextDB.UserDbUtil;
import entity.user;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		int loginid=Integer.parseInt(request.getParameter("lid"));
		String password=request.getParameter("psw");
		String dateofbirth=request.getParameter("dob");
		String mobileno=request.getParameter("mobile");
		user u = new user(firstname,lastname,loginid,password,dateofbirth,mobileno);
		

		Connection conn=UserDbUtil.getCon();
		String querry="INSERT INTO user VALUES(NULL,?,?,?,?,?,?)";
		try
		{
			PreparedStatement pr=(PreparedStatement)conn.prepareStatement(querry);
			pr=conn.prepareStatement(querry);
			pr.setString(1, firstname);
			pr.setString(2, lastname);
			pr.setInt(3, loginid);
			pr.setString(4, password);
			pr.setString(5, dateofbirth);		
			pr.setString(6, mobileno);
			pr.executeUpdate();
			pr.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Registered successfully");
		response.sendRedirect("login.jsp");
	}

}
