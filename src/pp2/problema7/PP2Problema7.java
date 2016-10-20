/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double kmh;
        //Resolucion
        kmh=getInf();
        print(convKmh(kmh),kmh);
    }
    public static double getInf () //Se recibe la información
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ al programa ****");
        System.out.println("Ingrese los Km/h que quiere convertir a m/s: ");
        return in.nextDouble();
    }
    public static double convKmh(double kmh)
    {
        double conv;
        conv=(kmh*0.277);  //Se utiliza el equivalente de km/h a m/s
        return conv;
    }
    public static void print(double res, double kmh) //Se imprime
    {
        System.out.println(kmh+" km/h es equivalente a "+res+" m/s");
    }   
}
