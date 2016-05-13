<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#gaBtn").click(function(){
			$("#ga").append("<input type='text' name='ga'>");
		});
		$("#naBtn").click(function(){
			$("#na").append("<input type='text' name='na'>");
		});
		$("#daBtn").click(function(){
			$("#da").append("<input type='text' name='da'>");
		});
	});
</script>
</head>
<body>

<input type="button" value="가" class="btn-primary" id="gaBtn">
<input type="button" value="나" class="btn-primary" id="naBtn">
<input type="button" value="다" class="btn-primary" id="daBtn">
<form action="./test">
	<p>가</p>
	<div id="ga">
	
	</div>
	<p>나</p>
	<div id="na">
	
	</div>
	<p>다</p>
	<div id="da">
	
	</div>
	<input type="submit" value="조편성">
</form>

</body>
</html>