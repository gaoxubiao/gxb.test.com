<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试jsp</title>
</head>
<body>
<div class="container" >
  <form action="testmvc/controller" method="get">
  <h2 align="center" style="color: red;">用户登录</h2>
  <fieldset>用户名称：</fieldset> <input type="text" name="username "/> <br>
  <fieldset>用户密码：</fieldset> <input type="password" name="pwd"> <br>
  <input type="submit" value="提交">  &nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消"/>
  
  
  </form>

</div>

</body>
</html>