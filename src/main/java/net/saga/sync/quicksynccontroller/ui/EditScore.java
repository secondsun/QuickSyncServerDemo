/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.saga.sync.quicksynccontroller.ui;

import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.SpinnerListModel;
import net.saga.sync.quicksynccontroller.repository.DeviceRepository;
import net.saga.sync.quicksynccontroller.repository.ScoreRepository;
import net.saga.sync.quicksynccontroller.vo.Device;
import net.saga.sync.quicksynccontroller.vo.Score;

/**
 *
 * @author summers
 */
public class EditScore extends javax.swing.JPanel {

    private final Device device;

    private final ScoreRepository repo = new ScoreRepository();
    private final JDialog dialog;
    private final DeviceRepository deviceRepo;
    private String deviceId;

    /**
     * Creates new form EditScore
     */
    public EditScore() {
        this(null, null, null, null);
    }

    public EditScore(Device device, JDialog dialog, DeviceRepository deviceRepo, String deviceId) {
        this.device = device;
        this.dialog = dialog;
        this.deviceRepo = deviceRepo;
        this.deviceId = deviceId;
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        instrumentSpinner = new javax.swing.JSpinner();
        note1 = new javax.swing.JSpinner();
        note3 = new javax.swing.JSpinner();
        note2 = new javax.swing.JSpinner();
        note7 = new javax.swing.JSpinner();
        note6 = new javax.swing.JSpinner();
        note5 = new javax.swing.JSpinner();
        note4 = new javax.swing.JSpinner();
        note8 = new javax.swing.JSpinner();

        jLabel1.setText("Instrument");

        jLabel2.setText("One");

        jLabel3.setText("Two");

        jLabel4.setText("Three");

        jLabel5.setText("Four");

        jLabel6.setText("Five");

        jLabel7.setText("Six");

        jLabel8.setText("Seven");

        jLabel9.setText("Eight");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(note1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(note2)
                            .addComponent(note3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(note4)
                            .addComponent(note5)
                            .addComponent(note6)
                            .addComponent(note7)
                            .addComponent(note8)
                            .addComponent(instrumentSpinner)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(instrumentSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(note1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(note2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(note3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(note4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(note5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(note6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(note7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(note8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING)); 
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Score score = device.score;
        device.instrument = instrumentSpinner.getValue().toString();
        device.score.notes.put(0, note1.getValue().toString());
        device.score.notes.put(1, note2.getValue().toString());
        device.score.notes.put(2, note3.getValue().toString());
        device.score.notes.put(3, note4.getValue().toString());
        device.score.notes.put(4, note5.getValue().toString());
        device.score.notes.put(5, note6.getValue().toString());
        device.score.notes.put(6, note7.getValue().toString());
        device.score.notes.put(7, note8.getValue().toString());
        
        deviceRepo.update(device, deviceId);
        dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING)); 

    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JSpinner instrumentSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner note1;
    private javax.swing.JSpinner note2;
    private javax.swing.JSpinner note3;
    private javax.swing.JSpinner note4;
    private javax.swing.JSpinner note5;
    private javax.swing.JSpinner note6;
    private javax.swing.JSpinner note7;
    private javax.swing.JSpinner note8;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    private void initData() {
        
        List<String> instruments = repo.getInstruments();
        List<String> notes = repo.getNotes();
        
        instrumentSpinner.setModel(new SpinnerListModel(instruments));
        note1.setModel(new SpinnerListModel(notes));
        note2.setModel(new SpinnerListModel(notes));
        note3.setModel(new SpinnerListModel(notes));
        note4.setModel(new SpinnerListModel(notes));
        note5.setModel(new SpinnerListModel(notes));
        note6.setModel(new SpinnerListModel(notes));
        note7.setModel(new SpinnerListModel(notes));
        note8.setModel(new SpinnerListModel(notes));
    
        instrumentSpinner.setValue(device.instrument);
        note1.setValue(device.score.note(0));
        note2.setValue(device.score.note(1));
        note3.setValue(device.score.note(2));
        note4.setValue(device.score.note(3));
        note5.setValue(device.score.note(4));
        note6.setValue(device.score.note(5));
        note7.setValue(device.score.note(6));
        note8.setValue(device.score.note(7));

    }
}
