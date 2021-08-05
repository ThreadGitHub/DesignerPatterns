package thread.abstractFactoryPattern;

/**
 * 工厂生产器 根据工厂的名称来生成抽象工厂中对应的工厂
 * 所有的工厂都统一是 抽象工厂的接口
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factoryName){
        if(factoryName == null){
            return null;
        }else if(factoryName.equals("animal")){
            return new AnimalFactory();
        }else if(factoryName.equals("color")){
            return new ColorFactory();
        }
        return null;
    }
}
