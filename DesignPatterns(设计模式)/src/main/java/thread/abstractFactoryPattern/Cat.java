package thread.abstractFactoryPattern;

public class Cat implements Animal{
    @Override
    public void sayHi(Color color) {
        System.out.println("cat sayHi 我是 " + color.colorName + "!");
    }

}
