package com.example.patron_builder;

public interface CarBuilder {
    //Se define los pasos de construccion del objeto y adicional un metodo reset para reiniciar el objeto
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
    Car getResult();
}
