
package com.main;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author PC
 */
public class MainUIbackround {

    public MainUIbackround() {
         try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainUIbackround.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  new AddNewMusic().setVisible(true);
    }
}