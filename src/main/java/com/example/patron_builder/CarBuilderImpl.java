package com.example.patron_builder;

public class CarBuilderImpl implements CarBuilder{
    //En esta clase se implementa la interfaz y todos los metodos de construccion, en este caso el carro
    private Car car;
    //Se definen todos los metodos de construccion
    public CarBuilderImpl() { this.reset(); }

    public void reset() { car = new Car(); }

    public void setSeats(int seats) { car.setSeats(seats); } //

    public void setEngine(String engine) { car.setEngine(engine); }

    public void setTripComputer(boolean hasTripComputer) { car.setTripComputer(hasTripComputer); }

    public void setGPS(boolean hasGPS) { car.setGps(hasGPS); }

    public Car getResult() { return this.car; }
}
