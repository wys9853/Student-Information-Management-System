<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>条件查询信息页面</title>
<script type="text/javascript" src="./layui/layui.js"></script>
<link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>
<div class="layui-anim layui-anim-up ">
	<form action="find" method="post">
		<table border="0" width="238" height="252">
			<tr><td>学号</td><td><input type="text" name="id"></td></tr>
			<tr align="center">
				<td colspan="2">
					<input class="layui-btn layui-btn-radius layui-btn-primary" type="submit" value="查  询"> &nbsp;&nbsp;&nbsp;
					<input class="layui-btn layui-btn-radius layui-btn-primary" type="reset" value="取  消">
				</td>
			</tr>
		</table>
	</form>
	</div>
	
	 

</body>
</html>