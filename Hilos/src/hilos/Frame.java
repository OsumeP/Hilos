/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Estudiante
 */

public class Frame {
    private JButton boton;
    private JFrame root;
    
    public Frame(){
        this.root = new JFrame("Acertijo");
        this.root.setBounds(100, 100, 600, 500);
        this.root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.root.add(panel);
        
        this.boton = new JButton("Boton");
        this.boton.setBounds(100, 100, 80, 20);
        panel.add(this.boton);
        
        this.root.setVisible(true);
    }
    
    public void ChangePosition(int x, int y){
        this.boton.setBounds(x, y, 80, 20);
    }
    
    public void ChangeColor(int R, int G, int B){
        Color color = new Color(R, G, B);
        this.boton.setBackground(color);
    }
}
