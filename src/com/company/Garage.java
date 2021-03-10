package com.company;

public class Garage <T extends Car> implements Printtable <T>{
    private T ModelCar;

    public Garage() {
    }
    public Garage(T modelCar) {
        ModelCar = modelCar;
    }

    @Override
    public void print(T t) {
        t.print2();
    }

    @Override
    public T returnable() {
        return getModelCar();
    }

    private T getModelCar() {
        return ModelCar;
    }

    public void setModelCar(T modelCar) {
        ModelCar = modelCar;
    }
}
