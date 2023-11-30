/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package messenger;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;

/**
 *
 * @author bhavp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frame().setVisible(true);
            }
        });
    }
    
}
