<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Coupon</title>
</head>
<body>
<h1>Find Coupon</h1>
<form action="coupons" method="post">
	<pre>
		Coupon Code: <input name="couponCode" type="text"/>
		<input type="submit" value="find"/>
		<input type="hidden" name="action" value="find"/>
	</pre>
</form>
</body>
</html>