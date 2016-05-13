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
		var teamNam = ("t1","t2","t3","t4","t5","t6");
		var teamNum = 0;
		$("#gaBtn").click(function(){
			if(this.value >0){
				/* alert("test"); */
				$.ajax({
					url: "./createTeam",
					data:{
						ch:"ga"
					},
					success: function(result){
						var team = '#' + teamNam[teamNum];
						$(team).append("<input type='text' name='ga' value='"+result.name+"'> ");
			        	if(teamNum == 5){
							teamNum=0
						}else{
							teamNum++;
						}
					
			    }});
			}
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

가 : <input type="button" value="${chga}" class="btn-primary" id="gaBtn">
나 : <input type="button" value="${chna}" class="btn-primary" id="naBtn">
다 : <input type="button" value="${chda}" class="btn-primary" id="daBtn">
	<p>1Team</p>
	<div id="t1">
	
	</div>
	<p>2Team</p>
	<div id="t2">
	
	</div>
	<p>3Team</p>
	<div id="t3">
	
	</div>
	<p>4Team</p>
	<div id="t4">
	
	</div>
	<p>5Team</p>
	<div id="t5">
	
	</div>
	<p>6Team</p>
	<div id="t6">
	
	</div>


</body>
</html>