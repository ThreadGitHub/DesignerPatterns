package thread.abstractFactoryPattern;

public class Red implements Color{
    public String colorName = "红色";

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public void sayColor() {
        System.out.println("红色 !");
    }
}
