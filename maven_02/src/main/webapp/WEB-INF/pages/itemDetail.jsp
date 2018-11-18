<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<form>
		<table width="100%" border=1>
			<tr>
				<td>姓名</td>
				<td> ${item.username } </td>
			</tr>
			<tr>
				<td>性别</td>
				<td> ${item.sex } </td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td> <fmt:formatDate value="${item.birthday}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			</tr>
			<tr>
				<td>住址</td>
				<td>${item.address} </td>
			</tr>
		</table>
	</form>
</body>
</html>