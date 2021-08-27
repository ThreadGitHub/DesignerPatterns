package thread.commandPattern;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Thread丶
 * 命令执行构造器
 */
public class CommandExecuteBuilder {
    private AddUserCommand addUserCommand;
    private DelUserCommand delUserCommand;

    /**
     * 命令执行器构造
     * @param addUserCommand
     * @param delUserCommand
     */
    public CommandExecuteBuilder(AddUserCommand addUserCommand, DelUserCommand delUserCommand){
        this.addUserCommand = addUserCommand;
        this.delUserCommand = delUserCommand;
    }

    private Vector vector = new Vector();

    /**
     * 把命令加入待处理
     * @param command
     */
    public void addTask(Command command){
        vector.add(command);
    }

    /**
     * 执行全部命令
     */
    public void executeTasks(){
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            Command command = (Command) iterator.next();
            command.execute();
        }
    }

    /**
     * 添加用户
     */
    public void addUser(){
        addUserCommand.execute();
    }

    /**
     * 删除用户
     */
    public void delUser(){
        delUserCommand.execute();
    }
}
