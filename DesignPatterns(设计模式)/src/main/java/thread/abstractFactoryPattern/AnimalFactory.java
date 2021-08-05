package thread.abstractFactoryPattern;

public class AnimalFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String animalType) {
        if(animalType == null){
            return null;
        }else if(animalType.equals("cat")){
            return new Cat();
        }else if(animalType.equals("tiger")){
            return new Tiger();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
