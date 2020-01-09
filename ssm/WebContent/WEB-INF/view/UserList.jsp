<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>用户列表</h3>
    <table border="1" style="border-collapse: collapse;">
       <tr>
          <th>id</th>
          <th>name</th>
          <th>password</th>
          <th>age</th>
          <th>操作</th>
       </tr>
       <c:forEach items="${users}" var="user" varStatus="vs">
        <tr style="${vs.index %2 eq 0?'background-color: yellow':''}">
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td>
            <a href="javaScript:void(0);" onclick="deleteUser(${user.id})">删除</a>&nbsp;&nbsp;
            <a href="javaScript:void(0);">修改</a>
          </td>       
        </tr>
       </c:forEach>
       
    </table>
  
  
    <script type="text/javascript">
       function deleteUser(id){
    	   if(confirm("您确定要删除吗？")){
    		   window.location.href = "${pageContext.request.contextPath}/userController/deleteUser.do?id=" + id;
    	   }
       }
    
    </script>
</body>
</html>