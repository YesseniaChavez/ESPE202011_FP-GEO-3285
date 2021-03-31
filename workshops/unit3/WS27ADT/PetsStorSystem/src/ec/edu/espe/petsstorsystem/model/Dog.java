package ec.edu.espe.petsstorsystem.model;

public class Dog {
    private String name;
    private String color;
    private int age;
    private float weigth;
    private String breedAnimal;

    public Dog(String name, String color, int age, float weigth, String breedAnimal) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weigth = weigth;
        this.breedAnimal = breedAnimal;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    /**
     * @return the breedAnimal
     */
    public String getBreedAnimal() {
        return breedAnimal;
    }

    /**
     * @param breedAnimal the breedAnimal to set
     */
    public void setBreedAnimal(String breedAnimal) {
        this.breedAnimal = breedAnimal;
    }
    
    
}
