package org.example;

import java.util.ArrayList;

public class EditJson {

    private final ArrayList<Toy> toys;
    private Toy toy;

    EditJson(ArrayList<Toy> toys){
        this.toys = toys;
    }

    public Toy getToy(){
        if(toys.size() > 0){
            toy = toys.remove(0);
            System.out.println(toy.toyInfo());
        }
        return toy;
    }
    public ArrayList<Toy> getToys() {
        return toys;
    }
}
