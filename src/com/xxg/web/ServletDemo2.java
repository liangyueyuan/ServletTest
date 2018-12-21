package com.xxg.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
ServletContext域：1，是一个容器 2。作用范围是应用程序范围
*/
/*@WebServlet("/ServletDemo2")*/
public class ServletDemo2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//在ServletDemo2通过ServletContext获取在ServletDemo1中设置的值
		String value = (String) this.getServletContext().getAttribute("key1");
		System.out.println("key1: "+value);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
