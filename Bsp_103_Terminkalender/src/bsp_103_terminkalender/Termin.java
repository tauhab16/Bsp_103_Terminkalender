/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsp_103_terminkalender;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Termin {
    private LocalDateTime datum;
    private String text;

    public Termin(LocalDateTime datum, String text) {
        this.datum = datum;
        this.text = text;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getText() {
        return text;
    }
    
    
}
