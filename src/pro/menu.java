/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

/**
 *
 * @author LENOVO
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bventas = new javax.swing.JButton();
        jbaltas_nuevo = new javax.swing.JButton();
        jbproveedores = new javax.swing.JButton();
        jbproductos = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 36)); // NOI18N
        jLabel1.setText("Menú");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/min.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(251, 251, 251)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bventas.setBackground(new java.awt.Color(255, 153, 51));
        bventas.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 24)); // NOI18N
        bventas.setText("ventas");
        bventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bventasMouseClicked(evt);
            }
        });
        bventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bventasActionPerformed(evt);
            }
        });

        jbaltas_nuevo.setBackground(new java.awt.Color(255, 153, 0));
        jbaltas_nuevo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 24)); // NOI18N
        jbaltas_nuevo.setText("altas");
        jbaltas_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbaltas_nuevoMouseClicked(evt);
            }
        });
        jbaltas_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaltas_nuevoActionPerformed(evt);
            }
        });

        jbproveedores.setBackground(new java.awt.Color(255, 153, 0));
        jbproveedores.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 24)); // NOI18N
        jbproveedores.setText("proveedores");
        jbproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbproveedoresMouseClicked(evt);
            }
        });

        jbproductos.setBackground(new java.awt.Color(255, 153, 0));
        jbproductos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 24)); // NOI18N
        jbproductos.setText("productos");
        jbproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbproductosMouseClicked(evt);
            }
        });

        jbsalir.setBackground(new java.awt.Color(255, 153, 0));
        jbsalir.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 24)); // NOI18N
        jbsalir.setText("salir");
        jbsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbsalirMouseClicked(evt);
            }
        });
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbaltas_nuevo)
                    .addComponent(bventas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbproveedores)
                    .addComponent(jbproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jbsalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(bventas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jbproductos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbaltas_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jbsalir)
                        .addGap(36, 36, 36)
                        .addComponent(jbproveedores)
                        .addGap(26, 116, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbaltas_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaltas_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbaltas_nuevoActionPerformed

    private void jbsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbsalirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jbsalirMouseClicked

    private void bventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bventasMouseClicked
        ventas jfventa=new ventas();
        jfventa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bventasMouseClicked

    private void jbproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbproductosMouseClicked
        fina jffinal=new fina();
        jffinal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbproductosMouseClicked

    private void jbaltas_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbaltas_nuevoMouseClicked
       altas_nuevo jfaltas=new altas_nuevo();
        jfaltas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbaltas_nuevoMouseClicked

    private void jbproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbproveedoresMouseClicked
        proveedores jfproveedor=new proveedores();
        jfproveedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbproveedoresMouseClicked

    private void bventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bventasActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsalirActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbaltas_nuevo;
    private javax.swing.JButton jbproductos;
    private javax.swing.JButton jbproveedores;
    private javax.swing.JButton jbsalir;
    // End of variables declaration//GEN-END:variables
}
