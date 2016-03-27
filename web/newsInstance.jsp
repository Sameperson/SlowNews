<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Slow News</title>
    <link rel="stylesheet" href="../resources/css/normalize.css">
    <link href='http://fonts.googleapis.com/css?family=Changa+One|Open+Sans:400italic,700italic,400,700,800' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="../resources/css/main.css">
    <link rel="stylesheet" href="../resources/css/responsive.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<header>
    <a href=".." id="logo">
        <h1>Slow News</h1>
    </a>
    <nav>
        <ul>
            <li><a href="..">News feed</a></li>
            <li><a href="archive">Archive</a></li>
            <li><a href="login">Login</a></li>
        </ul>
    </nav>
</header>
<body>
    <div class="newsPage">
        <div class="newsTitle">
            <c:out value="${newsInstance.title}" />
        </div>
        <div class="newsImage">
            <img src="../resources/images/<c:out value="${newsInstance.name}" />.jpg"
                 alt="<c:out value="${newsInstance.name}" />" height="420" width="420">
        </div>
        <div class="newsBody">
            <c:out value="${newsInstance.body}" />
        </div>
    </div>
</body>
</html>
