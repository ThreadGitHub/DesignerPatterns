package thread.abstractFactoryPattern;

public class ColorFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String animalType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }else if(colorType.equals("red")){
            return new Red();
        }else if(colorType.equals("blue")){
            return new Blue();
        }
        return null;
    }
}
