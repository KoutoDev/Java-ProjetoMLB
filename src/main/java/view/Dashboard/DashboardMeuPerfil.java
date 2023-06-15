package view.Dashboard;

import javax.swing.ImageIcon;

public class DashboardMeuPerfil extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public DashboardMeuPerfil() {
        initComponents();
        /*Icon Janela*/
        // Define o ícone da janela como a imagem localizada em "/images/icon.png".
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        // Define a posição da janela como centralizada em relação à tela.
        this.setLocationRelativeTo(null);
        // Imagens
        background.setSvgImage("images/Dashboard/MeuPerfil/backgroundMeuPerfil.svg",1310, 740);
        btnDadosPessoais.setSvgImage("images/Dashboard/MeuPerfil/buttonDados.svg",144,39);
        btnContato.setSvgImage("images/Dashboard/MeuPerfil/buttonContato.svg",84,39);
        btnEndereco.setSvgImage("images/Dashboard/MeuPerfil/buttonEndereco.svg",95,39);
        btnMeuPerfil.setSvgImage("images/Dashboard/meuperfil.svg", 115, 23);
        btnInicio.setSvgImage("images/Dashboard/inicioicon.svg", 76, 22);
        btnSair.setSvgImage("images/Dashboard/btnSair.svg", 64, 32);
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
        txtSenha = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCelular1 = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        btnDadosPessoais = new images.SVGImage();
        btnContato = new images.SVGImage();
        btnEndereco = new images.SVGImage();
        btnMeuPerfil = new images.SVGImage();
        btnInicio = new images.SVGImage();
        btnSair = new images.SVGImage();
        background = new images.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard - Mente Livre Brasil");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setText("Digite seu e-mail");
        txtNome.setBorder(null);
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 287, 230, 30));

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
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 332, 230, 30));

        txtCpf.setBackground(new java.awt.Color(247, 247, 247));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpf.setText("Digite seu e-mail");
        txtCpf.setBorder(null);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 377, 230, 30));

        txtSenha.setBackground(new java.awt.Color(247, 247, 247));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSenha.setText("Digite seu e-mail");
        txtSenha.setBorder(null);
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 422, 230, 30));

        txtCelular.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular.setText("Digite seu e-mail");
        txtCelular.setBorder(null);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 332, 230, 30));

        txtCelular1.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular1.setText("Digite seu e-mail");
        txtCelular1.setBorder(null);
        txtCelular1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelular1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelular1FocusLost(evt);
            }
        });
        jPanel1.add(txtCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 287, 230, 30));

        txtRua.setBackground(new java.awt.Color(247, 247, 247));
        txtRua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRua.setText("Digite seu e-mail");
        txtRua.setBorder(null);
        txtRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRuaFocusLost(evt);
            }
        });
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 287, 230, 30));

        txtBairro.setBackground(new java.awt.Color(247, 247, 247));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBairro.setText("Digite seu e-mail");
        txtBairro.setBorder(null);
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 332, 230, 30));

        txtCidade.setBackground(new java.awt.Color(247, 247, 247));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCidade.setText("Digite seu e-mail");
        txtCidade.setBorder(null);
        txtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCidadeFocusLost(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 377, 230, 30));

        txtEstado.setBackground(new java.awt.Color(247, 247, 247));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEstado.setText("Digite seu e-mail");
        txtEstado.setBorder(null);
        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 422, 230, 30));

        txtCep.setBackground(new java.awt.Color(247, 247, 247));
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCep.setText("Digite seu e-mail");
        txtCep.setBorder(null);
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        jPanel1.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 467, 230, 30));

        btnDadosPessoais.setText("sVGImage1");
        jPanel1.add(btnDadosPessoais, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 604, 144, 39));

        btnContato.setText("sVGImage2");
        jPanel1.add(btnContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 604, 84, 39));

        btnEndereco.setText("sVGImage3");
        jPanel1.add(btnEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 604, 95, 39));

        btnMeuPerfil.setText("meuperfilicon");
        jPanel1.add(btnMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 29, 115, 23));

        btnInicio.setText("inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 29, 76, 22));

        btnSair.setText("sair");
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 675, 64, 32));

        background.setText("sVGImage1");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked

    }//GEN-LAST:event_btnInicioMouseClicked

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // Verifica se o texto atual do campo de texto (txtEmail) é igual a "Digite seu e-mail".
        if (txtNome.getText().equals("Digite seu e-mail")) {
            txtNome.setText("");
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // Verifica se o texto atual do campo de texto (txtEmail) está vazio.
        if (txtNome.getText().equals("")) {
            txtNome.setText("Digite seu e-mail");
            // Se estiver vazio, o texto é definido como "Digite seu e-mail".
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtCelular1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelular1FocusGained

    private void txtCelular1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelular1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelular1FocusLost

    private void txtRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaFocusGained

    private void txtRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRuaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaFocusLost

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeFocusGained

    private void txtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeFocusLost

    private void txtEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoFocusGained

    private void txtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoFocusLost

    private void txtCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepFocusGained

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepFocusLost

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
            java.util.logging.Logger.getLogger(DashboardMeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMeuPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DashboardMeuPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.SVGImage background;
    private images.SVGImage btnContato;
    private images.SVGImage btnDadosPessoais;
    private images.SVGImage btnEndereco;
    private images.SVGImage btnInicio;
    private images.SVGImage btnMeuPerfil;
    private images.SVGImage btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular1;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
