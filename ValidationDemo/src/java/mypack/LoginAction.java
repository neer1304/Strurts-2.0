/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Admin
 */
public class LoginAction extends ActionSupport {

    String name,password;

    public String execute()
    {
        return "success";
    }

  /*  public void validate()
    {
        if(name.length()==0)
        {
            addFieldError("name","Name cannot be blank");
        }
        if(password.length()== 0)
        {
            addFieldError("password","Password cannot be blank");

        }
 else if(password.length()<5)
        {
     addFieldError("password","Password must contain atleat 5 characters");
        }

    }  */

    public void validate()
    {
        if(name.length()==0)
        {
            addFieldError("name",getText("name.required"));
        }
        if(password.length()== 0)
        {
            addFieldError("password",getText("password.required"));

        }
 else if(password.length()<5)
        {
     addFieldError("password",getText("password.minLength"));
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
