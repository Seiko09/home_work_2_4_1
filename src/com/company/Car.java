package com.company;

public class Car implements Printt2able{
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String print2() {
        return "name: " + name;
    }
}
class Crossove extends Car{
    private int kmCH;

    public Crossove() {
    }

    public Crossove(String name, int kmCH) {
        super(name);
        this.kmCH = kmCH;
    }

    @Override
    public String print2() {
        return super.print2() + "\nч/km: " + kmCH;
    }

    public int getKmCH() {
        return kmCH;
    }

    public void setKmCH(int kmCH) {
        this.kmCH = kmCH;
    }
}
class Sedan extends Car{
    private String color;

    public Sedan() {
    }

    public Sedan(String name, String color) {
        super(name);
        this.color = color;
    }
    @Override
    public String print2() {
        return super.print2() + "\ncolor: " + color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Toyota extends Car{
    private int cost;

    public Toyota() {
    }

    public Toyota(String name, int cost) {
        super(name);
        this.cost = cost;
    }
    @Override
    public String print2() {
        return super.print2() + "\ncost: " + cost;
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
class Mercedes extends Car{
    private String model;

    public Mercedes() {
    }

    public Mercedes(String name, String model) {
        super(name);
        this.model = model;
    }
    @Override
    public String print2() {
        return super.print2() + "\nmodel: " + model;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class Porshe extends Car{
    private String numberCar;

    public Porshe() {
    }

    public Porshe(String name, String numberCar) {
        super(name);
        this.numberCar = numberCar;
    }
    @Override
    public String print2() {
        return super.print2() + "\nnumberCar: " + numberCar;
    }
    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }
}
