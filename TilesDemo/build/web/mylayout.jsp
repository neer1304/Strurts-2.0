<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
        <title>
            <tiles:getAsString name = "title" />
        </title>
    </head>
    <body>
        <table  width ="100%" border = "1" bgcolor= "yellow">
            <tr >
                <td  width = "100%" height = "10%">
                    <tiles:insertAttribute name = "header" />
                </td>
            </tr>

            <tr>
                <td width = "100%" height = "80%">
                    <tiles:insertAttribute name = "body" />
                </td>
            </tr>

            <tr>
                <td width = "100%" height = "10%">
                    <tiles:insertAttribute name = "footer" />
                </td>
            </tr>
</table>
    </body>
</html>