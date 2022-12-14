/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package motoca;

import Entidade.Moto;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author NOTE
 */
public class Motoca extends javax.swing.JDialog {

    /**
     * Creates new form Motoca
     */
    public Motoca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaCampos();
    }

    Moto moto = new Moto("BMW", "Motorrad", "Branca", 0, 4, 0, false);

    public void atualizaCampos() {
        marca.setText(moto.getMarca());
        cor.setText(moto.getCor());
        modelo.setText(moto.getModelo());
        marchaAtual.setText(moto.getMarcha().toString());
        if (moto.getStatus().equals(true)) {
            status.setText("Ligada");
        }
        if (moto.getStatus().equals(false)) {
            status.setText("Desligada");
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cor = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        marchaAtual = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        statusChange = new javax.swing.JButton();
        marchaAcima = new javax.swing.JButton();
        descerMarcha = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Marcha Atual");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Moto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setIconImage(null);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Moto do Brun??o");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 180, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Marca");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Modelo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Cor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        cor.setEditable(false);
        cor.setText("jTextField1");
        cor.setFocusable(false);
        getContentPane().add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 30));

        marca.setEditable(false);
        marca.setText("jTextField1");
        marca.setFocusable(false);
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 30));

        status.setEditable(false);
        status.setText("jTextField1");
        status.setFocusable(false);
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, 30));

        modelo.setEditable(false);
        modelo.setText("jTextField1");
        modelo.setFocusable(false);
        getContentPane().add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, 30));

        marchaAtual.setEditable(false);
        marchaAtual.setText("jTextField1");
        marchaAtual.setFocusable(false);
        getContentPane().add(marchaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 10, 10));

        statusChange.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        statusChange.setText("Ligar/Desligar Moto");
        statusChange.setFocusable(false);
        statusChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusChangeActionPerformed(evt);
            }
        });
        getContentPane().add(statusChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        marchaAcima.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        marchaAcima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/output-onlinepngtools (3).png"))); // NOI18N
        marchaAcima.setBorderPainted(false);
        marchaAcima.setContentAreaFilled(false);
        marchaAcima.setFocusable(false);
        marchaAcima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marchaAcimaActionPerformed(evt);
            }
        });
        getContentPane().add(marchaAcima, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 50, 50));
        marchaAcima.getAccessibleContext().setAccessibleDescription("");

        descerMarcha.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        descerMarcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/output-onlinepngtools (4).png"))); // NOI18N
        descerMarcha.setBorderPainted(false);
        descerMarcha.setContentAreaFilled(false);
        descerMarcha.setFocusable(false);
        descerMarcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descerMarchaActionPerformed(evt);
            }
        });
        getContentPane().add(descerMarcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 50, 50));
        descerMarcha.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (5).png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusChangeActionPerformed
        if (moto.getStatus().equals(false) && moto.getMarcha().equals(0)) {
            moto.setStatus(true);
            atualizaCampos();
            return;
        }
        if (moto.getStatus().equals(false) && !moto.getMarcha().equals(0)) {
            JOptionPane.showMessageDialog(null, "A marcha precisa estar no neutro (0) para a moto ser ligada");
            atualizaCampos();
        } else {
            moto.setStatus(false);
            atualizaCampos();
        }
    }//GEN-LAST:event_statusChangeActionPerformed

    private void marchaAcimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marchaAcimaActionPerformed
        if (!Objects.equals(moto.getMarcha(), moto.getMaiorMarcha())) {
            moto.setMarcha(moto.getMarcha() + 1);
            atualizaCampos();
            return;
        } else if (moto.getMarcha().equals(moto.getMaiorMarcha()) && moto.getStatus().equals(true)) {
            JOptionPane.showMessageDialog(null, "Voc?? j?? est?? na maior marcha. T?? querendo morrer?!");
            atualizaCampos();
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Voc?? j?? est?? na maior marcha.");
        }
        atualizaCampos();
    }//GEN-LAST:event_marchaAcimaActionPerformed

    private void descerMarchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descerMarchaActionPerformed
        if (!Objects.equals(moto.getMarcha(), moto.getMenorMarcha())) {
            moto.setMarcha(moto.getMarcha() - 1);
        } else {
            JOptionPane.showMessageDialog(null, "Voc?? j?? est?? na menor marcha");
        }
        atualizaCampos();
    }//GEN-LAST:event_descerMarchaActionPerformed

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
            java.util.logging.Logger.getLogger(Motoca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Motoca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Motoca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Motoca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Motoca dialog = new Motoca(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cor;
    private javax.swing.JButton descerMarcha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marca;
    private javax.swing.JButton marchaAcima;
    private javax.swing.JTextField marchaAtual;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField status;
    private javax.swing.JButton statusChange;
    // End of variables declaration//GEN-END:variables
}
