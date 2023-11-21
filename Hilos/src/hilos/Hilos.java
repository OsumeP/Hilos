/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Estudiante
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame ventana = new Frame();
        Thread coloreo = new Colorear(ventana);
        Thread posiciono = new Posicionar(ventana);
        
        coloreo.start();
        posiciono.start();
    }
    
}
