package edu.kosa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")  // 2. annotation 등록 방법
public class LoginServlet extends HttpServlet {
	
	//DB 대체
	public String user = "jihyo";
	public String pass = "1111";

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login call~~");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("pwd");
		
		//System.out.println(id + ", " + passwd);
		
		response.setCharacterEncoding("euc-kr"); 
		PrintWriter pw = response.getWriter();
		pw.write("<html><head><title>Login Result</title></head><body><b><br>");
		
		if( user.equals(id) && !passwd.equals(pass) ) {
			pw.println("암호가 틀렸습니다. <br />");
			pw.println("<a href='html/loginForm.html'> Login </a> ");
			
		} else if( user.equals(id) && passwd.equals(pass) ) {
			pw.println("반갑습니다.<br />");
			pw.println("너의 아이디는 "+id+" 이군요<br />");
			pw.println("<a href='html/loginForm.html'> Login </a> ");
			
		} else {
			pw.println("등록되지 않은 사용자입니다. 회원 가입 요망 <br />");
//			pw.println("<a href='html/loginForm.html'> Login </a> ");
			pw.println("javascript:history.go(-1)");
		}
		
		pw.println("</b></body></html>");
		pw.close();
		
		//pw.write("<html><head><title>Hello Servlet</title></head><body><h1>Hello Servlet Test</h1></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
