package org.example.modelos;

import org.example.modelos.Animal;

public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.nombre+
                        "\nLa mamá es: "+this.mama.nombre+
                            "\nEl hijo es: "+this.hijo.nombre
        );

    }

    public void tenerHijo(String nombre){

        if(this.papa.pareja!=null){

            Animal hijo1= new Animal();
            hijo1.nombre=nombre;
            hijo1.peso=1.0;
            double random = Math.random();
            if(random<0.5){
                hijo1.genero="F";
            }else{
                hijo1.genero="M";
            }
            this.hijo=hijo1;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
