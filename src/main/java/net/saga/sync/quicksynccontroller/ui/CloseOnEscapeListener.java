package net.saga.sync.quicksynccontroller.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author summers
 */
public class CloseOnEscapeListener implements KeyListener {
    private final JDialog dialog;

    public CloseOnEscapeListener(JDialog dialog) {
        this.dialog = dialog;
               
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                dialog.setVisible(false);
                break;
        }
    }
    
}
