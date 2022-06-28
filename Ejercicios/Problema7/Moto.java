package Ejercicios.Problema7;

import java.util.Scanner;

public class Moto extends Vehiculo {

    private int precio;
    private String descripcion;


    public Moto() {
        super();

        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void crearMoto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Color: ");
        color = sc.next();
        System.out.println("Caballos: ");
        caballos = sc.nextInt();
        System.out.println("Marca: ");
        marca = sc.next();
        System.out.println("Modelo: ");
        modelo = sc.next();
        System.out.println("Precio: ");
        precio = sc.nextInt();
        System.out.println("Descripcion: ");
        descripcion = sc.next();
    }

    @Override
    public String toString() {
        System.out.println("Motos: ");
        return
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Color: " + color + "\n" +
                "Caballos: " + caballos + "\n" +
                "Precio: " + precio + "\n" +
                "Descripcion: " + descripcion;



    }

}
