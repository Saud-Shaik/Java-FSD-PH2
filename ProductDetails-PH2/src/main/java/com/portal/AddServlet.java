package com.portal;

import java.io.IOException;
import java.math.BigDecimal;

import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.servlet.HibernateUtil;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=  factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
	    String Name=request.getParameter("Name");
	    String Price =request.getParameter("Price");
	    
	    Product product = new Product();
	    
	    product.setName(Name);
	    product.setPrice(new BigDecimal(Price));
	    product.setDateAdded(Calendar.getInstance().getTime());
	   session.save(product);
	   tx.commit();
	    response.sendRedirect("success.jsp");
	    
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


