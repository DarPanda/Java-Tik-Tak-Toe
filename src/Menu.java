
import java.awt.Dimension;
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
public class Menu extends JPanel {
    
    protected int SCREENHEIGHT = 600;
    protected int SCREENWIDTH = 800;
    

    Menu() 
    {
        this.setPreferredSize(new Dimension(SCREENWIDTH,SCREENHEIGHT));
    }
    
}
