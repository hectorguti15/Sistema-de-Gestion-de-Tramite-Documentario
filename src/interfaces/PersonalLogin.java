/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Utils.Utils;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxUI;
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
        this.setLocationRelativeTo(this);
        Utils.Setimage(jLabel1, "src/images/logo.png");
        this.repaint();
       
        iniciarSesionAdministrador.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsBold, 0, 24));
        email.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        email1.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        apellido.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        nombre.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        iniciarSesion.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        nAdministrador.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
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
        nAdministrador = new javax.swing.JLabel();
        fieldAdministrador = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        apellidoField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        email1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        iniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iniciarSesionAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nAdministrador.setText("N° trabajador");

        fieldAdministrador.setForeground(new java.awt.Color(102, 102, 102));
        fieldAdministrador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldAdministrador.setToolTipText("Número de administrador");
        fieldAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        fieldAdministrador.setCaretColor(new java.awt.Color(51, 51, 51));
        fieldAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAdministradorActionPerformed(evt);
            }
        });

        nombre.setText("Nombre");

        nombreField.setForeground(new java.awt.Color(51, 51, 51));
        nombreField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        nombreField.setCaretColor(new java.awt.Color(51, 51, 51));
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        apellido.setText("Apellido");

        apellidoField.setForeground(new java.awt.Color(102, 102, 102));
        apellidoField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        apellidoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        apellidoField.setCaretColor(new java.awt.Color(51, 51, 51));
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });

        email.setText("E-mail");

        fieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        fieldEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        email1.setText("¿Eres administrador?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        iniciarSesion.setBackground(new java.awt.Color(255, 102, 0));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(email1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre)
                                    .addComponent(apellido)
                                    .addComponent(email))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nAdministrador)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreField)
                            .addComponent(apellidoField)
                            .addComponent(fieldEmail)
                            .addComponent(fieldAdministrador))))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nAdministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        iniciarSesionAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        iniciarSesionAdministrador.setForeground(new java.awt.Color(255, 102, 0));
        iniciarSesionAdministrador.setText("Iniciar sesión como personal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(iniciarSesionAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarSesionAdministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        try {
            if ("".equals(nombreValue) || "".equals(apellidoValue) || "".equals(nTrabajadorValue) || "".equals(correoElectronicoValue)) {
                throw new IllegalArgumentException("Todos los campos son requeridos");

            }
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
                LandingPersonal main = new LandingPersonal(trabajador);
                main.setVisible(true);
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarSesionActionPerformed

    private void fieldAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAdministradorActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nAdministrador;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
