

import java.awt.Color;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion
 */
public class MainFrame extends JFrame{

    public MainFrame(){
        this.add(new GamePanel());
        this.add(new Menu());
        this.setTitle("Tic-Tak-Toe");
        this.setResizable(false);
        this.pack();
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    }
    
}
