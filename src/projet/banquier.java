/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class banquier extends javax.swing.JFrame {

    /**
     * Creates new form banquier
     */
    public String cin ;
    public banquier() {
        initComponents();
        
  
    }
    public void afficher()  {
    PreparedStatement ps ; 
    ResultSet rs ; 
    String query = ("SELECT * FROM users.client ") ;
        try {
            ps = ConnectionBd.getconnection().prepareStatement(query) ;
            rs=ps.executeQuery() ; 
            table.setModel(DbUtils.resultSetToTableModel(rs));
         
        } catch (SQLException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}
      
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnvirement1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnafficher = new javax.swing.JButton();
        btnsupprimer = new javax.swing.JButton();
        btndeconnexion = new javax.swing.JButton();
        btnretour = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnvirement1.setBackground(new java.awt.Color(0, 255, 102));
        btnvirement1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnvirement1.setText("afficher");
        btnvirement1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnvirement1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnvirement1MouseExited(evt);
            }
        });
        btnvirement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvirement1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nom", "prenom", "motdepasse", "tel", "email", "genre", "image", "cin", "solde"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 530, 400));

        btnafficher.setBackground(new java.awt.Color(0, 255, 102));
        btnafficher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnafficher.setText("afficher");
        btnafficher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnafficherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnafficherMouseExited(evt);
            }
        });
        btnafficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnafficherActionPerformed(evt);
            }
        });
        getContentPane().add(btnafficher, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 120, 60));

        btnsupprimer.setBackground(new java.awt.Color(0, 255, 102));
        btnsupprimer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsupprimer.setText("supprimer");
        btnsupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsupprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsupprimerMouseExited(evt);
            }
        });
        btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnsupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 120, 60));

        btndeconnexion.setBackground(new java.awt.Color(51, 51, 255));
        btndeconnexion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btndeconnexion.setText("deconnexion");
        btndeconnexion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseMoved(evt);
            }
        });
        btndeconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndeconnexionMouseExited(evt);
            }
        });
        btndeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeconnexionActionPerformed(evt);
            }
        });
        getContentPane().add(btndeconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 190, 50));

        btnretour.setBackground(new java.awt.Color(102, 255, 204));
        btnretour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnretour.setText("retour");
        btnretour.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnretourMouseMoved(evt);
            }
        });
        btnretour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnretourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnretourMouseExited(evt);
            }
        });
        btnretour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretourActionPerformed(evt);
            }
        });
        getContentPane().add(btnretour, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 150, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnafficherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnafficherMouseEntered
        btnafficher.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btnafficherMouseEntered

    private void btnafficherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnafficherMouseExited
        btnafficher.setBackground(new Color(0,255,102));

    }//GEN-LAST:event_btnafficherMouseExited

    private void btnafficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnafficherActionPerformed
afficher() ; 
        
 
    }//GEN-LAST:event_btnafficherActionPerformed

    private void btnvirement1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvirement1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvirement1MouseEntered

    private void btnvirement1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvirement1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvirement1MouseExited

    private void btnvirement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvirement1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvirement1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int ligne =table.getSelectedRow();
         cin=table.getModel().getValueAt(ligne, 7).toString();
    }//GEN-LAST:event_tableMouseClicked

    private void btnsupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsupprimerMouseEntered
        // TODO add your handling code here:
         btnsupprimer.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btnsupprimerMouseEntered

    private void btnsupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsupprimerMouseExited
        // TODO add your handling code here:
       btnsupprimer.setBackground(new Color(0,255,102));
    }//GEN-LAST:event_btnsupprimerMouseExited

    private void btnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprimerActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps ; 
        String query = ("delete from users.client where cin=?") ; 
        try {
            
            ps = ConnectionBd.getconnection().prepareStatement(query) ;
            ps.setString(1, cin);
            int i=ps.executeUpdate();  
            if (i!=0)
                 JOptionPane.showMessageDialog(null, "suppression avec succés  ", "OK ", JOptionPane.PLAIN_MESSAGE);
            else 
                JOptionPane.showMessageDialog(null, "opération echoué ", "information manquante ",JOptionPane.ERROR_MESSAGE);
            
        } catch (SQLException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(banquier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsupprimerActionPerformed

    private void btndeconnexionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeconnexionMouseMoved

    private void btndeconnexionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseEntered
        btndeconnexion.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btndeconnexionMouseEntered

    private void btndeconnexionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeconnexionMouseExited
        btndeconnexion.setBackground(new Color(102,255,204));
    }//GEN-LAST:event_btndeconnexionMouseExited

    private void btndeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeconnexionActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(null, "suppression avec  succés ", "ok ", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btndeconnexionActionPerformed

    private void btnretourMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretourMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnretourMouseMoved

    private void btnretourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretourMouseEntered
        btnretour.setBackground(new Color(255,51,0));
    }//GEN-LAST:event_btnretourMouseEntered

    private void btnretourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretourMouseExited
        btnretour.setBackground(new Color(102,255,204));

    }//GEN-LAST:event_btnretourMouseExited

    private void btnretourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretourActionPerformed
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        login login=new login();
         login.setVisible(true);
     login.setLocationRelativeTo(null);
        this.dispose();
        

    }//GEN-LAST:event_btnretourActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banquier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnafficher;
    private javax.swing.JButton btndeconnexion;
    private javax.swing.JButton btnretour;
    private javax.swing.JButton btnsupprimer;
    private javax.swing.JButton btnvirement1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
