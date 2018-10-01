/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsp_103_terminkalender;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jörg
 */
public class Appointment {
    private LocalDate date;
    private LocalTime time;
    private String text;

    public Appointment(LocalDate date, LocalTime time, String text) {
        this.date = date;
        this.time = time;
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
