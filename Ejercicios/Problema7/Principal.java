package Ejercicios.Problema7;
//Utilizando la siguiente relación de clases, donde tanto Moto como Coche derivan de
// la clase base Vehiculo:
//Crea un array de 5 Vehículos que permita al alumno decidir qué tipo de elemento inserta en cada posición (de
//la clase Moto o Coche). Añádele el código necesario para serializar en un fichero los datos que el usuario
//introduce.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        try {

            ArrayList<Vehiculo> coches = new ArrayList<>();
            ArrayList<Vehiculo> motos = new ArrayList<>();

            Scanner sc = new Scanner(System.in);
            int opcion;

            for (int i = 0; i < 2; i++) {
                System.out.println("Elige: 1.Crear coche / 2.Crear moto");
                opcion = sc.nextInt();
                if(opcion == 1){
                    Coche coche = new Coche();
                    coche.crearCoche();
                    coches.add(coche);
                    ObjectOutputStream escribirCoche = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Foo\\developer" + "\\Pruebas\\coches.txt"));
                    escribirCoche.writeObject(coches);
                    escribirCoche.close();

                }else if(opcion == 2){
                    Moto moto = new Moto();
                    moto.crearMoto();
                    motos.add(moto);

                    ObjectOutputStream escribirMoto = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Foo\\developer" + "\\Pruebas\\motos.txt"));
                    escribirMoto.writeObject(motos);
                    escribirMoto.close();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
