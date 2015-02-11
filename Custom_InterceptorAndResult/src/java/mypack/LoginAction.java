/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author Admin
 */
public class LoginAction {
    String name , password;
    String actionStatus = "Action isn't invoked";

    public String execute()
    {
       actionStatus = "Action is invoked";
       return "success";
    }

    public String getActionStatus()
    {
        return actionStatus;
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
