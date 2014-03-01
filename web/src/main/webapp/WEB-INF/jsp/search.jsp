<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="_header.jsp" />
</head>
<body>

  <jsp:include page="_menu.jsp" />

  <div class="container">
    <h1>Search in projects</h1>
  </div>

  <div class="container">
    <form action="${pageContext.request.contextPath}/search" method="post">
      <div class="form-group">
        <label for="name">Project code</label>
        <input name="codeName" placeholder="Code Name" class="form-control" value="${codeName}">
      </div>
      <div class="form-group">
        <label for="name">Task description</label>
        <input name="taskDescription" placeholder="What did you write?" class="form-control" value="${taskDescription}">
      </div>
      <button type="submit" class="btn btn-default">Search in projects</button>
    </form>
  </div>
  <hr>
  <div class="container">
    <div class="row">
      <div class="col-md-6">
        <h3>Projects <small></small></h3>
        
      </div>
      <div class="col-md-6">
        <h3>Tasks</h3>
        <ul>
        <c:forEach items="${tasks}" var="task">
          <li>${task.description}</li>
        </c:forEach>
        </ul> 
      </div>
    </div>
  </div>

  <jsp:include page="_footer.jsp" />

</body>
</html>