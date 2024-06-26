/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Utils.Utils;
import javax.swing.JOptionPane;
import modelos.PersonaDependencia;

/**
 *
 * @author hecto
 */
public class PersonalLogin extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public PersonalLogin() {
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

        iniciarSesionAdministrador = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        fieldAdministrador = new javax.swing.JTextField();
        nAdministrador = new javax.swing.JLabel();
        apellidoField = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        iniciarSesion = new javax.swing.JButton();
        email1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarSesionAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        iniciarSesionAdministrador.setForeground(new java.awt.Color(102, 102, 102));
        iniciarSesionAdministrador.setText("Iniciar sesión como personal");

        nombre.setText("Nombre");

        fieldAdministrador.setForeground(new java.awt.Color(102, 102, 102));
        fieldAdministrador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldAdministrador.setToolTipText("Número de administrador");
        fieldAdministrador.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 15));
        fieldAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAdministradorActionPerformed(evt);
            }
        });

        nAdministrador.setText("N° trabajdor");

        apellidoField.setForeground(new java.awt.Color(102, 102, 102));
        apellidoField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        apellidoField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 15));
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        apellido.setText("Apellido");

        nombreField.setForeground(new java.awt.Color(102, 102, 102));
        nombreField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 15));
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        email.setText("E-mail");

        fieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        fieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 15));
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        iniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        iniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.setText("Iniciar sesión");
        iniciarSesion.setBorder(null);
        iniciarSesion.setBorderPainted(false);
        iniciarSesion.setFocusPainted(false);
        iniciarSesion.setFocusable(false);
        iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionActionPerformed(evt);
            }
        });

        email1.setText("¿Eres administrador?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBox1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iniciarSesionAdministrador)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nAdministrador)
                                .addGap(18, 18, 18)
                                .addComponent(fieldAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iniciarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(iniciarSesionAdministrador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nAdministrador))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionActionPerformed
        String nombreValue = nombreField.getText();
        String apellidoValue = apellidoField.getText();
        String nTrabajadorValue = fieldAdministrador.getText();
        String correoElectronicoValue = fieldEmail.getText();

        if ("".equals(nombreValue) || "".equals(apellidoValue) || "".equals(nTrabajadorValue) || "".equals(correoElectronicoValue)) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            if (!Utils.esEmailValido(correoElectronicoValue)) {
                System.out.println("Error lanzado");
                throw new IllegalArgumentException("Correo electrónico no válido");
            }

            if ("Si".equals((String) jComboBox1.getSelectedItem())) {
                //Verificar match entre codigo de administrador y correoElectornico
                //correto: "mlopez@gmail.com" "EDF173KZ"
                if (!Servicio.AdministradorServicio.administrador.esAdministrador(correoElectronicoValue, nTrabajadorValue)) {

                    throw new IllegalArgumentException("Este ingreso es solo para administradores");
                }
                dispose();
                ExpedienteAdministrador administradorPage = new ExpedienteAdministrador();
                administradorPage.setVisible(true);
            } else {
                PersonaDependencia trabajador = null;

                for (PersonaDependencia personalDependencia : Servicio.AdministradorServicio.administrador.getPersonalDependencia()) {
                    System.out.println(personalDependencia.getNombre() + personalDependencia.getNumeroTrabajador());
                    System.out.println("EMAIL: " + correoElectronicoValue + "  ID: " + nTrabajadorValue);
                    if (correoElectronicoValue.equals(personalDependencia.getCorreoElectronico()) && nTrabajadorValue.equals(personalDependencia.getNumeroTrabajador())) {
                        System.out.println("TRUEEE");
                        trabajador = personalDependencia;
                    }
                }
                if (trabajador == null) {
                    throw new IllegalArgumentException("Este ingreso es solo para trabajadores");
                }
                
                //Añadir logica para personal de dependencia
                dispose();
                System.out.println("PERSONAL MAIN");
                PersonalMain personalMain = new PersonalMain(trabajador);
                personalMain.setVisible(true);
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void fieldAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField fieldAdministrador;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JLabel iniciarSesionAdministrador;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel nAdministrador;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
