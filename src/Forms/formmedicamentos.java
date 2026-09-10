package Forms;

import beans.medicamentos;
import dao.medicamentosDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class formmedicamentos extends javax.swing.JFrame {

    public formmedicamentos() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnomeMedicamento = new javax.swing.JTextField();
        txtclasseMedicamento = new javax.swing.JTextField();
        txtindicacoes = new javax.swing.JTextField();
        txtviaAdministracao = new javax.swing.JTextField();
        txtmodouso = new javax.swing.JTextField();
        txtformaDiluicao = new javax.swing.JTextField();
        txtcuidadosEnfermagem = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnpesquisar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnomemedicamento1 = new javax.swing.JTextField();
        btnlistar1 = new javax.swing.JButton();
        btnldelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de medicamentos");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do medicamento:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Classe do medicamento:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Indicações:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Via de Administração:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Modo de uso:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Forma de diluição: ");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cuidados de enfermagem ");

        txtnomeMedicamento.setBackground(new java.awt.Color(255, 255, 255));

        txtclasseMedicamento.setBackground(new java.awt.Color(255, 255, 255));

        txtindicacoes.setBackground(new java.awt.Color(255, 255, 255));

        txtviaAdministracao.setBackground(new java.awt.Color(255, 255, 255));

        txtmodouso.setBackground(new java.awt.Color(255, 255, 255));

        txtformaDiluicao.setBackground(new java.awt.Color(255, 255, 255));

        txtcuidadosEnfermagem.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Pesquisar medicamento ");

        txtnomemedicamento1.setBackground(new java.awt.Color(255, 255, 255));
        txtnomemedicamento1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnomemedicamento1CaretUpdate(evt);
            }
        });

        btnlistar1.setText("Listar");
        btnlistar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlistar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistar1ActionPerformed(evt);
            }
        });

        btnldelete.setText("Deletar");
        btnldelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnldelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnldeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnlistar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnomemedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtformaDiluicao, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtmodouso, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtviaAdministracao, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtindicacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtcuidadosEnfermagem)
                                    .addComponent(txtclasseMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtnomeMedicamento))))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnomeMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtclasseMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtindicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtviaAdministracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmodouso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtformaDiluicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtcuidadosEnfermagem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtnomemedicamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlistar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnldelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    String nome = txtnomeMedicamento.getText();
    String classe = txtclasseMedicamento.getText();
    String indicacoes = txtindicacoes.getText();
    String viaAdministracao = txtviaAdministracao.getText();
    String modoUso = txtmodouso.getText();
    String formaDiluicao = txtformaDiluicao.getText();
    String cuidadosEnfermagem = txtcuidadosEnfermagem.getText();

    medicamentos m = new medicamentos();

    // Primeiro coloca os dados no objeto
    m.setNome(nome);
    m.setClasse(classe);
    m.setIndicacoes(indicacoes);
    m.setVia_administracao(viaAdministracao);
    m.setModoUso(modoUso);
    m.setFormaDiluicao(formaDiluicao);
    m.setCuidadosEnfermagem(cuidadosEnfermagem);

    // Depois envia o objeto preenchido para o DAO
    medicamentosDAO dao = new medicamentosDAO();
    dao.inserir(m);

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Medicamento cadastrado com sucesso"
    );

    // Limpa os campos
    txtnomeMedicamento.setText("");
    txtclasseMedicamento.setText("");
    txtindicacoes.setText("");
    txtviaAdministracao.setText("");
    txtmodouso.setText("");
    txtformaDiluicao.setText("");
    txtcuidadosEnfermagem.setText("");        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
 
   String nomeMedicamento = txtnomemedicamento1.getText();
    
    medicamentosDAO dao = new medicamentosDAO();
    List<medicamentos> listaMedicamentos = dao.getmedicamentos();
        
    
    if ( listaMedicamentos == null || listaMedicamentos.isEmpty()){
        JOptionPane.showMessageDialog(this, "Medicamento não encontrado");
    } else{
            medicamentos m = listaMedicamentos.get(0);
            txtnomeMedicamento.setText(m.getNome());
            txtclasseMedicamento.setText(m.getClasse());
            txtindicacoes.setText(m.getIndicacoes());
            txtviaAdministracao.setText(m.getVia_administracao());
            txtmodouso.setText(m.getModoUso());
            txtformaDiluicao.setText(m.getFormaDiluicao());
            txtcuidadosEnfermagem.setText(m.getCuidadosEnfermagem());
            }
    
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void btnldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnldeleteActionPerformed
        
        int id = Integer.parseInt(txtnomemedicamento1.getText());
        medicamentosDAO dao = new medicamentosDAO();
        dao.excluir(id);
        
        txtnomeMedicamento.setText("");
        txtclasseMedicamento.setText("");
        txtindicacoes.setText("");
        txtviaAdministracao.setText("");
        txtmodouso.setText("");
        txtformaDiluicao.setText("");
        txtcuidadosEnfermagem.setText("");
        
    }//GEN-LAST:event_btnldeleteActionPerformed

    private void txtnomemedicamento1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnomemedicamento1CaretUpdate

    }//GEN-LAST:event_txtnomemedicamento1CaretUpdate

    private void btnlistar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistar1ActionPerformed

    }//GEN-LAST:event_btnlistar1ActionPerformed

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
            java.util.logging.Logger.getLogger(formmedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formmedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formmedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formmedicamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formmedicamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnldelete;
    private javax.swing.JButton btnlistar1;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtclasseMedicamento;
    private javax.swing.JTextField txtcuidadosEnfermagem;
    private javax.swing.JTextField txtformaDiluicao;
    private javax.swing.JTextField txtindicacoes;
    private javax.swing.JTextField txtmodouso;
    private javax.swing.JTextField txtnomeMedicamento;
    private javax.swing.JTextField txtnomemedicamento1;
    private javax.swing.JTextField txtviaAdministracao;
    // End of variables declaration//GEN-END:variables
}
