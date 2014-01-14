/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.ektorp.changes.DocumentChange;
import org.jboss.aerogear.sync.SyncEventHandler;

/**
 *
 * @author summers
 */
public class ChangeListener implements SyncEventHandler{
    private static final String TAG = ChangeListener.class.getSimpleName();

    @Override
    public void onClose() {
        Logger.getLogger(TAG).log(Level.INFO, "Closed");
    }

    @Override
    public void onChange(DocumentChange result) {
        Logger.getLogger(TAG).log(Level.INFO, "Changed");
        Logger.getLogger(TAG).log(Level.INFO, result.getDoc());
    }
    
}
