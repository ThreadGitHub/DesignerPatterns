package thread.factoryPattern;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if(animalType == null){
            return null;
        }else if(animalType.equals("cat")){
            return new Cat();
        }else if(animalType.equals("tiger")){
            return new Tiger();
        }
        return null;
    }

}
