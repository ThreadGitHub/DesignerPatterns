package thread.commandPattern;

/**
 * @author Thread丶
 * 删除用户命令
 */
public class DelUserCommand implements Command{
    private UserService userCommand;

    public DelUserCommand(UserService userCommand){
        this.userCommand = userCommand;
    }

    @Override
    public void execute(){
        userCommand.delUser();
    }

}
