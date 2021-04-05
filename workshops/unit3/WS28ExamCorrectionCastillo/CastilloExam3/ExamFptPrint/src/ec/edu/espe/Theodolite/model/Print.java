
package ec.edu.espe.Theodolite.model;


public class Print {
private String color;
    private String model;
    private float brand;
    private float cost;
    private boolean print;

    public Print(boolean type, String color, String materials, float height, float price) {

        this.print = print;
        this.color = color;
        this.model = model;
        this.brand = height;
        this.cost = price;

    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public float getBrand() {
        return brand;
    }
boolean isTheodolite() {
        return print;
    }

    
}
