<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- document body -->
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
  <a href="${pageContext.request.contextPath}/project/new" class="btn btn-primary">
      Create a new project
  </a>
</div>