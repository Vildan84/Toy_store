package org.example;

import java.util.*;

public class LotteryDraw {

    private final ArrayList<Toy> toys;
    private final ArrayList<Toy> winner;
    
    LotteryDraw(ArrayList<Toy> toys, ArrayList<Toy> winners){
        this.winner = winners;
        this.toys = toys;
    }

    /*
    Метод Draw выявляет победителя на основе рейтинга игрушки
     */

    public void draw(){
        boolean flag = true;
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        while (flag){
            for(Toy toy: this.toys){
                int step = rand.nextInt(50);
                int rate;
                if (map.containsKey(toy.getId())){
                    map.computeIfPresent(toy.getId(), (k, v) -> v + step);
                }
                else{
                    map.put(toy.getId(), toy.getRate() + step);
                }
                rate = map.get(toy.getId());

                if(rate > 200){
                    this.winner.add(toy);
                    int remain = toy.getRemain() - 1;
                    if (remain == 0){
                        this.toys.remove(toy);
                    }
                    else{
                        toy.setRemain(toy.getRemain() - 1);
                    }
                    flag = false;
                    break;
                }
            }
        }

    }

    public ArrayList<Toy> getWinner() {
        return winner;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }
}
