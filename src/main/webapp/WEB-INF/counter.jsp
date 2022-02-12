<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="text-center ">
		<h2>		
		<c:out value="${countToShow}"/>
		</h2>
		<a href="/your_server"  class="btn btn-primary">Try Again</a>
		<a href="/your_server/reset"  class="btn btn-danger">Reset</a>
		<a href="/your_server/addTwo"  class="btn btn-success">Add 2 to the count</a>

			
</div>
</body>
</html>