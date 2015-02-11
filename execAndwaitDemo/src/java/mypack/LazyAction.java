/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author Admin
 */
public class LazyAction {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute()
    {
        try
        {
            Thread.sleep(10000);
        }catch(Exception e) { }
        return "success";
    }

}
