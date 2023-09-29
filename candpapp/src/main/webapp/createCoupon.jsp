<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Coupon</title>
</head>
<body>
<h1>Create Coupon</h1>
<form action="coupons" method="post">
	<pre>
		Coupon Code: <input name="couponCode" type="text"/>
		Discount: <input name="discount" type="text"/>
		Expiry Date: <input name="expiryDate" type="text"/>
		<input type="hidden" name="action" value="create"/>
		<input type="submit" value="save"/>
	</pre>
</form>
</body>
</html>