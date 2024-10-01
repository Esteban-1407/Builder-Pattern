package com.example.patron_builder;

public class Director {
    // Método que define cómo se construye un carro deportivo
    public void constructSportsCar(CarBuilder builder) {
        builder.reset();
        builder.setSeats(2);              // Un carro deportivo tiene 2 asientos
        builder.setEngine("V8");          // Motor potente V8
        builder.setTripComputer(true);    // Incluye computadora de a bordo
        builder.setGPS(true);             // Incluye GPS
    }
    // Método que define cómo se construye un camión
    public void constructTruck(CarBuilder builder) {
        builder.reset();
        builder.setSeats(3);              // Un camión puede tener 3 asientos
        builder.setEngine("Diesel");      // Motor diesel para camiones
        builder.setTripComputer(false);   // Normalmente, los camiones no tienen computadora de a bordo
        builder.setGPS(true);             // GPS es opcional, pero lo incluimos
    }
}
