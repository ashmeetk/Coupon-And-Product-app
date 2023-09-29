package com.ashmeet.cnp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashmeet.cnp.dao.CouponDAO;
import com.ashmeet.cnp.model.Coupon;


public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CouponDAO couponDao = new CouponDAO();
 
    public CouponController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("create"))
			createCoupon(request, response);
		else
		{
			findCoupon(request, response);
		}
	}

	private void findCoupon(HttpServletRequest request, HttpServletResponse response) {
		Coupon coupon = couponDao.find(request.getParameter("couponCode"));
		try {
			PrintWriter out = response.getWriter();
			out.print(coupon);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("couponCode");
		String discount = request.getParameter("discount");
		String expiryDate = request.getParameter("expiryDate");
		
		Coupon coupon = new Coupon();
		coupon.setCode(couponCode);
		coupon.setDiscount(new BigDecimal(discount));
		coupon.setExpDate(expiryDate);
		
		couponDao.save(coupon);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<b>Product created</b>");
		out.print("<br/><a href='/candpapp'>Home</a>");
	}

}