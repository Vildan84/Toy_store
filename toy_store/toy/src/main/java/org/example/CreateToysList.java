package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateToysList {

    final List<String> colors = Arrays.asList("red", "blue", "yellow", "white", "orange", "green");
    final List<String> names = Arrays.asList("Monkey", "Cat", "Dog", "Bear", "Mouse", "Elephant");
    final List<Integer> rates = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
    final ArrayList<Toy> prizeToys = new ArrayList<>();

    CreateToysList(Integer numberOfToys){
        Random rand = new Random();
        for (int i = 0; i<numberOfToys; i++){
            String color = colors.get(rand.nextInt(this.colors.size()));
            String name = names.get(rand.nextInt(this.names.size()));
            int rate = rates.get(rand.nextInt(this.rates.size()));
            prizeToys.add(new Toy(name, color, rate));
        }
    }

    public ArrayList<Toy> getToysList(){
        return this.prizeToys;
    }

}
