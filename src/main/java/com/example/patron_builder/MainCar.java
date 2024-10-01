package com.example.patron_builder;

public class MainCar {
    public static void main(String[] args) {
        Director director = new Director();       // Crea el director que controlará la construcción
        CarBuilderImpl builder = new CarBuilderImpl(); // Crea el constructor de carros deportivos

        // El director construye un carro deportivo usando el builder
        director.constructSportsCar(builder);

        // Obtiene el carro construido
        Car car = builder.getResult();

        // Muestra el carro construido
        System.out.println(car);

        // Construir un camión
        TruckBuilderImpl truckBuilder = new TruckBuilderImpl();

        director.constructTruck(truckBuilder);
        Car truck = truckBuilder.getResult();
        System.out.println(truck);

    }

}
