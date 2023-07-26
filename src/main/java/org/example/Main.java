package org.example;

import org.example.modelos.Animal;
import org.example.modelos.Familia;

public class Main {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.nombre="Cebra";
        animal1.genero="F";


        Animal animal2 = new Animal();
        animal2.nombre="Caballo";
        animal2.genero="M";


        animal2.encontrarPareja(animal1); //Un animal consigue pareja

        Familia familia = new Familia(animal2,animal1);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}