package view;

import javax.swing.ImageIcon;

public class ViewSelectTypeCadastro extends javax.swing.JFrame {

    /**
     * Creates new form ViewSelectTypeCadastro
     */
    public ViewSelectTypeCadastro() {
        initComponents();
        // Define o ícone da janela
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define o fundo da janela usando uma imagem SVG
        sVGImage1.setSvgImage("images/LoginLogoBackground.svg", 618, 640);
        // Define uma imagem SVG para o componente sVGImage2
        sVGImage2.setSvgImage("images/returnIcon.svg", 44, 35);
        // Define a localização da janela como centralizada na tela
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSouProfissional = new javax.swing.JButton();
        btnSouPaciente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sVGImage2 = new view.SVGImage();
        jPanel2 = new javax.swing.JPanel();
        sVGImage1 = new view.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Cadastro");
        setLocation(new java.awt.Point(250, 50));
        setMaximumSize(new java.awt.Dimension(1000, 640));
        setMinimumSize(new java.awt.Dimension(1000, 640));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSouProfissional.setBackground(new java.awt.Color(41, 151, 255));
        btnSouProfissional.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSouProfissional.setForeground(new java.awt.Color(255, 255, 255));
        btnSouProfissional.setText("Sou Profissional");
        btnSouProfissional.setBorder(null);
        btnSouProfissional.setBorderPainted(false);
        btnSouProfissional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSouProfissional.setPreferredSize(new java.awt.Dimension(207, 35));
        btnSouProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSouProfissionalMouseClicked(evt);
            }
        });
        jPanel1.add(btnSouProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 330, -1, -1));

        btnSouPaciente.setBackground(new java.awt.Color(41, 151, 255));
        btnSouPaciente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSouPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnSouPaciente.setText("Sou Paciente");
        btnSouPaciente.setBorder(null);
        btnSouPaciente.setBorderPainted(false);
        btnSouPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSouPaciente.setPreferredSize(new java.awt.Dimension(207, 35));
        btnSouPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSouPacienteMouseClicked(evt);
            }
        });
        jPanel1.add(btnSouPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 288, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 29, 29));
        jLabel2.setText("O que você é?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 225, -1, -1));

        sVGImage2.setText("sVGImage2");
        sVGImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sVGImage2MouseClicked(evt);
            }
        });
        jPanel1.add(sVGImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 44, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Click Voltar a tela de Login*/
    private void sVGImage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sVGImage2MouseClicked
        // Cria uma instância da classe ViewLogin
        ViewLogin returnViewLogin = new ViewLogin();
        // Torna a janela atual invisível
        this.setVisible(false);
        // Torna a janela returnViewLogin visível
        returnViewLogin.setVisible(true);
    }//GEN-LAST:event_sVGImage2MouseClicked
    /*Click (Sou Paciente)*/
    private void btnSouPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSouPacienteMouseClicked
        // Cria uma instância da classe ViewSelectedPaciente
        ViewSelectedPaciente openSelectedPaciente = new ViewSelectedPaciente();
        // Torna a janela atual invisível
        this.setVisible(false);
        // Torna a janela openSelectedPaciente visível
        openSelectedPaciente.setVisible(true);
    }//GEN-LAST:event_btnSouPacienteMouseClicked
    /*Click (Sou Psicólogo)*/
    private void btnSouProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSouProfissionalMouseClicked
        // Cria uma instância da classe ViewSelectedProfissional
        ViewSelectedProfissional openSelectedProfissional = new ViewSelectedProfissional();
        // Torna a janela atual invisível
        this.setVisible(false);
        // Torna a janela openSelectedProfissional visível
        openSelectedProfissional.setVisible(true);
    }//GEN-LAST:event_btnSouProfissionalMouseClicked

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
            java.util.logging.Logger.getLogger(ViewSelectTypeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSelectTypeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSelectTypeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSelectTypeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSelectTypeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSouPaciente;
    private javax.swing.JButton btnSouProfissional;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private view.SVGImage sVGImage1;
    private view.SVGImage sVGImage2;
    // End of variables declaration//GEN-END:variables
}
