package com.example.patron_builder;

public class TruckBuilderImpl implements CarBuilder{
    private Car car;

    // Constructor que inicializa el camión
    public void Truck() {
        this.reset();
    }

    // Reinicia el proceso de construcción
    public void reset() {
        car = new Car();
    }

    // Configura el número de asientos del camión
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    // Configura el tipo de motor del camión
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    // Los camiones normalmente no tienen computadoras de a bordo, así que lo dejamos como 'false'
    public void setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }

    // Algunos camiones pueden tener GPS, lo configuramos como sea necesario
    public void setGPS(boolean hasGPS) {
        car.setGps(hasGPS);
    }

    // Devuelve el camión construido
    public Car getResult() {
        return this.car;
    }

}
