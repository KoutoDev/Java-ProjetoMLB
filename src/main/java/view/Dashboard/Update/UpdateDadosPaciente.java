package view.Dashboard.Update;

import view.SelectedCadastroPaciente.*;
import model.dao.PacienteDAO;
import javax.swing.*;
import model.bean.Paciente;
import view.GoToLogin;

public class UpdateDadosPaciente extends javax.swing.JFrame {

    public UpdateDadosPaciente() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Define a imagem de fundo SVG
        Background.setSvgImage("images/InsertPersonalDataBackground.svg", 1000, 640);
        // Imagem botão de retorno
        //btnReturn.setSvgImage("images/returnIcon.svg", 44, 35);
        txtNome.setFocusable(true);
        txtEmail.setFocusable(true);
        txtCpf.setFocusable(true);
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
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        senhaPasswordField1 = new javax.swing.JPasswordField();
        senhaPasswordField2 = new javax.swing.JPasswordField();
        btnAtualizarDados = new javax.swing.JButton();
        Background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados Pessoais | Paciente");
        setName("InsertPersonalDataFrame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setText("Digite seu nome");
        txtNome.setBorder(null);
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 195, 230, 30));

        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setText("Digite seu e-mail");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 240, 230, 30));

        txtCpf.setBackground(new java.awt.Color(247, 247, 247));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpf.setText("Digite seu CPF");
        txtCpf.setBorder(null);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 285, 230, 30));

        senhaPasswordField1.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaPasswordField1.setBorder(null);
        senhaPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaPasswordField1FocusGained(evt);
            }
        });
        jPanel1.add(senhaPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 330, 230, 30));

        senhaPasswordField2.setBackground(new java.awt.Color(247, 247, 247));
        senhaPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaPasswordField2.setBorder(null);
        jPanel1.add(senhaPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 375, 230, 30));

        btnAtualizarDados.setBackground(new java.awt.Color(227, 1, 64));
        btnAtualizarDados.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAtualizarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarDados.setText("Próximo");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 414, 245, 38));
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

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

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        // Aula dia 13 - Apostila 13_apostila... Pag3
        // Obtendo os dados
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        int cpf = Integer.parseInt(txtCpf.getText());
        String senha1 = new String(senhaPasswordField1.getPassword());
        String senha2 = new String(senhaPasswordField2.getPassword());
        // Verifica se as senhas são iguais
        if (senha1.equals(senha2)) {
            try {
                // Criando um objeto Paciente com os dados inseridos
                Paciente paciente = new Paciente(0, nome, cpf, email, senha1);
                PacienteDAO pacientedao = new PacienteDAO();
                // Inserindo o paciente no banco de dados
                pacientedao.createPaciente(paciente);
                System.out.println("Paciente inserido com sucesso");
                GoToLogin created = new GoToLogin();
                created.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                System.out.println("Não foi possível inserir paciente " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Suas senhas não coincidem. Tente novamente.");
        }

    }//GEN-LAST:event_btnAtualizarDadosActionPerformed
    //FocusGained (Funciona para limpar o campo quando é selecionado)
    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if (txtNome.getText().equals("Digite seu nome")) {
            txtNome.setText("");
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("Digite seu e-mail")) {
            txtEmail.setText("");
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if (txtCpf.getText().equals("Digite seu CPF")) {
            txtCpf.setText("");
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void senhaPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaPasswordField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordField1FocusGained
    //FocusLost (Restaura o texto padrão se o campo não for mais selecionado e não estiver preenchido)
    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if (txtNome.getText().equals("")) {
            txtNome.setText("Digite seu nome");
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Digite seu e-mail");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if (txtCpf.getText().equals("")) {
            txtCpf.setText("Digite seu CPF");
        }
    }//GEN-LAST:event_txtCpfFocusLost

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
            java.util.logging.Logger.getLogger(UpdateDadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDadosPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDadosPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage Background;
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaPasswordField1;
    private javax.swing.JPasswordField senhaPasswordField2;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
