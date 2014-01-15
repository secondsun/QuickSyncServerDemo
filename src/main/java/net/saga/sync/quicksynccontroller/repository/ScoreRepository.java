/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author summers
 */
public class ScoreRepository {

    private static final List<String> instruments;
    private static final List<String> notes;
    
    static {
        List<String>  tempInstrument = new ArrayList<>(15);
        List<String>  tempNote = new ArrayList<>(15);
        String instrumentTemplate = "nes-%02d";
        String noteTemplate = "%02d";
        for (int i=0; i < 16; i++) {
            tempInstrument.add(String.format(instrumentTemplate, i));
            tempNote.add(String.format(noteTemplate, i));
        }
        instruments = Collections.unmodifiableList(tempInstrument);
        tempNote.add("");
        notes = Collections.unmodifiableList(tempNote);
    }
    
    public ScoreRepository() {
    }
    
    public List<String> getInstruments() {
        return instruments;
    }
    
    public List<String> getNotes() {
        return notes;
    }
    
}
