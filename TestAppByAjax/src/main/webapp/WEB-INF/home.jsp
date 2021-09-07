<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
 $('#btnSave').click(function(){
	 var userName=$('#userName').val();
	 var password=$('#password').val();
	 var data={
			 userN:userName,
			 userP:password,
			 
	 }
	 $.ajax({
		 url:'/save',
		 data:data,
		 type:'post',
		 success : function(response) {
             alert("sucess");
             var b='<html><body></html>';
             ('#').append(b);
         },
         error : function(response) {
             alert("error");
         }
	 });
 });
    });
</script>
</head>
<body>

<h1>welcome</h1>

<form>
<span>Username:</span><input type="text" name="username" id="userName">
<br>
<span>Password:</span><input type="text" name="password" id="password">
<input type="button" value="save" id="btnSave">
</form>
</body>
</html>