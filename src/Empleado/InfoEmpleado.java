package Empleado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class InfoEmpleado
{
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String Nombre;
        int vh, ht, total;
        System.out.println("Digita el nombre del empleado: ");
        Nombre= leer.readLine();
        System.out.println("Digite el Numero de Horas Trabajadas");
        ht= Integer.parseInt(leer.readLine());
        System.out.println("Digite el Valor de la Hora");
        vh= Integer.parseInt(leer.readLine());
        total=vh*ht;
        System.out.println("El nombre del empleado es: "+Nombre+"y el total a pagar es:"+total);



    }
}
