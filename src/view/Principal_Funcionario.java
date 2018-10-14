package view;

public class Principal_Funcionario extends javax.swing.JFrame {

    public Principal_Funcionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop_funcionario = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_sair = new javax.swing.JMenu();
        menu_paciente = new javax.swing.JMenu();
        menu_cadastrarPaciente = new javax.swing.JMenuItem();
        menu_editarPaciente = new javax.swing.JMenuItem();
        menu_consulta = new javax.swing.JMenu();
        menu_agendarPaciente = new javax.swing.JMenuItem();
        menu_editarConsulta = new javax.swing.JMenuItem();
        menu_sobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop_funcionario.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout desktop_funcionarioLayout = new javax.swing.GroupLayout(desktop_funcionario);
        desktop_funcionario.setLayout(desktop_funcionarioLayout);
        desktop_funcionarioLayout.setHorizontalGroup(
            desktop_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        desktop_funcionarioLayout.setVerticalGroup(
            desktop_funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_out.png"))); // NOI18N
        menu_sair.setText("Sair");
        jMenuBar1.add(menu_sair);

        menu_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        menu_paciente.setText("Pacientes");

        menu_cadastrarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menu_cadastrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_add.png"))); // NOI18N
        menu_cadastrarPaciente.setText("Cadastrar");
        menu_cadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarPacienteActionPerformed(evt);
            }
        });
        menu_paciente.add(menu_cadastrarPaciente);

        menu_editarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menu_editarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_edit.png"))); // NOI18N
        menu_editarPaciente.setText("Editar/Pesquisar");
        menu_editarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarPacienteActionPerformed(evt);
            }
        });
        menu_paciente.add(menu_editarPaciente);

        jMenuBar1.add(menu_paciente);

        menu_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group.png"))); // NOI18N
        menu_consulta.setText("Consultas");

        menu_agendarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menu_agendarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group_add.png"))); // NOI18N
        menu_agendarPaciente.setText("Agendar Paciente");
        menu_agendarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agendarPacienteActionPerformed(evt);
            }
        });
        menu_consulta.add(menu_agendarPaciente);

        menu_editarConsulta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        menu_editarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_edit.png"))); // NOI18N
        menu_editarConsulta.setText("Alterar Consulta");
        menu_editarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_editarConsultaActionPerformed(evt);
            }
        });
        menu_consulta.add(menu_editarConsulta);

        jMenuBar1.add(menu_consulta);

        menu_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/information.png"))); // NOI18N
        menu_sobre.setText("Sobre");
        menu_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_funcionario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_funcionario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* --------- SETANDO J INTERNAL FRAME --------- */
    private void menu_editarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarPacienteActionPerformed
        EditarPaciente telaEditarPaciente = new EditarPaciente();
        desktop_funcionario.add(telaEditarPaciente);
        telaEditarPaciente.setVisible(true);
    }//GEN-LAST:event_menu_editarPacienteActionPerformed

    private void menu_cadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarPacienteActionPerformed
    
        CadastrarPaciente telaCadastrarPaciente = new CadastrarPaciente();
        desktop_funcionario.add(telaCadastrarPaciente);
        telaCadastrarPaciente.setVisible(true);
        
    }//GEN-LAST:event_menu_cadastrarPacienteActionPerformed
    private void menu_agendarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agendarPacienteActionPerformed
        AgendarPaciente telaAgendarPaciente = new AgendarPaciente();
        desktop_funcionario.add(telaAgendarPaciente);
        telaAgendarPaciente.setVisible(true);
    }//GEN-LAST:event_menu_agendarPacienteActionPerformed

    private void menu_editarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_editarConsultaActionPerformed
        AlterarConsulta telaAlterarConsulta = new AlterarConsulta();
        desktop_funcionario.add(telaAlterarConsulta);
        telaAlterarConsulta.setVisible(true);
    }//GEN-LAST:event_menu_editarConsultaActionPerformed

    private void menu_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobreActionPerformed
        Sobre telaSobre = new Sobre();
        desktop_funcionario.add(telaSobre);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_menu_sobreActionPerformed
    /* --------- FIM DO SETANDO J INTERNAL FRAME --------- */
    
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
            java.util.logging.Logger.getLogger(Principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop_funcionario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_agendarPaciente;
    private javax.swing.JMenuItem menu_cadastrarPaciente;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenuItem menu_editarConsulta;
    private javax.swing.JMenuItem menu_editarPaciente;
    private javax.swing.JMenu menu_paciente;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenu menu_sobre;
    // End of variables declaration//GEN-END:variables
}
