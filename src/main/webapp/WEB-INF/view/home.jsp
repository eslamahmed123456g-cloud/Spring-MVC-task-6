<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
    </head>
    <body>

       <f:form action="processform" modelAttribute="userData">
     <f:input type="text" placeholder="firstName" path="firstName"/>
     <f:errors path="firstName" cssClass="error"/>
     <f:input type="text" placeholder="lastName" path="lastName"/>
     <f:errors path="lastName" cssClass="error"/>
     <f:input type="text" placeholder="enter user age" path="age"/>
     <f:errors path="age" cssClass="error"/>
     <f:input type="text" placeholder="email" path="email"/>
     <f:errors path="email" cssClass="error"/>
     <f:input type="text" placeholder="enter phone number" path="phone"/>
     <f:errors path="phone" cssClass="error"/>
        <input type="submit" class="btn-outline-danger "/>
        </f:form>
    </body>
</html>