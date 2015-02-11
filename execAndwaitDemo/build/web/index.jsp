<%-- 
    Document   : index
    Created on : Jan 28, 2012, 9:07:33 PM
    Author     : Admin
--%>

<%@taglib uri="/struts-tags" prefix="s"   %>

<s:form action = "lazy">
    <s:textfield name = "name" label = "Name" />
    <s:password name = "password" label = "Password" />
    <s:submit value = "login" />
</s:form>