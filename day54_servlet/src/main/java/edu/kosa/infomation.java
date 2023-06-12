package edu.kosa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class infomation extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
		System.out.println("info~!");
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String addr = request.getParameter("addr");
		
		System.out.println(name +"\n"+ phone +"\n"+ addr);
		
		response.setCharacterEncoding("euc-kr"); 
		PrintWriter pw = response.getWriter();
		pw.write("<html><head><title>Login Result</title></head><body><br>");
		pw.println("이름: " + name + "<br />" + "연락처: " + phone + "<br /> " + "주소: "+ addr);
		pw.println("</body></html>");
		pw.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
