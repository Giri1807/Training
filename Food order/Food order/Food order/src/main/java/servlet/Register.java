package servlet;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=request.getParameter("name");
		String b=request.getParameter("username");
		String c=request.getParameter("password");
		String d=request.getParameter("gender");
		String e=request.getParameter("nationality");
		String f=request.getParameter("emailid");
		//String g=request.getParameter("phno");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodweb","root","Password@123");
			Statement st=con.createStatement();
		    String s="insert into register (a,b,c,d,e,f)values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"')";
		    st.executeUpdate(s);
		    con.close();
		    response.sendRedirect("welcome.jsp");
		}
		catch(Exception x)
		{
		System.out.println(x);
		doGet(request, response);
	}

}}
