/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsp_103_terminkalender;

/**
 *
 * @author Jörg
 */
public class AppointmentGUI extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentGUI
     */
    public AppointmentGUI() {
        initComponents();
       menuBearbeiten.setText("Bearbeiten");
       menuHinzufuegen.setText("hinzufügen");
       menuentfernen.setText("Entfernen");
       loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        menuHinzufuegen = new javax.swing.JMenuItem();
        menuentfernen = new javax.swing.JMenuItem();
        menuBearbeiten = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        menuHinzufuegen.setText("jMenuItem1");
        menuHinzufuegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHinzufuegenActionPerformed(evt);
            }
        });
        popup.add(menuHinzufuegen);

        menuentfernen.setText("jMenuItem2");
        popup.add(menuentfernen);

        menuBearbeiten.setText("jMenuItem3");
        popup.add(menuBearbeiten);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Termin-Kalender");
        setMinimumSize(new java.awt.Dimension(38, 80));

        jLabel1.setText("Termine");
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setComponentPopupMenu(popup);
        jList1.setMaximumSize(new java.awt.Dimension(10, 20));
        jList1.setMinimumSize(new java.awt.Dimension(10, 10));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHinzufuegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHinzufuegenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHinzufuegenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuBearbeiten;
    private javax.swing.JMenuItem menuHinzufuegen;
    private javax.swing.JMenuItem menuentfernen;
    private javax.swing.JPopupMenu popup;
    // End of variables declaration//GEN-END:variables

    private void saveData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadData() {
        
    }
}
