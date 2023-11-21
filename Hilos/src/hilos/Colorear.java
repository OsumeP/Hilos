/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Colorear extends Thread{
    
    private Frame frame;
    Random aleatorio;
    private int r;
    private int g;
    private int b;
    
    public Colorear(Frame frame){
        this.frame = frame;
        this.aleatorio = new Random();
    }
    
    @Override
    public void run(){
        while (true){
            this.r = aleatorio.nextInt(255);
            this.g = aleatorio.nextInt(255);
            this.b = aleatorio.nextInt(255);
            this.frame.ChangeColor(this.r, this.g, this.b);
        }
    }
}
