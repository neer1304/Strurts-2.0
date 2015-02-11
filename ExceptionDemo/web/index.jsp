<%-- 
    Document   : index
    Created on : Jan 28, 2012, 9:07:33 PM
    Author     : Admin
--%>

<%@taglib uri="/struts-tags" prefix="s"   %>

<s:form action = "divide">
    <s:textfield name = "num1" label = "First No." />
    <s:textfield name = "num2" label = "Second No." />
    <s:submit value = "Divide" />
</s:form>