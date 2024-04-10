package org.example;

public class Toy {
    private String name;
    private Integer weight;

    public Toy(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
