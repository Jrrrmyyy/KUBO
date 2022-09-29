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
    
    

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }

  
    
}
