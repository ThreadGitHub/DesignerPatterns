package thread;

import org.junit.Test;
import thread.abstractFactoryPattern.AbstractFactory;
import thread.abstractFactoryPattern.Color;
import thread.abstractFactoryPattern.FactoryProducer;
import thread.factoryPattern.Animal;
import thread.factoryPattern.AnimalFactory;

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

}
