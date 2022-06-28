package Ejercicios.Problema8;


//En un proyecto diferente al del ejercicio 7, lee los datos serializados por el ejercicio anterior y muéstralos por
//pantalla.
//NOTA: El único requisito para deserializar un objeto desde un archivo,consiste en utilizar el mismo nombre del
//package del programa con el que se serializaron los datos, puesto que este nombre queda grabado junto con la
//información serializa en el fichero.


import Ejercicios.Problema7.Moto;
import Ejercicios.Problema7.Vehiculo;
import java.io.*;


public class Principal {

    public static void main(String[] args) {


        try {
            String archivo = "C:\\Users\\Foo\\developer\\Pruebas\\coches.txt";
            FileInputStream arj = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(arj);
            Vehiculo[] vehiculos = new Vehiculo[5];
           // System.out.println("Deserializamos la info del archivo --> " + archivo);
            for (int i = 0; i < vehiculos.length; i++) {
                vehiculos[i] = (Vehiculo) ois.readObject();
            }

            ois.close();
            arj.close();

            for (int i = 0; i < vehiculos.length; i++) {
                if(vehiculos[i] instanceof Moto){
                    System.out.println(i + " se trata de una moto.");
                }else {
                    System.out.println(i + " se trata de un coche");
                }
            }
        } catch (IOException io) {


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

