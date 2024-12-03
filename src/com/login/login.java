/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        imagentext = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iconolog = new javax.swing.JLabel();
        namelogo = new javax.swing.JLabel();
        iniciarsesiontext = new javax.swing.JLabel();
        usuariotext = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usuariofield = new javax.swing.JTextField();
        contraseñatext = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contrafield = new javax.swing.JPasswordField();
        loginB = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        registrotxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setBackground(new java.awt.Color(255, 255, 255));
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logos Servicio Técnico Simple Blanco y Negro (1).png"))); // NOI18N
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 170));

        imagentext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image.png"))); // NOI18N
        jPanel1.add(imagentext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        jPanel3.setBackground(new java.awt.Color(43, 43, 61));

        iconolog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/image (1).png"))); // NOI18N

        namelogo.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        namelogo.setForeground(new java.awt.Color(255, 255, 255));
        namelogo.setText("PARTENGINE");

        iniciarsesiontext.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarsesiontext.setForeground(new java.awt.Color(255, 255, 255));
        iniciarsesiontext.setText("INICIAR SESIÓN");

        usuariotext.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        usuariotext.setForeground(new java.awt.Color(255, 255, 255));
        usuariotext.setText("Usuario");

        usuariofield.setBackground(new java.awt.Color(43, 43, 61));
        usuariofield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuariofield.setForeground(new java.awt.Color(153, 153, 153));
        usuariofield.setText("Ingrese su nombre de usuario");
        usuariofield.setBorder(null);
        usuariofield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariofieldMousePressed(evt);
            }
        });
        usuariofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariofieldActionPerformed(evt);
            }
        });

        contraseñatext.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        contraseñatext.setForeground(new java.awt.Color(255, 255, 255));
        contraseñatext.setText("Contraseña");

        contrafield.setBackground(new java.awt.Color(43, 43, 61));
        contrafield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contrafield.setForeground(new java.awt.Color(153, 153, 153));
        contrafield.setText("jPasswordField1");
        contrafield.setBorder(null);
        contrafield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contrafieldMousePressed(evt);
            }
        });
        contrafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrafieldActionPerformed(evt);
            }
        });

        loginB.setBackground(new java.awt.Color(102, 51, 255));
        loginB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBMouseExited(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("ENTRAR");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBLayout = new javax.swing.GroupLayout(loginB);
        loginB.setLayout(loginBLayout);
        loginBLayout.setHorizontalGroup(
            loginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        loginBLayout.setVerticalGroup(
            loginBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        registrotxt.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        registrotxt.setForeground(new java.awt.Color(153, 153, 153));
        registrotxt.setText("Registrarse");
        registrotxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrotxtMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                registrotxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuariotext)
                            .addComponent(iniciarsesiontext))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(contraseñatext)
                                .addGap(254, 254, 254))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usuariofield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(namelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(contrafield, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(iconolog)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(registrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelogo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconolog, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(iniciarsesiontext)
                .addGap(27, 27, 27)
                .addComponent(usuariotext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariofield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseñatext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrafield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(loginB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrotxt)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariofieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariofieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariofieldActionPerformed

    private void contrafieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrafieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrafieldActionPerformed

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginB.setBackground(new Color(156, 106, 208));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginB.setBackground(new Color(102, 51, 255));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBMouseEntered
        loginB.setBackground(new Color(156, 106, 208));
    }//GEN-LAST:event_loginBMouseEntered

    private void loginBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBMouseExited
        loginB.setBackground(new Color(102, 51, 255));
    }//GEN-LAST:event_loginBMouseExited

    private void usuariofieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariofieldMousePressed
        if (usuariofield.getText().equals("Ingrese su nombre de usuario")){
            usuariofield.setText("");
            usuariofield.setForeground(Color.white);
        }
        if (String.valueOf(contrafield.getPassword()).isEmpty()) {
            contrafield.setText("jPasswordField1");
            contrafield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usuariofieldMousePressed

    private void contrafieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrafieldMousePressed
        if (String.valueOf(contrafield.getPassword()).equals("jPasswordField1")) {
            contrafield.setText("");
            contrafield.setForeground(Color.white);
        }
        if (usuariofield.getText().isEmpty()) {
            usuariofield.setText("Ingrese su nombre de usuario");
            usuariofield.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_contrafieldMousePressed

    private void loginBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBMouseClicked
       
    }//GEN-LAST:event_loginBMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        
        String nombre = usuariofield.getText();
        String contrasena = new String(contrafield.getPassword());

            if (Usuario.iniciarSesion(nombre, contrasena)) {
                menu cambio3 = new menu();
                cambio3.actualizarMensajeBienvenida(nombre);
                cambio3.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void registrotxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrotxtMouseReleased
        
    }//GEN-LAST:event_registrotxtMouseReleased

    private void registrotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrotxtMouseEntered
        registrotxt.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_registrotxtMouseEntered

    private void registrotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrotxtMouseExited
        // [153,153,153]
        registrotxt.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_registrotxtMouseExited

    private void registrotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrotxtMouseClicked
        register cambio1 = new register();
        cambio1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrotxtMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrafield;
    private javax.swing.JLabel contraseñatext;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iconolog;
    private javax.swing.JLabel imagentext;
    private javax.swing.JLabel iniciarsesiontext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginB;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel namelogo;
    private javax.swing.JLabel registrotxt;
    private javax.swing.JTextField usuariofield;
    private javax.swing.JLabel usuariotext;
    // End of variables declaration//GEN-END:variables
}
