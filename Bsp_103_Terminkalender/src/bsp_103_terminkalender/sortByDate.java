package bsp_103_terminkalender;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class sortByDate implements Comparator<Appointment>{

    
    public int compare(Appointment o1, Appointment o2) {
       return o1.getDatum().compareTo(o2.getDatum());
    }
    
}
