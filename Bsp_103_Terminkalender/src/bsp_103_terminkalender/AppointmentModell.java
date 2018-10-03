package bsp_103_terminkalender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javafx.util.converter.LocalDateTimeStringConverter;
import javax.swing.AbstractListModel;

public class AppointmentModell extends AbstractListModel {

    private ArrayList<Appointment> termin = new ArrayList();

    private sortByDate m = new sortByDate();

    @Override
    public int getSize() {
        return termin.size();
    }

    @Override
    public Object getElementAt(int index) {
        return termin.get(index);
    }

    public void remove(Appointment t) {
        termin.remove(t);
        this.fireContentsChanged(t, 0, 0);
    }

    public void add(Appointment t) {
        termin.add(t);
        this.fireContentsChanged(t, 0, 0);
    }

    public void change(Appointment t, int index) {
        termin.add(index, t);
        this.fireContentsChanged(t, 0, 0);
    }

    public void sort(sortByDate sortByDate) {
        Collections.sort(termin, m);
        fireContentsChanged(this, 0, termin.size() - 1);
    }

    public void save(File f) throws IOException {
        PrintWriter printReiter = new PrintWriter(f);
        for (Appointment w : termin) {
            printReiter.print(w.getDatum() + ";");
            printReiter.println(w.getText() + ";");

        }
        printReiter.close();
    }

    public void load(File f) throws IOException {
        try {
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = "";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            while ((line = bufferReader.readLine()) != null) {
                String[] s = line.split(";");
                StringBuilder h = new StringBuilder(s[0]);
                h.replace(10, 11, " ");
                add(new Appointment(LocalDateTime.parse(h, dtf), s[1]));
            }
            bufferReader.close();
            fileReader.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
