package org.example;

import java.util.*;

public class LotteryDraw {

    private final HashMap<Integer, Integer> map;
    
    LotteryDraw(HashMap<Integer, Integer> map){
        this.map = map;
    }

    public Integer draw(){
        boolean flag = true;
        Random rand = new Random();
        int winner = 0;

        while (flag){
            for(Integer key: map.keySet()){
                int num = rand.nextInt(50);
                map.computeIfPresent(key, (k, v) -> v + num);
                if(map.get(key) > 200){
                    winner = key;
                    flag = false;
                    break;
                }
            }
        }
        return winner;

    }
}
