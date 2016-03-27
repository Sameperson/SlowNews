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
          <td bgcolor="#FF0000"><c:out value="${news.timeOnly}" /><a>
          <td bgcolor="#FFFF00">
            <a href="news/<c:out value="${news.name}" />"><c:out value="${news.title}" /></a>
          <td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
