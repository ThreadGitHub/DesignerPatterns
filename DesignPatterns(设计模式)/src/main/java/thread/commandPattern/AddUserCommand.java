package thread.commandPattern;

/**
 * @author Thread丶
 * 添加用户命令
 */
public class AddUserCommand implements Command{
    private UserService userCommand;

    public AddUserCommand(UserService userCommand){
        this.userCommand = userCommand;
    }

    @Override
    public void execute() {
        userCommand.addUser();
    }

}
