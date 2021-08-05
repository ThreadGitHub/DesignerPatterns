package thread.abstractFactoryPattern;

public class Tiger implements Animal{
    @Override
    public void sayHi(Color color) {
        System.out.println("tiger sayHi 我是"+ color.colorName +"!" );
    }
}
