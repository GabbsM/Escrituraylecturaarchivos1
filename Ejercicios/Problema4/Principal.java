package Ejercicios.Problema4;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Problema 4
//Tomando el ejercicio anterior, amplíalo para que después de mostrarlo, pregunte al usuario si desea invertir
//el texto. Si el usuario responde “si”, deberemos reescribir hola.txt con el texto escrito al revés. Nota: usa
//Writer.

public class Principal {

    public static void main(String[] args) throws IOException {

        try {

            Scanner sc = new Scanner(System.in);

            Boolean ok=true;
            FileReader fr  = new FileReader("C:\\Users\\Foo\\developer\\Pruebas\\hola.txt");
            BufferedReader bf = new BufferedReader(fr);
            String texto = null;

           while (ok){
               texto = bf.readLine();
               System.out.println(texto);
               ok = false;
           }




            System.out.println("Deseas leerlo al reves?: ");
            String respuesta = sc.next();
            if(respuesta.equalsIgnoreCase("si")){
                StringBuilder strb = new StringBuilder(texto);
                String reverse = String.valueOf(strb.reverse());
                System.out.println(reverse);
            }


        }catch (IOException e){
            e.printStackTrace();
        }




    }

}

