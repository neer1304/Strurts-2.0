<%-- 
    Document   : welcome
    Created on : Jan 28, 2012, 9:23:46 PM
    Author     : Admin
--%>

<%@taglib uri = "/struts-tags" prefix = "s" %>
<b>
    Welcome <s:property value = "name" /> <br>
    Your Details are as follows : <br>
   Password : <s:property value = "password" /> <br>
   Email : <s:property value = "email" /> <br>
   Age : <s:property value = "age" /> <br>
</b>