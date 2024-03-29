<%@ include file = "include.jsp" %>
<html>
  <head><title><fmt:message key="title"/></title></head>
    <body>
      <h1><fmt:message key="heading"/></h1>
      <p><fmt:message key="greeting"/><c:out value="${myModel.now}"/></p>
      <h3>Products</h3>
      <c:forEach items="${myModel.products}" var="prod">
        <c:out value="${prod.name}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
      </c:forEach>

      <br>
          <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
          <br>
    </body>
</html>