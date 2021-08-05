package thread.abstractFactoryPattern;

public class Blue implements Color{
    public String colorName = "蓝色";

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void sayColor() {
        System.out.println("蓝色 !");
    }
}
