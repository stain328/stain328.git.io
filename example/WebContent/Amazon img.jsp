<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String str = request.getParameter("text");
//String img_url = "http://ec2.images-amazon.com/images/I/51lgCMzcbeL._SS400_ZA" + str + ",40,300,300,300,arial,45,0,0,0_.jpg";

String img_url = "http://ec2.images-amazon.com/images/I/3141BgH-BkL._SL500_AA400_" + str + ",40,300,300,300,arial,45,0,0,0_.jpg";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello World
<img src=<%= img_url %> />
<form action="">
<input type="text" placeholder="表示したい文字列" name="text"/>
<input type="submit" value="画像にする" />
</form>
</body>
</html>