/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import javax.swing.JFrame;
import java.awt.FlowLayout;

/**
 *
 * @author Carlos G. Anguiano
 */
public class Marco extends JFrame{
    
    //Genera la base JFrame sobre la cuál se monta la Ventana
    public Marco(){
        super();
        this.setTitle("Fibonacci - Factorial");
        this.setBounds(100, 100, 500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        
    }
    
}
