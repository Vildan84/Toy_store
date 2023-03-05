package org.example;

import java.text.SimpleDateFormat;
import java.util.*;

public class CreateToysList {

    final List<String> colors = Arrays.asList("red", "blue", "yellow", "white", "orange", "green");
    final List<String> names = Arrays.asList("Monkey", "Cat", "Dog", "Bear", "Mouse", "Elephant");
    final ArrayList<Toy> prizeToys = new ArrayList<>();

    CreateToysList(Integer numberOfToys){
        SimpleDateFormat dateFormat = new SimpleDateFormat("mmssSS");
        Random rand = new Random();
        for (int i = 0; i<numberOfToys; i++){
            int toyId = Integer.parseInt(dateFormat.format(new Date())) + i;
            String color = colors.get(rand.nextInt(this.colors.size()));
            String name = names.get(rand.nextInt(this.names.size()));
            int rate = rand.nextInt(10,81);
            prizeToys.add(new Toy(toyId, name, color, rate));
        }
    }

    public ArrayList<Toy> getToysList(){
        return this.prizeToys;
    }

}
