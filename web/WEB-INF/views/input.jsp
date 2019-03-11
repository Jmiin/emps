<%--
  Created by IntelliJ IDEA.
  User: Jmax
  Date: 2019/3/11
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--为什么使用form标签？

--%>
    <form:form action="emp" method="post" modelAttribute="employee">
        <%--path对应html表单里的name属性--%>
        LastName:<form:input path="lastName"></form:input><br>
        Email:<form:input path="email"></form:input><br>
        Gender:<form:radiobuttons path="gender" items="${genders}"></form:radiobuttons><br>
        Department:<form:select path="department" items="${departments}" itemLabel="departmentName" itemValue="id"></form:select>
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>
