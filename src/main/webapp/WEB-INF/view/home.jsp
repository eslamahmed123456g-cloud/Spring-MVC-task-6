<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body>
    <div class="container mt-4" style="max-width:500px;">
       <f:form action="processform" modelAttribute="userData">
       <div class="mb-3">
       <f:input type="text" placeholder="firstName" path="firstName" class="form-control"/>
       </div>
       <div class="mb-3">
       <f:input type="text" placeholder="lastName" path="lastName" class="form-control"/>
        </div>
       <div class="mb-3">
       <f:input type="text" placeholder="email" path="email" class="form-control"/>
        </div>
       <div class="mb-3">
       <f:input type="date" placeholder="dob" path="dob" class="form-control"/>
        </div>
       <div class="mb-3">
       <f:select path="city" class="form-select">
           <f:option value="Egypt" label="EGY"/>
           <f:option value="palastine" label="PALASTINE"/>
           <f:option value="saudi Arabia" label="KSA"/>
        </f:select>
         </div>
        <input type="submit" class="btn-outline-danger w-100">
        </f:form>
    </body>
</html>