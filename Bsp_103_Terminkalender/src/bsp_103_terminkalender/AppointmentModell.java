package bsp_103_terminkalender;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;

public class AppointmentModell extends AbstractListModel{
private ArrayList <Appointment> termin = new ArrayList();
    @Override
    public int getSize() {
        return termin.size();
    }

    @Override
    public Object getElementAt(int index) {
        return termin.get(index);
    }
    public void add(Appointment t)
    {
        termin.add(t);
        this.fireContentsChanged(t, 0, 0);
    }
    public void remove(Appointment t)
    {
        termin.remove(t);
        this.fireContentsChanged(t, 0, 0);
    }
    public void sort()
    {
    Collections.sort(termin);
    }
}
