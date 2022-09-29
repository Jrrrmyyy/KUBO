/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cubo;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    /*anchoxaltoxprofundo*/
 
    private int alto;
    private int ancho;
    private int profundo;

    public Cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
      public Cubo() {
    }
      
      public int calcular (int alto, int ancho, int profundo){
          return ancho * alto * profundo;
      }
    
    
    
   /* 2 constructores (Vacio y con 3 argumentos)
    getters setters
    metodo calcular volumen (argumento a,b,c) -> devuelve volumen cubo
    
    1 clase principal
    Donde se vea el cubo1 con los valores q queramos (4,7,10)
    calcular volumen de cubo1
    esto en pantalla */

  
    
}
