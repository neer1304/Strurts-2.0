/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author Admin
 */
public class RegisterAction implements ModelDriven {

    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public Address getModel() {
        user = new User();
        return user.getAddress();
    }

    public String execute()
    {
        return "success";
    }

}
