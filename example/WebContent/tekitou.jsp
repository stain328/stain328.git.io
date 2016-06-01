<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello Word
<%
//String img_url = "http://ecx.images-amazon.com/images/I/412lZoEREmL._SY355_.jpg";
%>
<%

String str = request.getParameter("text");
//String img_url = "http://ec2.images-amazon.com/images/I/51lgCMzcbeL._SS400_ZA"+str+",40,300,300,300,arial,45,0,0,0_.jpg";
%>


<%
String text = request.getParameter("text");
if ( text == null) {
	text = "azu";
}
String asin = request.getParameter("asin");
if (asin == null){
	asin = "4797327030";
}

String img_url =
"http://ec2.images-amazon.com/images/P/"
+asin+".09._ZA"+text+",0,65,95,120,times,14,255,0,0_.jpg";
%>
<img src=<%= img_url %> />

<form action="" >
<input type="text" placeholder="asin" value="4797327030" name="asin"/>
<input type="text" placeholder="表示したい文字列" name="text"/>
<input type="submit" value="画像にする" />
</form>
</body>
</html>