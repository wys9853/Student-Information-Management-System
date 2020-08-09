<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新信息显示页面</title>
<script type="text/javascript" src="./layui/layui.js"></script>
<link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>
<div class="layui-anim layui-anim-up ">
	<form action="update" method="post">
		<table border="0" width="238" height="252">
			<tr><td>学号</td><td><input type="text" name="id"></td></tr>
			<tr><td>姓名</td><td><input type="text" name="name"></td></tr>
			<tr><td>性别</td><td><input type="text" name="sex"></td></tr>
			<tr><td>年龄</td><td><input type="text" name="age"></td></tr>
			<tr><td>体重</td><td><input type="text" name="weight"></td></tr>
			<tr><td>身高</td><td><input type="text" name="hight"></td></tr>
			<tr align="center">
				<td colspan="2">
					<input class="layui-btn layui-btn-radius layui-btn-primary" type="submit" value="更  新"> &nbsp;&nbsp;&nbsp;
					<input class="layui-btn layui-btn-radius layui-btn-primary" type="reset" value="取  消">
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>