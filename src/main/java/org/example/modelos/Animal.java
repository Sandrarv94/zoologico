package org.example.modelos;

public class Animal {

    public String nombre;
    public String genero;
    public Double peso;
    public Animal pareja;

    public Animal() {
    }

    public Animal(String nombre, String genero, Double peso, Animal pareja) {
        this.nombre = nombre;
        this.peso = peso;
        this.genero = genero;
        this.pareja = pareja;
    }


    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
