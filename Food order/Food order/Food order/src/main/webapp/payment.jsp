<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Enter details to complete payment</title>
</head>
<body>
<form action="Payment"method="post">
cardholdername<input type="text" name="cardholdername" placeholder="Enter name"><br><br>
cardnumber<input type="text" name="cardnumber" placeholder="####-####"><br><br>
cvv<input type="text" name="cvv" placeholder="###"><br><br>
<input type="submit">
</form>
</body>
</html>