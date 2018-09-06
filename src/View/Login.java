/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aluno;
import Model.AlunoJpaDAO;

/**
 *
 * @author Ismae
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtAlunoID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtAlunoSenha = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(null);

        txtAlunoID.setBackground(new java.awt.Color(255, 102, 102));
        txtAlunoID.setBorder(null);
        jPanel4.add(txtAlunoID);
        txtAlunoID.setBounds(30, 170, 280, 20);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(30, 190, 280, 10);

        txtAlunoSenha.setBackground(new java.awt.Color(255, 102, 102));
        txtAlunoSenha.setBorder(null);
        txtAlunoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoSenhaActionPerformed(evt);
            }
        });
        jPanel4.add(txtAlunoSenha);
        txtAlunoSenha.setBounds(30, 216, 280, 14);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(30, 230, 280, 10);

        button1.setBackground(new java.awt.Color(255, 153, 153));
        button1.setLabel("Login");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel4.add(button1);
        button1.setBounds(110, 280, 130, 24);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(70, 110, 340, 410);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(340, 0, 460, 680);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Concurseiro!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 240, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 800, 679);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlunoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlunoSenhaActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Aluno aluno = new Aluno();
        aluno.setId(txtAlunoID.getText());
        aluno.setSenha(txtAlunoSenha.getText());
        
        /**
         * ____Instancia as duas classes de uma vez Oo___
         * ps:eu não sabia que podia fazer isso
         * Logica disso: instancia Aluno e inicializa ele como alunoJpaDAO()
         * sendo assim possivel utilizar metódos tanto de um quanto de outro
         * cara...isso é lindo.
         */
        Aluno alunoDAO = new AlunoJpaDAO().getInstance().getById(aluno.getId());
        System.out.println(alunoDAO.getId());
        //Processo de Autenticacao
        //Só a nivel de funcionamento deixa só o ID mesmo
        //Porém buscar saber por que os dois não funicionam
        //HHH000436
        if(alunoDAO.getId() != null /*&& alunoDAO.getSenha() != null*/ ){
            System.out.println("pronto pra passar para proxima tela");
            
        }else{
            System.out.println("ocorreu algum erro provavelmente de lógica");
        }
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAlunoID;
    private javax.swing.JTextField txtAlunoSenha;
    // End of variables declaration//GEN-END:variables
}
