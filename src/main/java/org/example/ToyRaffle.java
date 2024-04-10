package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyRaffle {
    private List<Toy> toyList = new ArrayList<>();

    public void addToy(Toy toy){
        toyList.add(toy);
    }

    public Toy toyWinning(){
        int maxWeight=0;
        Toy trophy=null;
        for(Toy toy:toyList)
            if(maxWeight<toy.getWeight())
                maxWeight=toy.getWeight();
        int getWeight = 0;
        Integer randomWeight = new Random().nextInt(maxWeight + 1);
        System.out.println(randomWeight);
        for(Toy toy:toyList){
            if(randomWeight==toy.getWeight())
                trophy=toy;
        }
        return trophy;
    }

}
