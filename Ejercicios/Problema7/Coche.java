package Ejercicios.Problema7;

import java.util.Scanner;

public class Coche extends Vehiculo {

    int numPuertas;
    int maletero;

    public Coche() {
        super();
    }




   /* public Coche(String color, int caballos, String marca, String modelo,int numPuertas, int maletero) {
        super(color, caballos, marca, modelo);
        this.numPuertas = numPuertas;
        this.maletero = maletero;
    }*/

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public  void crearCoche() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Color: ");
        color = sc.next();
        System.out.println("Caballos: ");
        caballos = sc.nextInt();
        System.out.println("Marca: ");
        marca = sc.next();
        System.out.println("Modelo: ");
        modelo = sc.next();
        System.out.println("Numero de puertas: ");
        numPuertas = sc.nextInt();
        System.out.println("Capacidad de maletero: ");
        maletero = sc.nextInt();

    }

    @Override
    public String toString() {
        System.out.println("Coches: ");

        return
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Color: " + color + "\n" +
                "Caballos: " + caballos + "\n" +
                "Numero de puertas: " + numPuertas + "\n" +
                "Capacidad del maletero: " + maletero;

    }

}

