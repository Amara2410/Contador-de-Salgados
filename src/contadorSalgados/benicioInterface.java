/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contadorSalgados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
/**
 *
 * @author yaras
 */
public class benicioInterface extends javax.swing.JFrame {

    private int coxinha;
    
    public benicioInterface() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPastel = new javax.swing.JButton();
        btnCoxinha = new javax.swing.JButton();
        btnKibe = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnmenoskibe = new javax.swing.JButton();
        btnmenoscoxinha = new javax.swing.JButton();
        btnmenospastel = new javax.swing.JButton();
        quantidadePastel = new javax.swing.JLabel();
        quantidadeCoxinha = new javax.swing.JLabel();
        quantidadeKibe = new javax.swing.JLabel();
        btnLucro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        valorLucro = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contador de Salgados");

        btnPastel.setIcon(new javax.swing.ImageIcon("C:\\Users\\yaras\\OneDrive\\Área de Trabalho\\Java\\Pastel 2.png")); // NOI18N
        btnPastel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R$5.00", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        btnPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelActionPerformed(evt);
            }
        });

        btnCoxinha.setIcon(new javax.swing.ImageIcon("C:\\Users\\yaras\\OneDrive\\Área de Trabalho\\Java\\coxinha.png")); // NOI18N
        btnCoxinha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R$5.00", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        btnCoxinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoxinhaActionPerformed(evt);
            }
        });

        btnKibe.setIcon(new javax.swing.ImageIcon("C:\\Users\\yaras\\OneDrive\\Área de Trabalho\\Java\\Kibe.png")); // NOI18N
        btnKibe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R$6.00", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        btnKibe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKibeActionPerformed(evt);
            }
        });

        btnexit.setText("Sair");
        btnexit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 51)));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnmenoskibe.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        btnmenoskibe.setText("-");
        btnmenoskibe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnmenoskibe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenoskibeActionPerformed(evt);
            }
        });

        btnmenoscoxinha.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        btnmenoscoxinha.setText("-");
        btnmenoscoxinha.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnmenoscoxinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenoscoxinhaActionPerformed(evt);
            }
        });

        btnmenospastel.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        btnmenospastel.setText("-");
        btnmenospastel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnmenospastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenospastelActionPerformed(evt);
            }
        });

        quantidadePastel.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        quantidadePastel.setForeground(new java.awt.Color(255, 153, 0));
        quantidadePastel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadePastel.setText("0");

        quantidadeCoxinha.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        quantidadeCoxinha.setForeground(new java.awt.Color(255, 153, 0));
        quantidadeCoxinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeCoxinha.setText("0");
        quantidadeCoxinha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                quantidadeCoxinhaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        quantidadeKibe.setFont(new java.awt.Font("Impact", 1, 18)); // NOI18N
        quantidadeKibe.setForeground(new java.awt.Color(255, 153, 0));
        quantidadeKibe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeKibe.setText("0");

        btnLucro.setText("LUCRO");
        btnLucro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLucroActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        valorLucro.setText("   00.00");
        valorLucro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(valorLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(valorLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnKibe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addComponent(btnmenospastel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnmenoskibe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnmenoscoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quantidadeKibe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantidadeCoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantidadePastel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnexit))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmenoscoxinha)
                            .addComponent(quantidadeCoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCoxinha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(btnKibe, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnLucro)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnmenoskibe)
                                    .addComponent(quantidadeKibe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmenospastel)
                            .addComponent(quantidadePastel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Salgados salgado = new Salgados(0,0,0);
    private void btnKibeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKibeActionPerformed
        salgado.adicionarKibe();
        quantidadeKibe.setText(Integer.toString(salgado.getKibe()));
    }//GEN-LAST:event_btnKibeActionPerformed

    private void btnmenoskibeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenoskibeActionPerformed
        salgado.removerKibe();
        quantidadeKibe.setText(Integer.toString(salgado.getKibe()));
    }//GEN-LAST:event_btnmenoskibeActionPerformed

    private void btnmenoscoxinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenoscoxinhaActionPerformed
       salgado.removerCoxinha();
       quantidadeCoxinha.setText(Integer.toString(salgado.getCoxinha()));
    }//GEN-LAST:event_btnmenoscoxinhaActionPerformed

    private void btnmenospastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenospastelActionPerformed
       salgado.removerPastel();
       quantidadePastel.setText(Integer.toString(salgado.getKibe()));
    }//GEN-LAST:event_btnmenospastelActionPerformed

    private void btnCoxinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoxinhaActionPerformed
        salgado.adicionarCoxinha();
        quantidadeCoxinha.setText(Integer.toString(salgado.getCoxinha()));
           
    }//GEN-LAST:event_btnCoxinhaActionPerformed

    private void btnPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelActionPerformed
        salgado.adicionarPastel();
        quantidadePastel.setText(Integer.toString(salgado.getPastel()));
    }//GEN-LAST:event_btnPastelActionPerformed

    private void quantidadeCoxinhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_quantidadeCoxinhaAncestorAdded
        // TODO add your handling code here
    }//GEN-LAST:event_quantidadeCoxinhaAncestorAdded

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLucroActionPerformed
       valorLucro.setText(Double.toString(salgado.calcularTotal()));
    }//GEN-LAST:event_btnLucroActionPerformed

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
            java.util.logging.Logger.getLogger(benicioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(benicioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(benicioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(benicioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new benicioInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoxinha;
    private javax.swing.JButton btnKibe;
    private javax.swing.JButton btnLucro;
    private javax.swing.JButton btnPastel;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnmenoscoxinha;
    private javax.swing.JButton btnmenoskibe;
    private javax.swing.JButton btnmenospastel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quantidadeCoxinha;
    private javax.swing.JLabel quantidadeKibe;
    private javax.swing.JLabel quantidadePastel;
    private javax.swing.JLabel valorLucro;
    // End of variables declaration//GEN-END:variables

    private JLabel IntegertoString(int coxinha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
