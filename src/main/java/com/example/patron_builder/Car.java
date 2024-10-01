package com.example.patron_builder;

import lombok.Data;

@Data
//Se define las partes del objeto a construir
//Con la anotacion Data se crea los constructores y un metodo toString para visualizar el objeto construido
public class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;
}
