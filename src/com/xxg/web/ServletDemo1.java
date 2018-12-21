package com.xxg.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ServletConfig用于封装servlet的配置
public class ServletDemo1 extends HttpServlet {

	private ServletConfig config;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//返回此上下文中支持servlet API级别的最大和最小版本号
		int m = this.getServletContext().getMinorVersion();
		int n = this.getServletContext().getMajorVersion();
		System.out.println("m="+m+",n="+n);
		
		System.out.println(getServletName());
		System.out.println(this.getServletConfig().getInitParameter("data"));
		
		//得到所有的值
		Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
		while(initParameterNames.hasMoreElements()){
			String name = initParameterNames.nextElement();
			System.out.println(name);
			System.out.println(this.getServletConfig().getInitParameter(name));
		}
		
		//在公共区域存放了一个key值为key1，value值为xiaomi的值
		getServletContext().setAttribute("key1", "xiaomi");
		String value = (String) this.getServletContext().getAttribute("key1");
	    System.out.println("key1: "+value);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
