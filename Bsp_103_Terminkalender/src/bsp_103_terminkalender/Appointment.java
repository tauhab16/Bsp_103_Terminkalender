/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsp_103_terminkalender;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Appointment {
    private LocalDateTime datum;
    private String text;

    public Appointment(LocalDateTime datum, String text) {
        this.datum = datum;
        this.text = text;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getText() {
        return text;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String toString(){
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm yyyy.MM.dd EEEE");
       String back1 = datum.format(dtf);
        return String.format("%s - %s ",back1,text);
    }
    
    
}
