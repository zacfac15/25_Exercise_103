package GUI;

import beans.AppointmentModell;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabianzach
 */
public class AppointmentGUI extends javax.swing.JFrame
{

  AppointmentModell modell = new AppointmentModell();
  
  public AppointmentGUI()
  {
    initComponents();

    initComponents();
    ltListe.setModel(modell);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    menu = new javax.swing.JMenu();
    hinzufuegen = new javax.swing.JMenuItem();
    aendern = new javax.swing.JMenuItem();
    loeschen = new javax.swing.JMenuItem();
    jScrollPane1 = new javax.swing.JScrollPane();
    ltListe = new javax.swing.JList<>();

    menu.setText("jMenu1");

    hinzufuegen.setText("Hinzufügen");
    hinzufuegen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onHinzufügen(evt);
      }
    });
    menu.add(hinzufuegen);

    aendern.setText("Ändern");
    aendern.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onAendern(evt);
      }
    });
    menu.add(aendern);

    loeschen.setText("Löschen");
    loeschen.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onLoeschen(evt);
      }
    });
    menu.add(loeschen);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addWindowListener(new java.awt.event.WindowAdapter()
    {
      public void windowOpened(java.awt.event.WindowEvent evt)
      {
        onOpen(evt);
      }
      public void windowClosing(java.awt.event.WindowEvent evt)
      {
        onClose(evt);
      }
    });
    getContentPane().setLayout(new java.awt.GridLayout(1, 0));

    ltListe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    ltListe.setComponentPopupMenu(menu.getPopupMenu());
    jScrollPane1.setViewportView(ltListe);

    getContentPane().add(jScrollPane1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onHinzufügen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onHinzufügen
  {//GEN-HEADEREND:event_onHinzufügen
 AppointmentDlg dialog = new AppointmentDlg(this, true, null);
    dialog.setVisible(true);
    try
    {
      modell.addAppointment(dialog.getAppointment());
    }
    catch (Exception ex)
    {
      Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_onHinzufügen

  private void onAendern(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onAendern
  {//GEN-HEADEREND:event_onAendern
 int index = ltListe.getSelectedIndex();
    AppointmentDlg dialog = new AppointmentDlg(this, true, modell.get(index));
    dialog.setVisible(true);
    modell.changeAppointment(dialog.getAppointment(), index);
  }//GEN-LAST:event_onAendern

  private void onLoeschen(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onLoeschen
  {//GEN-HEADEREND:event_onLoeschen
 int indices[] = ltListe.getSelectedIndices();
    modell.deleteAppointment(indices);
  }//GEN-LAST:event_onLoeschen

  private void onClose(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onClose
  {//GEN-HEADEREND:event_onClose
 try
    {
      modell.save();
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
  }//GEN-LAST:event_onClose

  private void onOpen(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onOpen
  {//GEN-HEADEREND:event_onOpen
     try
    {
      try
      {
        modell.load();
      }
      catch (ClassNotFoundException ex)
      {
        Logger.getLogger(AppointmentGUI.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    catch (IOException ex)
    {
      ex.printStackTrace();
    }
  }//GEN-LAST:event_onOpen

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
      java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new AppointmentGUI().setVisible(true);
      }
    });
  };

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem aendern;
  private javax.swing.JMenuItem hinzufuegen;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenuItem loeschen;
  private javax.swing.JList<String> ltListe;
  private javax.swing.JMenu menu;
  // End of variables declaration//GEN-END:variables
}
