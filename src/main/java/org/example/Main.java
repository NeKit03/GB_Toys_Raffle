package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ToyRaffle toyRaffle = new ToyRaffle();
    toyRaffle.addToy(new Toy("Teddy",2));
    toyRaffle.addToy(new Toy("Car",3));
    toyRaffle.addToy(new Toy("locomotive",1));
    toyRaffle.addToy(new Toy("airplane",4));
    Toy trophy= toyRaffle.toyWinning();
    if(trophy!=null){
        System.out.printf("Ваш приз %s",trophy);
    }else{
            System.out.println("Вы проиграли, попробуйте в другой раз!");
        }

    }
}