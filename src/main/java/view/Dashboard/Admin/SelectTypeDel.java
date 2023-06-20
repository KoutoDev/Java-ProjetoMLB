package view.Dashboard.Admin;

import javax.swing.ImageIcon;

public class SelectTypeDel extends javax.swing.JFrame {

    /**
     * Creates new form SelectTypeDel
     */
    public SelectTypeDel() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
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
        btnPaciente = new javax.swing.JButton();
        btnPsicologo = new javax.swing.JButton();
        btnPsiquiatra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setText("Qual tipo de usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 125, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setText("você deseja excluir?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 157, -1, -1));

        btnPaciente.setBackground(new java.awt.Color(41, 151, 255));
        btnPaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnPaciente.setText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 237, 109, 38));

        btnPsicologo.setBackground(new java.awt.Color(41, 151, 255));
        btnPsicologo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnPsicologo.setForeground(new java.awt.Color(255, 255, 255));
        btnPsicologo.setText("Psicólogo");
        btnPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsicologoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPsicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 237, 119, 38));

        btnPsiquiatra.setBackground(new java.awt.Color(41, 151, 255));
        btnPsiquiatra.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnPsiquiatra.setForeground(new java.awt.Color(255, 255, 255));
        btnPsiquiatra.setText("Psiquiatra");
        btnPsiquiatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsiquiatraActionPerformed(evt);
            }
        });
        jPanel1.add(btnPsiquiatra, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 237, 124, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        SelectedDelPaciente delPaciente = new SelectedDelPaciente();
        delPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsicologoActionPerformed
        SelectedDelPsicologo delPsicologo = new SelectedDelPsicologo();
        delPsicologo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPsicologoActionPerformed

    private void btnPsiquiatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsiquiatraActionPerformed
        SelectedDelPsiquiatra delPsiquiatra = new SelectedDelPsiquiatra();
        delPsiquiatra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPsiquiatraActionPerformed

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
            java.util.logging.Logger.getLogger(SelectTypeDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectTypeDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectTypeDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectTypeDel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectTypeDel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPsicologo;
    private javax.swing.JButton btnPsiquiatra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
