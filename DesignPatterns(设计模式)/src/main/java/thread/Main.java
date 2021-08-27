package thread;

import org.junit.Test;
import thread.abstractFactoryPattern.AbstractFactory;
import thread.abstractFactoryPattern.Color;
import thread.abstractFactoryPattern.FactoryProducer;
import thread.commandPattern.AddUserCommand;
import thread.commandPattern.CommandExecuteBuilder;
import thread.commandPattern.DelUserCommand;
import thread.commandPattern.UserService;
import thread.factoryPattern.Animal;
import thread.factoryPattern.AnimalFactory;

/**
 * @author Thread丶
 */
public class Main {
    /**
     * 工厂设计模式
     */
    @Test
    public void FactoryPattern(){
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.getAnimal("cat");
        cat.sayHi();

        Animal tiger = animalFactory.getAnimal("tiger");
        tiger.sayHi();
    }

    /**
     * 抽象工厂设计模式
     */
    @Test
    public void AbstractFactoryPattern(){
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");

        AbstractFactory animalFactory = factoryProducer.getFactory("animal");
        thread.abstractFactoryPattern.Animal cat = animalFactory.getAnimal("cat");
        cat.sayHi(red);
    }

    /**
     * 命令模式
     */
    @Test
    public void CommandPattern(){
        //创建命令提供者
        UserService userCommand = new UserService();
        //创建 添加用户的命令
        AddUserCommand addUserCommand = new AddUserCommand(userCommand);
        //创建删除用户的命令
        DelUserCommand delUserCommand = new DelUserCommand(userCommand);
        //创建 命令生成器
        CommandExecuteBuilder builder = new CommandExecuteBuilder(addUserCommand, delUserCommand);
        builder.addTask(addUserCommand);
        builder.addTask(delUserCommand);
        //执行命令队列
        builder.executeTasks();
        //单独执行 添加用户  删除用户
        builder.addUser();
        builder.delUser();

    }
}
