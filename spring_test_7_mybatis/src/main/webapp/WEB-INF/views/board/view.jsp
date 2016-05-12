<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#updateFBtn").click(function(){
			location.href = "./updateForm?num=${bdDto.num}";
		});
		$("#deleteBtn").click(function(){
			location.href = "./delete?num=${bdDto.num}";
		});
	});
</script>
</head>
<body>

<h2>VIEW PAGE</h2>
<h2>writer : ${bdDto.writer}</h2>
<h2>title : ${bdDto.title}</h2>

<input type="button" value="updateForm" id="updateFBtn"><br>
<input type="button" value="delete" id="deleteBtn"><br>

<h2><a href="./list?curPage=1">LIST</a></h2>

</body>
</html>