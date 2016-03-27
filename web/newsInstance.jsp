<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
    <div>
        <img src="../resources/images/<c:out value="${newsInstance.name}" />.jpg"
             alt="<c:out value="${newsInstance.name}" />" height="420" width="420">
    </div>
    <div>
        <b><c:out value="${newsInstance.title}" /></b>
    </div>
    <div>
        <c:out value="${newsInstance.body}" />
    </div>
</body>
</html>
