/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Cubo.Cubo;
import java.util.Scanner;

/**
 *     1 clase principal
    Donde se vea el cubo1 con los valores q queramos (4,7,10)
    calcular volumen de cubo1
    esto en pantalla 

 *
 * @author Alumno Mañana
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner (System.in);
        
        Cubo calculo = new Cubo();
        
        int alt = 7;
        int anch = 4;
        int prof = 10;
        System.out.println("El cubo mide, 7 alto, 4 ancho y 10 profundidad");
        
        System.out.println("El volumen total es : " + alt + " * " + anch +
                " * " + prof + " = " + calculo.calcular(alt, anch, prof));
     
        
        System.out.println("====================");
           Cubo cubo1 = new Cubo(12,12,12);
        int res = cubo1.calcular(cubo1.getAlto(),cubo1.getAncho(),
                cubo1.getProfundo());
        System.out.println("El resultado del volumen de mi cubo es = " + res);
        
        
        System.out.println("====================");
        System.out.println("Introduce el valor de la altura: ");
        int a = lectura.nextInt();
        System.out.println("Introduce el valor de la anchura: ");
        int b = lectura.nextInt();
        System.out.println("Introduce el valor de la profundidad: ");
        int c = lectura.nextInt();
        System.out.println("El calculo del volumen es: "+ a + " * " + b +
                " * " + c + " = " + calculo.calcular(a, b, c));
        
        
     
    }
}
