<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
<script type="text/javascript">
function check(form){
//取得form1中username的值并判断是否为空
if(document.forms.form1.username.value==""){
alert("请输入用户名");
document.forms.form1.username.focus();
return false;
}
if(document.forms.form1.password.value==""){
alert("请输入密码");
document.forms.form1.password.focus();
return false;
}
}
</script>
</head>
<body>
<form action="LoginServlet" method="post" name="form1">
<label>username</label>
<input type="text" name="username" />
<label>password</label>
<input type="password" name="password" />
<input type="submit" name="submit" οnclick="return check(this);" value="登陆" />
<input type="reset" name="reset" value="重置" />
</form>


</body>
</html>
