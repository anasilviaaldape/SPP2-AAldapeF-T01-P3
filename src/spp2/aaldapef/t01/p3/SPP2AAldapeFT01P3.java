/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class SPP2AAldapeFT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ana Silvia Aldape Felizardo
        //A01410367
        //IIS
        
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        //Variables
        double x1;
        double x2;
        double y1;
        double y2;
        double dis;
        
        //Datos
        System.out.println("PROGRAMA 03.");
        System.out.println(" ");
        System.out.println("Ingresa los datos solicitados");
        System.out.print("x1: ");
        x1= teclado.nextDouble();
        System.out.print("y1: ");
        y1= teclado.nextDouble();
        System.out.print("x2: ");
        x2= teclado.nextDouble();
        System.out.print("y2: ");
        y2= teclado.nextDouble();
        
        //Resultados
        dis= Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        System.out.println(" ");
        System.out.println("La distancia entre P1 y P2 es de " +dis);
        
        
        
        
        
    }
    
}
