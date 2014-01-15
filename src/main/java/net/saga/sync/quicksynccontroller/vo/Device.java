/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.vo;

/**
 *
 * @author summers
 */
public class Device {
    public static String TYPE = "DEVICE";
    
    public String deviceName;
    public String instrument = "nes-00";
    public Score score = new Score();
    public String _id;
}
