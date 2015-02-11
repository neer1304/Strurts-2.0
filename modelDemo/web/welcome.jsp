<%@taglib uri = "/struts-tags" prefix = "s" %>

Welcome, <s:property value = "user.name"/>
<br/>
Your registered address is : <br/>
City: <s:property  value = "city" />  <br/>
State: <s:property value = "state"/>