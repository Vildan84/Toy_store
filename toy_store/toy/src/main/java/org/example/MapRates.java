package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class MapRates {

    public static HashMap<Integer, Integer> getRates(ArrayList<Toy> toysList){
        HashMap<Integer, Integer> map = new HashMap<>();
        if (toysList.size() > 0){
            for(Toy t: toysList){
                map.put(t.getId(), t.getRate());
            }
        }
        return map;
    }
}
