package com.ashmeet.cnp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashmeet.cnp.dao.CouponDAO;
import com.ashmeet.cnp.dao.ProductDAO;
import com.ashmeet.cnp.model.Coupon;
import com.ashmeet.cnp.model.Product;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CouponDAO couponDAO = new CouponDAO();
	ProductDAO productDAO = new ProductDAO();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String couponCode = request.getParameter("couponCode");
		
		Coupon coupon = couponDAO.find(couponCode);
		Product product = new Product();
		product.setName(name);
		product.setDescription(description);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));
		
		productDAO.save(product);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Coupon created</b>");
		out.print("<br/><a href='/candpapp'>Home</a>");
		
	}

}
