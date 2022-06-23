package servlet;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Payment
 */
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
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
		String x=request.getParameter("cardholdername");
		String y=request.getParameter("cardnumber");
		String z=request.getParameter("cvv");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodweb","root","Password@123");
			Statement st=con.createStatement();
			String s="select * from carddetails where x='"+x+"' and y='"+y+"' and z='"+z+"'";
			ResultSet rs=st.executeQuery(s);
			
		if(rs.next())
			{
				response.sendRedirect("order.jsp");
			}
			else
			{
				response.sendRedirect("menu.jsp");
			}
			con.close();
			
		}
		catch(Exception e)
		{
			
		System.out.println(e);
		doGet(request, response);
	}

}}
