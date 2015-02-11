/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import org.apache.struts2.ServletActionContext;
import javax.servlet.ServletResponse;

/**
 *
 * @author Admin
 */
public class MyResult implements Result {

    private String page;
    public static final String DEFAULT_PARAM = "page";

    public void setPage(String page)
    {
        this.page = page;
    }

    @Override
    public void execute(ActionInvocation ai) throws Exception {
        ServletRequest request = ServletActionContext.getRequest();
        ServletResponse response = ServletActionContext.getResponse();
        RequestDispatcher rd = request.getRequestDispatcher(page);
        rd.forward(request,response);
    }

}
