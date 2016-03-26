<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title></title>
  </head>
  <body>
    <table>
      <c:forEach items="${newsList}" var="news">
        <tr>
          <td><c:out value="${news.title}" /><td>
          <td><c:out value="${user.body}" /><td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
