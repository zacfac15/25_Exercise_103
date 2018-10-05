package GUI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AppointmentDlg1 extends javax.swing.JDialog
{


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    tfUhrzeit = new javax.swing.JTextField();
    lbUhrzeit = new javax.swing.JLabel();
    lbDatum = new javax.swing.JLabel();
    tfDatum = new javax.swing.JTextField();
    lbText = new javax.swing.JLabel();
    tfText = new javax.swing.JTextField();
    btÜbernehmen = new javax.swing.JButton();
    btAbbrechen = new javax.swing.JButton();

    tfUhrzeit.setText("12:30");

    lbUhrzeit.setText("Uhrzeit:");

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout(3, 0));

    lbDatum.setText("Datum");
    getContentPane().add(lbDatum);

    tfDatum.setText("10.12.2001 - 13:05");
    getContentPane().add(tfDatum);

    lbText.setText("Text:");
    getContentPane().add(lbText);

    tfText.setText("Test");
    getContentPane().add(tfText);

    btÜbernehmen.setText("übernehmen");
    btÜbernehmen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btUebernehmen(evt);
      }
    });
    getContentPane().add(btÜbernehmen);

    btAbbrechen.setText("abbrechen");
    btAbbrechen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btAbbrechen(evt);
      }
    });
    getContentPane().add(btAbbrechen);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btUebernehmen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUebernehmen

    }//GEN-LAST:event_btUebernehmen

    private void btAbbrechen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbbrechen
 
    }//GEN-LAST:event_btAbbrechen


  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentDlg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentDlg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentDlg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentDlg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        dialog.addWindowListener(new java.awt.event.WindowAdapter()
        {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e)
          {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btAbbrechen;
  private javax.swing.JButton btÜbernehmen;
  private javax.swing.JLabel lbDatum;
  private javax.swing.JLabel lbText;
  private javax.swing.JLabel lbUhrzeit;
  private javax.swing.JTextField tfDatum;
  private javax.swing.JTextField tfText;
  private javax.swing.JTextField tfUhrzeit;
  // End of variables declaration//GEN-END:variables
}
