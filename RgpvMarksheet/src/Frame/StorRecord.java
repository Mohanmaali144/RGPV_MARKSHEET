package Frame;

import datapackage.SaveData;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.red;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import pojopackage.PojoRGPV;

public class StorRecord extends javax.swing.JFrame {

    public StorRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        math_T = new javax.swing.JTextField();
        chemistry_T = new javax.swing.JTextField();
        english_T = new javax.swing.JTextField();
        hindi_T = new javax.swing.JTextField();
        back1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        physics_T = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rgNo_T = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 210, 249));

        jPanel2.setBackground(new java.awt.Color(182, 185, 168));

        jLabel1.setBackground(new java.awt.Color(204, 140, 140));
        jLabel1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STORE STUDENT DATA");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Submit.setBackground(new java.awt.Color(36, 139, 150));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");
        Submit.setFocusPainted(false);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("PHYSICS                             :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("CHEMISTRY                        :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("ENGLISH                                :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("HINDI                                     :");

        math_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math_TActionPerformed(evt);
            }
        });
        math_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                math_TKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math_TKeyTyped(evt);
            }
        });

        chemistry_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemistry_TActionPerformed(evt);
            }
        });
        chemistry_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chemistry_TKeyReleased(evt);
            }
        });

        english_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                english_TActionPerformed(evt);
            }
        });
        english_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                english_TKeyReleased(evt);
            }
        });

        hindi_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hindi_TActionPerformed(evt);
            }
        });
        hindi_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hindi_TKeyReleased(evt);
            }
        });

        back1.setBackground(new java.awt.Color(36, 139, 150));
        back1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("Back");
        back1.setFocusPainted(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("MATH                                 : ");

        physics_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physics_TActionPerformed(evt);
            }
        });
        physics_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                physics_TKeyReleased(evt);
            }
        });

        message.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(51, 204, 0));

        warning.setBackground(new java.awt.Color(255, 0, 0));
        warning.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Registration no                     :");

        rgNo_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgNo_TActionPerformed(evt);
            }
        });
        rgNo_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rgNo_TKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chemistry_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(math_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(physics_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hindi_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(english_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(rgNo_T, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(english_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chemistry_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(math_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hindi_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rgNo_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(physics_T, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        PojoRGPV pjt[] = new PojoRGPV[100];
        // int rgNo = Integer.parseInt(rgNo_T.getText());//

        if (chemistry_T.getText().isEmpty()
                || physics_T.getText().isEmpty()
                || math_T.getText().isEmpty()
                || hindi_T.getText().isEmpty() || rgNo_T.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Fil all the details");
        } else try {
            int rgNo = Integer.parseInt(rgNo_T.getText());//
            if (new SaveData().checkRegistration(rgNo)) {
                JOptionPane.showMessageDialog(null, "Registration number invalid ");
            } else if (new SaveData().rollCheck(rgNo)) {

                JOptionPane.showMessageDialog(null, "allready have details");

            } else {
                try {

                    int chemistry = Integer.parseInt(chemistry_T.getText());
                    int physics = Integer.parseInt(physics_T.getText());
                    int math = Integer.parseInt(math_T.getText());
                    int english = Integer.parseInt(english_T.getText());
//                    int age = Integer.parseInt(age_T.getText());
                    int hindi = Integer.parseInt(hindi_T.getText());
                    //int roll = Integer.parseInt(roll_T.getText());
                    if (physics < 0 || chemistry < 0 || math < 0 || hindi < 0 || english < 0 || physics > 100 || chemistry > 100 || math > 100 || hindi > 100 || english > 100) {
                        JOptionPane.showMessageDialog(null, "invalid mark");
                        message.setText("invalid mark");
                    } else {
                        int total = chemistry + physics + math + hindi + english;
                        double per = total / 5;

                        int n = 1;      //firstname, lastname, fname, mname,
                        pjt[1] = new PojoRGPV(physics, chemistry, math, hindi, english, total, per, rgNo);
                        try {
                            SaveData.saveData(pjt, n);

                            message.setForeground(Color.green);
                            message.setText("Submit success");
                            JOptionPane.showMessageDialog(null, "Data saved succesfully");
                        } catch (ClassNotFoundException | SQLException e) {
                            message.setForeground(Color.red);
                            message.setText("submit Faild");

                            System.out.println(e);
                        }
                    }

                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(null, "invalid Details");
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StorRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void math_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math_TActionPerformed


    }//GEN-LAST:event_math_TActionPerformed

    private void chemistry_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemistry_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chemistry_TActionPerformed

    private void english_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_english_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_english_TActionPerformed

    private void hindi_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hindi_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hindi_TActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed

        new AdminOp().setVisible(true);
        dispose();
    }//GEN-LAST:event_back1ActionPerformed

    private void physics_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physics_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physics_TActionPerformed

    private void chemistry_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chemistry_TKeyReleased

        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            warning.setText("invalid mark !!");
            chemistry_T.setBorder(javax.swing.BorderFactory.createLineBorder(red));
        } else {
            warning.setText(" ");
            chemistry_T.setBorder(javax.swing.BorderFactory.createLineBorder(black));
        }
    }//GEN-LAST:event_chemistry_TKeyReleased

    private void math_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math_TKeyReleased

        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            warning.setText("invalid mark !!");
            math_T.setBorder(javax.swing.BorderFactory.createLineBorder(red));
        } else {
            warning.setText(" ");
            math_T.setBorder(javax.swing.BorderFactory.createLineBorder(black));
        }
    }//GEN-LAST:event_math_TKeyReleased

    private void physics_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_physics_TKeyReleased

        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            warning.setText("invalid mark !!");
            physics_T.setBorder(javax.swing.BorderFactory.createLineBorder(red));
        } else {
            warning.setText(" ");
            physics_T.setBorder(javax.swing.BorderFactory.createLineBorder(black));
        }
    }//GEN-LAST:event_physics_TKeyReleased

    private void english_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_english_TKeyReleased

        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            warning.setText("invalid mark !!");
            english_T.setBorder(javax.swing.BorderFactory.createLineBorder(red));
        } else {
            warning.setText(" ");
            english_T.setBorder(javax.swing.BorderFactory.createLineBorder(black));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_english_TKeyReleased

    private void hindi_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hindi_TKeyReleased
        // TODO add your handling code here:

        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            warning.setText("invalid mark !!");
            hindi_T.setBorder(javax.swing.BorderFactory.createLineBorder(red));
        } else {
            warning.setText(" ");
            hindi_T.setBorder(javax.swing.BorderFactory.createLineBorder(black));
        }
    }//GEN-LAST:event_hindi_TKeyReleased

    private void rgNo_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgNo_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgNo_TActionPerformed

    private void rgNo_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgNo_TKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rgNo_TKeyReleased

    private void math_TKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math_TKeyTyped


    }//GEN-LAST:event_math_TKeyTyped

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
            java.util.logging.Logger.getLogger(StorRecord.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorRecord.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorRecord.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorRecord.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton back1;
    private javax.swing.JTextField chemistry_T;
    private javax.swing.JTextField english_T;
    private javax.swing.JTextField hindi_T;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField math_T;
    private javax.swing.JLabel message;
    private javax.swing.JTextField physics_T;
    private javax.swing.JTextField rgNo_T;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
