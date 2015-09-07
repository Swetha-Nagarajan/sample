import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usr = req.getParameter("Username");
		System.out.println("POST METHOD" + usr);

		RequestDispatcher rs = req.getRequestDispatcher("welcome");
		rs.forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET METHOD");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String a = "C:/users/v7868/desktop/envdef/amp";
		String b = a.split("/")[5];
		System.out.println(b);
	}
	
	
	
	
	
	
	
	
}
