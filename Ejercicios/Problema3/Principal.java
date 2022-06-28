package Ejercicios.Problema3;

//Problema 3
//Haz un programa que lea el contenido de un fichero “hola.txt” y lo muestre por pantalla. Nota: usa Reader
//NOTA: Realiza la lectura del fichero línea a línea.

import java.io.*;

public class Principal  {

    public static void main(String[] args) throws IOException {

        try {

            FileReader fl = new FileReader("C:\\Users\\Foo\\developer\\Pruebas\\hola.txt");
            BufferedReader bf = new BufferedReader(fl);
            String texto = null;
            boolean ok = true;

            while (ok){
                texto = bf.readLine();
                System.out.println(texto);
                ok = false;
            }



        }catch (IOException e){
            e.printStackTrace();
        }
        }






}
