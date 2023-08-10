package com.ejb;


import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class AutoEJB {

    public List<Auto> getAutos() {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto(1, "Toyota", "Corolla", 2023, "Azul"));
        autos.add(new Auto(2, "Ford", "Mustang", 2023, "Rojo"));
        autos.add(new Auto(3, "Chevrolet", "Camaro", 2023, "Negro"));
        autos.add(new Auto(4, "Honda", "Civic", 2023, "Blanco"));
        autos.add(new Auto(5, "Nissan", "Altima", 2023, "Gris"));
        autos.add(new Auto(6, "BMW", "M3", 2023, "Plateado"));
        autos.add(new Auto(7, "Mercedes-Benz", "C-Class", 2023, "Negro"));
        autos.add(new Auto(8, "Audi", "A4", 2023, "Azul"));
        autos.add(new Auto(9, "Volkswagen", "Golf", 2023, "Rojo"));
        autos.add(new Auto(10, "Toyota", "Camry", 2023, "Plata"));
        autos.add(new Auto(11, "Ford", "F-150", 2023, "Negro"));
        autos.add(new Auto(12, "Chevrolet", "Silverado", 2023, "Gris"));
        autos.add(new Auto(13, "Jeep", "Wrangler", 2023, "Verde"));
        autos.add(new Auto(14, "Subaru", "Outback", 2023, "Azul"));
        autos.add(new Auto(15, "Mazda", "CX-5", 2023, "Rojo"));
        autos.add(new Auto(16, "Kia", "Seltos", 2023, "Blanco"));
        autos.add(new Auto(17, "Hyundai", "Tucson", 2023, "Plata"));
        autos.add(new Auto(18, "Lexus", "RX", 2023, "Negro"));
        autos.add(new Auto(19, "Volvo", "XC60", 2023, "Gris"));
        autos.add(new Auto(20, "Porsche", "911", 2023, "Rojo"));
        autos.add(new Auto(21, "Ferrari", "488", 2023, "Rojo"));
        autos.add(new Auto(22, "Lamborghini", "Huracán", 2023, "Amarillo"));
        autos.add(new Auto(23, "Tesla", "Model S", 2023, "Blanco"));
        autos.add(new Auto(24, "Jaguar", "F-Type", 2023, "Negro"));
        autos.add(new Auto(25, "Land Rover", "Range Rover", 2023, "Azul"));
        autos.add(new Auto(26, "Maserati", "GranTurismo", 2023, "Azul"));
        autos.add(new Auto(27, "Alfa Romeo", "Giulia", 2023, "Rojo"));
        autos.add(new Auto(28, "McLaren", "720S", 2023, "Naranja"));
        autos.add(new Auto(29, "Rolls-Royce", "Phantom", 2023, "Blanco"));
        autos.add(new Auto(30, "Bentley", "Continental", 2023, "Plata"));
        autos.add(new Auto(31, "Bugatti", "Chiron", 2023, "Negro"));
        autos.add(new Auto(32, "Aston Martin", "DB11", 2023, "Gris"));
        autos.add(new Auto(33, "Lotus", "Evora", 2023, "Verde"));
        autos.add(new Auto(34, "Fiat", "500", 2023, "Amarillo"));
        autos.add(new Auto(35, "Mini", "Cooper", 2023, "Azul"));
        autos.add(new Auto(36, "Smart", "Fortwo", 2023, "Blanco"));
        autos.add(new Auto(37, "Chrysler", "300", 2023, "Negro"));
        autos.add(new Auto(38, "Dodge", "Challenger", 2023, "Rojo"));
        autos.add(new Auto(39, "Ram", "1500", 2023, "Azul"));
        autos.add(new Auto(40, "GMC", "Sierra", 2023, "Gris"));
        System.out.println("Cantidad de autos: " + autos.size());
        return autos;
    }
}