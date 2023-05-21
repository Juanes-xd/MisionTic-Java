/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaControlador;

import Modelo.Curso;
import Modelo.Horario;
import Modelo.Instructor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MisionTIC extends javax.swing.JFrame {

    /**
     * Creates new form MisionTIC
     */
    public MisionTIC() {
        initComponents();
        // Pestaña Instructores
        mostrarInstructores();
        
        // Pestaña de Tripulantes
        
        // Pestaña de Cursos
        listarHorarios();
        listarInstructores();
        mostrarCursos();
    }

    private void mostrarInstructores() {
        ArrayList<String> instructores = Instructor.listarInstructores();
        txtListaInstructores.setText("");
        // Recorrer la lista de instructores e ir colocando linea por linea
        String texto = txtListaInstructores.getText();
        for (int i = 0; i < instructores.size(); i++) {
            texto += instructores.get(i) + "\n";
        }
        txtListaInstructores.setText(texto);
    }
    
    private void limpiarPestañaInstructores() {
        txtIdInstructor.setText("");
        txtNombreInstructor.setText("");
        txtApellidoInstructor.setText("");
        txtEmailInstructor.setText("");
    }
    
    private void listarHorarios() {
        ArrayList<String> horarios = Horario.listarHorarios();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(horarios.toArray());
        listaHorariosClase.setModel(modelo);
        listaHorariosClase.setSelectedIndex(-1);
    }
    
    private void listarInstructores() {
        ArrayList<String> instructores = Instructor.listaCortaInstructores();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(instructores.toArray());
        listaInstructoresClase.setModel(modelo);
        listaInstructoresClase.setSelectedIndex(-1);
    }
    
    private void mostrarCursos() {
        ArrayList<String> cursos = Curso.listarCursos();
        txtListaCursos.setText("");
        String texto = "";
        for(String curso: cursos) {
            texto += curso + "\n";
        }
        txtListaCursos.setText(texto);
    }
    
    private void limpiarPestañaCursos() {
        txtNombreClase.setText("");
        listaHorariosClase.setSelectedIndex(-1);
        listaInstructoresClase.setSelectedIndex(-1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreInstructor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoInstructor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmailInstructor = new javax.swing.JTextField();
        btnCrearInstructor = new javax.swing.JButton();
        btnUpdateInstructor = new javax.swing.JButton();
        btnDeleteInstructor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListaInstructores = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtIdInstructor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreClase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        listaHorariosClase = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        listaInstructoresClase = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtListaCursos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setText("Mision TIC 2022");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Email:");

        btnCrearInstructor.setText("Crear Instructor");
        btnCrearInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearInstructorActionPerformed(evt);
            }
        });

        btnUpdateInstructor.setText("Actualizar Instructor");
        btnUpdateInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateInstructorActionPerformed(evt);
            }
        });

        btnDeleteInstructor.setText("Eliminar Instructor");
        btnDeleteInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteInstructorActionPerformed(evt);
            }
        });

        txtListaInstructores.setColumns(20);
        txtListaInstructores.setRows(5);
        jScrollPane1.setViewportView(txtListaInstructores);

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdInstructor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreInstructor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoInstructor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailInstructor, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCrearInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdateInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearInstructor))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateInstructor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteInstructor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Los Instructores", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tripulantes", jPanel2);

        jLabel6.setText("Nombre:");

        jLabel7.setText("Horario:");

        jLabel8.setText("Instructor:");

        jButton1.setText("Crear Curso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtListaCursos.setColumns(20);
        txtListaCursos.setRows(5);
        jScrollPane2.setViewportView(txtListaCursos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreClase)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaHorariosClase, 0, 329, Short.MAX_VALUE)
                            .addComponent(listaInstructoresClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaHorariosClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaInstructoresClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cursos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInstructorActionPerformed
        // TODO add your handling code here:
        // OBTENER INFORMACION DE LA VISTA
        String nombre = txtNombreInstructor.getText();
        String apellido = txtApellidoInstructor.getText();
        String email = txtEmailInstructor.getText();
        if(!nombre.isBlank() && !apellido.isBlank() && !email.isBlank()) {
            // Crear el instructor
            // HACER EL LLAMADO AL MODELO PARA LA LOGICA DEL NEGOCIO
            String resultado = Instructor.crearInstructor(nombre, apellido, email);
            JOptionPane.showMessageDialog(this, resultado);
            mostrarInstructores();
            limpiarPestañaInstructores();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los datos");
        }
    }//GEN-LAST:event_btnCrearInstructorActionPerformed

    private void btnUpdateInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateInstructorActionPerformed
        // TODO add your handling code here:
        try {
            int idInstructor = Integer.parseInt(txtIdInstructor.getText());
            String nombre = txtNombreInstructor.getText();
            String apellido = txtApellidoInstructor.getText();
            String email = txtEmailInstructor.getText();
            if(!nombre.isBlank() && !apellido.isBlank() && !email.isBlank()) {
                String resultado = Instructor.actualizarInstructor(idInstructor, nombre, apellido, email);
                JOptionPane.showMessageDialog(this, resultado);
                mostrarInstructores();
                limpiarPestañaInstructores();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor llene todos los datos");
            }
            
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "el ID del instructor debe ser un numero");
        }
    }//GEN-LAST:event_btnUpdateInstructorActionPerformed

    private void btnDeleteInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteInstructorActionPerformed
        // TODO add your handling code here:
        try {
            int idInstructor = Integer.parseInt(txtIdInstructor.getText());
            String resultado = Instructor.eliminarInstructor(idInstructor);
            JOptionPane.showMessageDialog(this, resultado);
            mostrarInstructores();
            limpiarPestañaInstructores();
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID del instructor debe ser un numero");
        }
    }//GEN-LAST:event_btnDeleteInstructorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombreClase.getText();
        String _horario = listaHorariosClase.getSelectedItem().toString().split(" ")[0].trim();
        int idHorario = Integer.parseInt(_horario);
        String _instructor = listaInstructoresClase.getSelectedItem().toString().split("-")[0].trim();
        int idInstructor = Integer.parseInt(_instructor);
        String resultado = Curso.crearCurso(nombre, idHorario, idInstructor);
        JOptionPane.showMessageDialog(this, resultado);
        mostrarCursos();
        limpiarPestañaCursos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MisionTIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisionTIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisionTIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisionTIC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisionTIC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearInstructor;
    private javax.swing.JButton btnDeleteInstructor;
    private javax.swing.JButton btnUpdateInstructor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> listaHorariosClase;
    private javax.swing.JComboBox<String> listaInstructoresClase;
    private javax.swing.JTextField txtApellidoInstructor;
    private javax.swing.JTextField txtEmailInstructor;
    private javax.swing.JTextField txtIdInstructor;
    private javax.swing.JTextArea txtListaCursos;
    private javax.swing.JTextArea txtListaInstructores;
    private javax.swing.JTextField txtNombreClase;
    private javax.swing.JTextField txtNombreInstructor;
    // End of variables declaration//GEN-END:variables
}
