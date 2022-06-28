package Ejercicios.Problema6;

//Problema 6
//Haz un programa que nos muestre el contenido de una carpeta, marcando con <DIR> las subcarpetas. Pide al
//usuario la ruta absoluta a esa carpeta, y guárdala en un string.


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta absoluta a la carpeta: ");
        String rt = sc.nextLine();

        File ruta = new File(rt);

        String[] nombre_archivos = ruta.list();
        Arrays.sort(nombre_archivos);

        System.out.println("Archivos: ");
        for (int i = 0; i < nombre_archivos.length; i++) {
            File f = new File(ruta.getAbsolutePath(), nombre_archivos[i]);
            if (f.isDirectory()) {
                String[] archivos_subcarpeta = f.list();
                for (int j = 0; j < archivos_subcarpeta.length; j++) {
                    System.out.println(archivos_subcarpeta[j] + " <DIR>");

                }
            }
        }


    }
}
