package com.company;

public class Main {

    public static void main(String[] args) {
       Crossove crossove = new Crossove("Trader UK", 100);
       Sedan sedan = new Sedan("Ford Model A Tudor sedan", "Black");
       Toyota toyota = new Toyota("Toyota Camry", 1500);
       Mercedes mercedes = new Mercedes("Mercedes", "X5");
       Porshe porshe = new Porshe("Porshe","A911B");

        Garage<Crossove> garage = new Garage<>(crossove);
        Garage<Sedan> garage1 = new Garage<>(sedan);
        Garage<Toyota> garage2 = new Garage<>(toyota);
        Garage<Mercedes> garage3 = new Garage<>(mercedes);
        Garage<Porshe> garage4 = new Garage<>(porshe);


        Garage[] garages = new Garage[]{garage, garage1, garage2, garage3, garage4};
        for (Garage k:garages)
        {
            System.out.println("------------------------------");
            System.out.println(k.returnable().print2());
        }
      //  System.out.println(garage.getModelCar().print2());

    }
}
