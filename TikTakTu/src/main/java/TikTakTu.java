import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class TikTakTu extends javax.swing.JFrame {
    int nilai, nilaiX, nilaiO;
    /**
     * Creates new form TikTakTu
     */
    public TikTakTu() {
        initComponents();
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;
        
    }
    
    void pemenang() {
        if ("X".equals(btn1.getText()) && "X".equals(btn2.getText()) && "X".equals(btn3.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn4.getText()) && "X".equals(btn5.getText()) && "X".equals(btn6.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn7.getText()) && "X".equals(btn8.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn1.getText()) && "X".equals(btn5.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn3.getText()) && "X".equals(btn5.getText()) && "X".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn1.getText()) && "X".equals(btn4.getText()) && "X".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn2.getText()) && "X".equals(btn5.getText()) && "X".equals(btn8.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if ("X".equals(btn3.getText()) && "X".equals(btn6.getText()) && "X".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }

        if ("O".equals(btn1.getText()) && "O".equals(btn2.getText()) && "O".equals(btn3.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn4.getText()) && "O".equals(btn5.getText()) && "O".equals(btn6.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn7.getText()) && "O".equals(btn8.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn1.getText()) && "O".equals(btn5.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn3.getText()) && "O".equals(btn5.getText()) && "O".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn1.getText()) && "O".equals(btn4.getText()) && "O".equals(btn7.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn2.getText()) && "O".equals(btn5.getText()) && "O".equals(btn8.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if ("O".equals(btn3.getText()) && "O".equals(btn6.getText()) && "O".equals(btn9.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
    }
    
    void reset() {
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;

        lblX.setText("0 kali");
        lblO.setText("0 kali");

        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        lblO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lblX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblX.setText("0 Kali");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Main!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblO.setText("0 Kali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblX)
                            .addComponent(lblO))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addGap(94, 94, 94))
        );

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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn1.setText("X");
            btn1.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn1.setText("O");
            btn1.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn2.setText("X");
            btn2.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn2.setText("O");
            btn2.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn3.setText("X");
            btn3.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn3.setText("O");
            btn3.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn4.setText("X");
            btn4.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn4.setText("O");
            btn4.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn5.setText("X");
            btn5.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn5.setText("O");
            btn5.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn6.setText("X");
            btn6.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn6.setText("O");
            btn6.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn7.setText("X");
            btn7.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn7.setText("O");
            btn7.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn8.setText("X");
            btn8.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn8.setText("O");
            btn8.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if (nilai == 1) {
            btn9.setText("X");
            btn9.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            lblX.setText(String.valueOf(nilaiX + " klik"));
            pemenang();
        } else {
            btn9.setText("O");
            btn9.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            lblO.setText(String.valueOf(nilaiO + " klik"));
            pemenang();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:r
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TikTakTu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TikTakTu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
