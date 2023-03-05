package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CreateToysList l = new CreateToysList(5);
        ArrayList<Toy> toyList = l.getToysList();
        for(Toy t: toyList){
            System.out.println(t.toyInfo());
        }
        LotteryDraw ld = new LotteryDraw(MapRates.getRates(toyList));
        System.out.println(ld.draw());


    }
}