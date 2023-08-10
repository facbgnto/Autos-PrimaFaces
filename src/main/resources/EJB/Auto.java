package com.example.ejb;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auto {
    private int id;
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor, getters y setters
}