/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.vo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author summers
 */
class Score {

    static final String type = "SCORE";
    
    public int length = 8;
    public Map<Integer, String> notes;
    public String _id;
    
    Score() {
        this.notes = new HashMap<>();
    }
    
}
