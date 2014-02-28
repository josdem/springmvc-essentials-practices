<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="../_header.jsp" />
</head>
<body>

  <jsp:include page="../_menu.jsp" />

  <div class="container">
    <h1>${message}</h1>
  </div>

  <div class="container">
    <ul>
    <c:forEach items="${projects}" var="project" >
      <li>${project.codeName}</li>
    </c:forEach>
    </ul>
    <hr>
    <a href="${pageContext.request.contextPath}/newProject" class="btn btn-primary">
      Create a new project
    </a>
  </div>

  <jsp:include page="../_footer.jsp" />

</body>
</html>