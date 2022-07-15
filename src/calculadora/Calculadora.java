
package calculadora;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculadora extends javax.swing.JFrame {
    
ScriptEngineManager sem = new ScriptEngineManager(); 
ScriptEngine se= sem.getEngineByName("JavaScript");
    public Calculadora() {
        initComponents();
    }
    public void addNumber(String digito){
txtOperacion.setText(txtOperacion.getText()+digito);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_c = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));

        txtOperacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_c.setBackground(new java.awt.Color(244, 253, 251));
        btn_c.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 45));

        jButton3.setBackground(new java.awt.Color(244, 253, 251));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("CE");
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 45));

        jButton4.setBackground(new java.awt.Color(244, 253, 251));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("%");
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 45));

        jButton5.setBackground(new java.awt.Color(244, 253, 251));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("/");
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 45));

        jButton6.setBackground(new java.awt.Color(244, 253, 251));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("X");
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 50, 45));

        jButton7.setBackground(new java.awt.Color(244, 253, 251));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("-");
        jButton7.setFocusPainted(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 50, 45));

        jButton8.setBackground(new java.awt.Color(244, 253, 251));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("+");
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 45));

        btn_igual.setBackground(new java.awt.Color(244, 253, 251));
        btn_igual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 50, 45));

        jButton10.setBackground(new java.awt.Color(244, 253, 251));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("7");
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 45));

        jButton11.setBackground(new java.awt.Color(244, 253, 251));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("8");
        jButton11.setFocusPainted(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 45));

        jButton12.setBackground(new java.awt.Color(244, 253, 251));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("9");
        jButton12.setFocusPainted(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 45));

        jButton13.setBackground(new java.awt.Color(244, 253, 251));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton13.setText("6");
        jButton13.setFocusPainted(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 45));

        jButton14.setBackground(new java.awt.Color(244, 253, 251));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton14.setText("5");
        jButton14.setFocusPainted(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 45));

        jButton15.setBackground(new java.awt.Color(244, 253, 251));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("4");
        jButton15.setFocusPainted(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 45));

        jButton16.setBackground(new java.awt.Color(244, 253, 251));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("1");
        jButton16.setFocusPainted(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 45));

        jButton17.setBackground(new java.awt.Color(244, 253, 251));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setText("2");
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 45));

        jButton18.setBackground(new java.awt.Color(244, 253, 251));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("3");
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 45));

        jButton19.setBackground(new java.awt.Color(244, 253, 251));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setText("0");
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 45));

        jButton1.setBackground(new java.awt.Color(244, 253, 251));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText(".");
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 45));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_igual.doClick();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addNumber(".");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        addNumber("4");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        addNumber("6");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        addNumber("1");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        addNumber("3");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addNumber("%"); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addNumber("/");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        addNumber("*");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        addNumber("+");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
       try{ 
        String resultado = se.eval(txtOperacion.getText()).toString(); 
        txtResultado.setText(resultado);
       }catch(Exception e){
           //btn_c.doClick();
       }
    }//GEN-LAST:event_btn_igualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
