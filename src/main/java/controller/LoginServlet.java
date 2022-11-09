package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import contextDB.UserDbUtil;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		PrintWriter out=response.getWriter();
		Connection conn=UserDbUtil.getCon();
		HttpSession session=request.getSession();
		int loginid=Integer.parseInt(request.getParameter("lid"));
		String password=request.getParameter("psw");
		String query="SELECT id,fname FROM user WHERE login=? and password=?"; 
		try
		{
			PreparedStatement pr=(PreparedStatement)conn.prepareStatement(query);
			pr=conn.prepareStatement(query);
			pr.setInt(1, loginid);
			pr.setString(2, password);
			System.out.println("here4");
			ResultSet rs=pr.executeQuery();
			System.out.println("here5");
			if(rs.next())
			{
				String userName=rs.getString("fname");
				session.setAttribute("fname", userName);
				response.sendRedirect("welcome.jsp");   
			}
			else
			{
				response.sendRedirect("errorpage.jsp");    
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
