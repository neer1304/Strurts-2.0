<%-- 
    Document   : index
    Created on : Feb 5, 2012, 6:26:55 PM
    Author     : Admin
--%>


<%@taglib uri="/struts-tags" prefix="s"   %>

<s:form action = "register">
    <s:textfield name = "name" label = "Name" />
    <s:textfield name = "city" label = "City" />
    <s:textfield name = "state" label = "State" />
    <s:submit value = "register" />
</s:form>