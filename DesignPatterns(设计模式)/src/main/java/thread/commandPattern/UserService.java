package thread.commandPattern;

import java.util.Date;

/**
 * @author Thread丶
 */
public class UserService {
    /**
     * 添加用户
     */
    public void addUser(){
        System.out.println(new Date().toLocaleString() + "\t添加用户...");
    }

    /**
     * 删除用户
     */
    public void delUser(){
        System.out.println(new Date().toLocaleString() + "\t删除用户...");
    }

}
