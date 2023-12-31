package com.kosa.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDate extends HttpServlet {

	protected void process(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servlet!!");
		
		response.setCharacterEncoding("euc-kr");
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		PrintWriter out = response.getWriter();
		out.write("<html><head><title> 서버측 시간을 얻어서 씁니다. </title></head>");  //tag와 query문은 문자취급
		out.write("<body><h1> 지효컴 Hello Servlet </h1>");
		out.write("<h2> 현재 시간은 ");
		out.write(Integer.toString(hour)+" 시");
		out.write(Integer.toString(minute)+" 분");
		out.write(Integer.toString(second)+" 초입니다.");
		
		
		out.write("</h2></body></html>");
		out.close();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}

	
}
