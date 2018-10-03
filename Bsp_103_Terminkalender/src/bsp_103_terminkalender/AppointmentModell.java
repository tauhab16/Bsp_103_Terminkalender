package bsp_103_terminkalender;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;

<<<<<<< HEAD
public class AppointmentModell extends AbstractListModel{
private ArrayList <Appointment> termin = new ArrayList();
    sortByDate sbd = new sortByDate();
=======
public class AppointmentModell extends AbstractListModel {

    private ArrayList<Appointment> termin = new ArrayList();

>>>>>>> 7cd1e1bee45566f28fc723e2e0b22cbcf2cc3f87
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
        termin.add(index,t);
        this.fireContentsChanged(t, 0, 0);
    }
<<<<<<< HEAD
//    public void sort()
//    {
//    Collections.sort(termin);
//    }

    void sort(sortByDate sortByDate) {
        Collections.sort(termin,sbd);
        fireContentsChanged(this, 0, termin.size()-1);
    }
=======
>>>>>>> 7cd1e1bee45566f28fc723e2e0b22cbcf2cc3f87
}
