<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bean.Student" import="java.util.List" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>条件查询结果页面</title>
<script type="text/javascript" src="./layui/layui.js"></script>
<link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>
	<%
		List<Student> list = (List<Student>)request.getAttribute("list");
	%>
	<div class="layui-anim layui-anim-up ">
	<table class="layui-table" border="2" bgcolor="ccceee" width="650">
		<tr bgcolor="CCCCCC" align="center">
			<td>学号</td><td>姓名</td><td>性别</td>
			<td>年龄</td><td>体重</td><td>身高</td>
		</tr>
	<%
		if(list == null || list.size() < 1){
				out.print("没有数据！");
		}else{
				// 遍历学生集合中的数据
			for(Student stu : list){
	%>
		<tr align="center">
			<td><%=stu.getId() %></td>
			<td><%=stu.getName() %></td>
			<td><%=stu.getSex() %></td>
			<td><%=stu.getAge() %></td>
			<td><%=stu.getWeight() %></td>
			<td><%=stu.getHight() %></td>
		</tr> 
	<%
			}
		}
	%>
	</table>
	</div>
</body>
</html>