
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion
 */
public class Menu extends JPanel implements ActionListener{
    
    protected int SCREENHEIGHT = 600;
    protected int SCREENWIDTH = 600;
    
    JButton play = new JButton("PLAY");
    JButton help = new JButton();
    JButton sett = new JButton();
    
    

    
    Menu() 
    {
        this.setPreferredSize(new Dimension(SCREENWIDTH,SCREENHEIGHT));
        this.setBackground(new Color(50,50,50));
        this.add(play);
        this.add(help);
        this.add(sett);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
