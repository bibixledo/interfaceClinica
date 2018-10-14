/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

public class Principal_Profissional extends javax.swing.JFrame {

    public Principal_Profissional() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop_profissional = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_sair = new javax.swing.JMenu();
        menu_consulta = new javax.swing.JMenu();
        menu_iniciarConsulta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop_profissional.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout desktop_profissionalLayout = new javax.swing.GroupLayout(desktop_profissional);
        desktop_profissional.setLayout(desktop_profissionalLayout);
        desktop_profissionalLayout.setHorizontalGroup(
            desktop_profissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        desktop_profissionalLayout.setVerticalGroup(
            desktop_profissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_out.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_sair);

        menu_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group.png"))); // NOI18N
        menu_consulta.setText("Consulta");
        menu_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consultaActionPerformed(evt);
            }
        });

        menu_iniciarConsulta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menu_iniciarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group_add.png"))); // NOI18N
        menu_iniciarConsulta.setText("Iniciar Consulta");
        menu_iniciarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iniciarConsultaActionPerformed(evt);
            }
        });
        menu_consulta.add(menu_iniciarConsulta);

        jMenuBar1.add(menu_consulta);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information.png"))); // NOI18N
        jMenu1.setText("Sobre");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_profissional)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_profissional)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* --------- SETANDO J INTERNAL FRAME --------- */
    private void menu_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_consultaActionPerformed

    private void menu_iniciarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iniciarConsultaActionPerformed
        IniciarConsulta telaIniciarConsulta = new IniciarConsulta();
        desktop_profissional.add(telaIniciarConsulta);
        telaIniciarConsulta.setVisible(true);
    }//GEN-LAST:event_menu_iniciarConsultaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        Sobre telaSobre = new Sobre();
        desktop_profissional.add(telaSobre);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        // fazer para fechar a tela do Profissional e abrir a de Login novamente
        /*Login telaLogin = new Login();
        desktop_profissional.add(telaLogin);
        telaLogin.setVisible(true);
        */
    }//GEN-LAST:event_menu_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Profissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Profissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop_profissional;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenuItem menu_iniciarConsulta;
    private javax.swing.JMenu menu_sair;
    // End of variables declaration//GEN-END:variables
}
