/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Enums.TipoDependencia;
import Enums.TipoEstado;
import Enums.TipoExpediente;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelos.Expediente;

/**
 *
 * @author hecto
 */
public class ExpedienteAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form ExpedienteAdministrador
     */
    public ExpedienteAdministrador() {
        initComponents();
        addExpediente();
        addExpedientesAsignar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        expedientesAsignarTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTodosExpedientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        expedientesAsignarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User", "Tipo expediente", "Prioridad", "Tiempo inicio"
            }
        ));
        jScrollPane1.setViewportView(expedientesAsignarTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Expedientes por asignar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Todos los expedientes");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableTodosExpedientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User", "Tipo expediente", "Prioridad", "Estado", "Área", "Tiempo inicio"
            }
        ));
        jScrollPane3.setViewportView(tableTodosExpedientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addExpediente() {
        Expediente[] expedientes = Servicio.ExpedientesServicios.getExpedientes();
     
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"N° expediente", "User", "Tipo expediente ", "Prioridad", "Área actual", "Estado", "Tiempo inicio"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableTodosExpedientes.setModel(model);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < expedientes.length; i++) {
            if (expedientes[i] != null) {
                System.out.println(expedientes[i].getNumeroExpediente() + TipoExpediente.fromEnumToString(expedientes[i].getTipoExpediente()));
                LocalDateTime fechaInicial = expedientes[i].getTiempoExpediente().getFechaInicial();
                Date fechaInicialDate = Date.from(fechaInicial.atZone(ZoneId.systemDefault()).toInstant());

                model.addRow(new Object[]{
                    expedientes[i].getNumeroExpediente(),
                    expedientes[i].getUser().getNombre(),
                    TipoExpediente.fromEnumToString(expedientes[i].getTipoExpediente()),
                    expedientes[i].getPrioridad(),
                    TipoDependencia.fromEnumToString(expedientes[i].getTipoDependencia()),
                    TipoEstado.fromEnumToString(expedientes[i].getEstado()),
                    dateFormat.format(fechaInicialDate)
                });
            } else {
                System.out.println("Expediente en posición " + i + " es null.");
            }
        }

        tableTodosExpedientes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tableTodosExpedientes.rowAtPoint(evt.getPoint());
                int column = tableTodosExpedientes.columnAtPoint(evt.getPoint());
                if (row >= 0 && column >= 0) {
                    ExpedienteInfo expedienteUser = new ExpedienteInfo(expedientes[row]);
                    expedienteUser.setVisible(true);

                }
            }
        });
    }

    private void addExpedientesAsignar() {
        Expediente[] expedientes = Servicio.ExpedientesServicios.getExpedientesAsignar();
        
        
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"User", "Tipo expediente ", "Prioridad", "Tiempo inicio"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        expedientesAsignarTable.setModel(model);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < expedientes.length; i++) {
            if (expedientes[i] != null) {
                System.out.println(expedientes[i].getNumeroExpediente() + TipoExpediente.fromEnumToString(expedientes[i].getTipoExpediente()));
                LocalDateTime fechaInicial = expedientes[i].getTiempoExpediente().getFechaInicial();
                Date fechaInicialDate = Date.from(fechaInicial.atZone(ZoneId.systemDefault()).toInstant());

                model.addRow(new Object[]{
                    expedientes[i].getUser().getNombre(),
                    TipoExpediente.fromEnumToString(expedientes[i].getTipoExpediente()),
                    expedientes[i].getPrioridad(),
                    dateFormat.format(fechaInicialDate)
                });
            } else {
                System.out.println("Expediente en posición " + i + " es null.");
            }
        }

        expedientesAsignarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = expedientesAsignarTable.rowAtPoint(evt.getPoint());
                int column = expedientesAsignarTable.columnAtPoint(evt.getPoint());
                if (row >= 0 && column >= 0) {
                    ExpedienteInfo expedienteUser = new ExpedienteInfo(expedientes[row]);
                    expedienteUser.setVisible(true);

                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(ExpedienteAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpedienteAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpedienteAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpedienteAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpedienteAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable expedientesAsignarTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableTodosExpedientes;
    // End of variables declaration//GEN-END:variables
}
