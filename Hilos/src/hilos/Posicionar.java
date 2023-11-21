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
public class Posicionar extends Thread{
    private Frame frame;
    Random aleatorio;
    private int x;
    private int y;
    
    public Posicionar(Frame frame){
        this.frame = frame;
        this.aleatorio = new Random();
    }
    
    @Override
    public void run(){
        while (true){
            this.x = aleatorio.nextInt(400);
            this.y = aleatorio.nextInt(400);
            this.frame.ChangePosition(this.x, this.y);
        }
    }
}
