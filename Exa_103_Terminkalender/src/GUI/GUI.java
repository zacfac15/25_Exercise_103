package GUI;

public class GUI extends javax.swing.JFrame
{

  public GUI()
  {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jPopupMenu1 = new javax.swing.JPopupMenu();
    jMenuItem3 = new javax.swing.JMenuItem();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jScrollPane1 = new javax.swing.JScrollPane();
    ltList = new javax.swing.JList<>();

    jMenuItem3.setText("jMenuItem3");
    jPopupMenu1.add(jMenuItem3);

    jMenuItem1.setText("jMenuItem1");
    jPopupMenu1.add(jMenuItem1);

    jMenuItem2.setText("jMenuItem2");
    jPopupMenu1.add(jMenuItem2);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout());

    jScrollPane1.setComponentPopupMenu(jPopupMenu1.getComponentPopupMenu());

    ltList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    ltList.setComponentPopupMenu(jPopupMenu1);
    jScrollPane1.setViewportView(ltList);

    getContentPane().add(jScrollPane1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

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
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new GUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem jMenuItem3;
  private javax.swing.JPopupMenu jPopupMenu1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JList<String> ltList;
  // End of variables declaration//GEN-END:variables
}
