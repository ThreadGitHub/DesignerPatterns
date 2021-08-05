package thread.abstractFactoryPattern;

/**
 *  抽象工厂 一个抽象的大工厂用来归纳全部的工厂接口
 */
public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animalType);
    public abstract Color getColor(String colorType);
}
