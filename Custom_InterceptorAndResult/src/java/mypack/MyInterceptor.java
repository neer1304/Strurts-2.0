/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import java.util.Enumeration;
import javax.servlet.ServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Admin
 */
public class MyInterceptor implements Interceptor {
    

    @Override
  public void destroy() {}

    @Override
  public void init()  {}

    @Override
  public String intercept(ActionInvocation ai) throws Exception
    {

      ValueStack vs = ai.getStack();
      ServletRequest request = ServletActionContext.getRequest();

      Enumeration<String> e = request.getParameterNames();
      while(e.hasMoreElements())
      {
          String pname = e.nextElement();
          String pvalue = request.getParameter(pname);
          vs.setValue(pname, pvalue);
      }
      String str = ai.invoke();
      return str;

    }
}
