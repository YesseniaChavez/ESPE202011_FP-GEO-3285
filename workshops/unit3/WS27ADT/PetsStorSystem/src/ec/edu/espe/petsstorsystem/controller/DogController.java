package ec.edu.espe.petsstorsystem.controller;

import ec.edu.espe.petsstorsystem.model.Dog;
import javax.swing.JOptionPane;
import utils.FileManager;

public class DogController {

    public void save(Dog dog) {
        Dog[] dogs = new Dog[FileManager.countLines("dogs")];
        String[] rows = new String[FileManager.countLines("dogs")];
        read(rows, dogs);
        if (find(dogs, (String) dog.getName()) != -1) {
            String data = dog.getName() + ", " + dog.getColor() + ", " + dog.getAge() + ", " + dog.getWeigth() + ", " + dog.getBreedAnimal();
            FileManager.save(data, "dogs");
        } else {
            JOptionPane.showMessageDialog(null, "dog -> " + dog.getName() + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        }
    

    public void read(String[] data, Dog[] dogs){

        FileManager.readLines("dogs", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForDog = data[i].split(",");

            //building an object with the splitted data
            String name = dataForDog[0];
            String color = dataForDog[1];
            int age = Integer.parseInt(dataForDog[2]);
            float weigth = Float.parseFloat(dataForDog[3]);
            String breedAnimal = dataForDog[4];

            dogs[i] = new Dog(name, color, age, weigth, breedAnimal);
        }
    }

    public int find(Dog[] dogs, String name) {
        for (int i = 0; i < dogs.length; i++) {
            if (name.equals(dogs[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void sortChickens(Dog[] dogs) {
        //SORT chikens to save them in a sorted file

    }
}
