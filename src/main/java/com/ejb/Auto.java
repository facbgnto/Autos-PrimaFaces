package com.ejb;
import lombok.Data;
import lombok.ToString;
import lombok.AllArgsConstructor;
@Data
@ToString
@AllArgsConstructor
public class Auto {
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    // Constructor, getters y setters
}