package view.Dashboard;

import database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.bean.Paciente;
import model.dao.PacienteDAO;
import view.ViewLogin;

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
        try {
            inserirDadosPaciente();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados do banco.");
        }
        // Imagens
        background.setSvgImage("images/Dashboard/MeuPerfil/backgroundMeuPerfil.svg", 1310, 740);
        //PopUp.setSvgImage("images/Dashboard/MeuPerfil/backgroundPopUpScreen.svg", 1310, 740);
        //btnVoltar.setSvgImage("images/Dashboard/MeuPerfil/buttonVoltar.svg", 68, 39);
        //btnContinuar.setSvgImage("images/Dashboard/MeuPerfil/buttonContinuar.svg", 99, 39);
        btnDadosPessoais.setSvgImage("images/Dashboard/MeuPerfil/buttonDados.svg", 144, 39);
        btnContato.setSvgImage("images/Dashboard/MeuPerfil/buttonContato.svg", 84, 39);
        btnEndereco.setSvgImage("images/Dashboard/MeuPerfil/buttonEndereco.svg", 95, 39);
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
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1310, 740));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(247, 247, 247));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNome.setBorder(null);
        txtNome.setEnabled(false);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 287, 230, 30));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(247, 247, 247));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setEnabled(false);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 332, 230, 30));

        txtCpf.setEditable(false);
        txtCpf.setBackground(new java.awt.Color(247, 247, 247));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCpf.setBorder(null);
        txtCpf.setEnabled(false);
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 377, 230, 30));

        txtSenha.setEditable(false);
        txtSenha.setBackground(new java.awt.Color(247, 247, 247));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSenha.setBorder(null);
        txtSenha.setEnabled(false);
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 422, 230, 30));

        txtCelular.setEditable(false);
        txtCelular.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular.setBorder(null);
        txtCelular.setEnabled(false);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 287, 230, 30));

        txtCelular1.setEditable(false);
        txtCelular1.setBackground(new java.awt.Color(247, 247, 247));
        txtCelular1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCelular1.setBorder(null);
        txtCelular1.setEnabled(false);
        jPanel1.add(txtCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 332, 230, 30));

        txtRua.setEditable(false);
        txtRua.setBackground(new java.awt.Color(247, 247, 247));
        txtRua.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtRua.setBorder(null);
        txtRua.setEnabled(false);
        jPanel1.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 287, 230, 30));

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(247, 247, 247));
        txtBairro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBairro.setBorder(null);
        txtBairro.setEnabled(false);
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 332, 230, 30));

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(247, 247, 247));
        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCidade.setBorder(null);
        txtCidade.setEnabled(false);
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 377, 230, 30));

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(247, 247, 247));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEstado.setBorder(null);
        txtEstado.setEnabled(false);
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 422, 230, 30));

        txtCep.setEditable(false);
        txtCep.setBackground(new java.awt.Color(247, 247, 247));
        txtCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtCep.setBorder(null);
        txtCep.setEnabled(false);
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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 29, 76, 22));

        btnSair.setText("sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 675, 64, 32));

        background.setText("sVGImage1");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        DashboardPrincipal returnToPrincipal = new DashboardPrincipal();
        returnToPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularFocusLost

    public void inserirDadosPaciente() throws Exception {
        String email = ViewLogin.emailLogin;
        try {
            Paciente paciente = new Paciente(email);
            PacienteDAO pacientedao = new PacienteDAO();
            if (pacientedao.obterPacienteDash(paciente)) {
                String sql = "SELECT p.nome, p.cpf, p.email, p.senha, t.celular, e.rua, e.bairro, e.cidade, e.estado, e.cep "
                        + "FROM paciente p "
                        + "JOIN telefone_paciente t ON p.cod_tel = t.cod_tel "
                        + "JOIN endereco_paciente e ON p.cod_endereco = e.cod_endereco "
                        + "WHERE p.email = ?";
                try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, email);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        String nome = rs.getString("nome");
                        String cpf = rs.getString("cpf");
                        String senha = rs.getString("senha");
                        String celular = rs.getString("celular");
                        String rua = rs.getString("rua");
                        String bairro = rs.getString("bairro");
                        String cidade = rs.getString("cidade");
                        String estado = rs.getString("estado");
                        String cep = rs.getString("cep");
                        // Atribuir os valores às JTextFields correspondentes
                        txtNome.setText(nome);
                        txtCpf.setText(cpf);
                        txtEmail.setText(email);
                        txtSenha.setText(senha);
                        txtBairro.setText(bairro);
                        txtCelular.setText(celular);
                        txtRua.setText(rua);
                        txtCelular1.setText(celular);
                        txtCidade.setText(cidade);
                        txtEstado.setText(estado);
                        txtCep.setText(cep);
                    } else {
                        System.out.println("Dados não encontrados.");
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DashboardMeuPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSairMouseClicked

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
