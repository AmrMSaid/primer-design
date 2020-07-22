package primerdesign_b025;

import com.sun.xml.internal.ws.util.StringUtils;

/*
Random sequences for testing:
DNA:
ATTACCTTTTTTAGGATCAGCCCTAACCCCTTCTTTCTAGTCCCCTTTTTCCTTTTTATTCAGGCTATCCCCTTTAAAATTTTCTGACCTCTTCTTTTATAATTTAAAATTCTAGTTCTAACAAAACCCCCTCCTTAATCCTTTTTTTAAATTTTTTTTTTCCTAATTTATTGATTTAGTGTTGTTTTTTTTTTTTTCCATGTTTCAATCTTTCCTCTGATCCTATTTTATAGCATGCACAAAACAAAAATTTAAAATCATCTTTTTCTTTTTTCCTTCCCCTTAGTTAGTGTGTCTGTATTTAAGAGAGATGACGCTCTCTCTATCAACCCTCCTCCCCCACTCTCTATCACCCCACCTATTACAGAAGTGTCGCCGTAAATATTTACTTCTAGTTTCTTGTGTTTAATAATTTATAAGATGGACCAAGTATTTAGGATTGGTTTACTGATGGTGTTATTTCATGGCTGATTATTTCAGTGAAGGAGTAGTGATGT
RNA:
AUUACAACACCAUUAUCCCAUAUGACGCCUCACUUCUCUGGUGAGAAGAGUGUAGUCCUGUAAGUUUACAUAUGUGGAUGCGUCGCUUUAGAUGCUCUCGGACCGGCCCCGCUGCACCAGGCCUAGCAUCCACCAGGUUACUGACUACCCCUAGUGUCUGAAAAUACUCCUAUUUAUGGGACCAUCAACCCUGGAGAUAUUUAAUGGCAAGACUCAUAUGUAAUACCGGCUGAUCCUAUGGUCUAGCAAGGAGCACAUAGUUGCUCACAGAGGCAUCUCUAAUUAUUGCAGCAUAGCGGCAAAACUAACUGGGUACGAGAAACGUUCUCGGUUACGCAGUCAACUGAACACCGGAAGUCUCAAUGUGCCUACACAUCAGGCUGGGAUCAUCCACAACGCACAAAUUAUCACGCUCAUAAUAGAGGGUUUCUGGAGAGAAAGAGGUAGCACGAUCAUAGCUGGUACUCCGAGGACUUGCCAGACUUUUUCAUCAUAUU
 */
public class Main extends javax.swing.JFrame {

    DNA dna;

    public Main() {
        initComponents();

        minSizeTxt.setText(String.valueOf(PrimerSetting.minSize));
        optSizeTxt.setText(String.valueOf(PrimerSetting.OPTIMAL_SIZE));
        maxSizeTxt.setText(String.valueOf(PrimerSetting.maxSize));
        minTmTxt.setText(String.valueOf(PrimerSetting.minTemperature));
        optTmTxt.setText(String.valueOf(PrimerSetting.OPTIMAL_TEMPERATURE));
        maxTmTxt.setText(String.valueOf(PrimerSetting.maxTemperature));
        minCGTxt.setText(String.valueOf(PrimerSetting.minCG));
        optCGTxt.setText(String.valueOf(PrimerSetting.optimalCG));
        maxCGTxt.setText(String.valueOf(PrimerSetting.maxCG));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DNAInputTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        DNAOutputTxt = new javax.swing.JTextArea();
        minSizeTxt = new javax.swing.JTextField();
        minTmTxt = new javax.swing.JTextField();
        optTmTxt = new javax.swing.JTextField();
        maxTmTxt = new javax.swing.JTextField();
        maxCGTxt = new javax.swing.JTextField();
        optCGTxt = new javax.swing.JTextField();
        minCGTxt = new javax.swing.JTextField();
        maxSizeTxt = new javax.swing.JTextField();
        optSizeTxt = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        enterBtn = new javax.swing.JButton();
        generatePrimersBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        startIndexTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        endIndexTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Enter a sequence of DNA or RNA.");

        jLabel2.setText("Identify the start and the end of the gene on the DNA sequence below.");

        jLabel3.setText("Primer Settings");

        jLabel4.setText("Optimal");

        jLabel5.setText("Min");

        jLabel6.setText("Max");

        jLabel7.setText("Size");

        jLabel8.setText("Tm");

        jLabel9.setText("CG");

        DNAInputTxt.setColumns(20);
        DNAInputTxt.setRows(5);
        jScrollPane1.setViewportView(DNAInputTxt);

        DNAOutputTxt.setColumns(20);
        DNAOutputTxt.setRows(5);
        jScrollPane3.setViewportView(DNAOutputTxt);

        minSizeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSizeTxtActionPerformed(evt);
            }
        });

        minTmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minTmTxtActionPerformed(evt);
            }
        });

        optTmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTmTxtActionPerformed(evt);
            }
        });

        maxTmTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxTmTxtActionPerformed(evt);
            }
        });

        maxCGTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxCGTxtActionPerformed(evt);
            }
        });

        optCGTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCGTxtActionPerformed(evt);
            }
        });

        minCGTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minCGTxtActionPerformed(evt);
            }
        });

        maxSizeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSizeTxtActionPerformed(evt);
            }
        });

        optSizeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSizeTxtActionPerformed(evt);
            }
        });

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        generatePrimersBtn.setText("Generate Primers");
        generatePrimersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePrimersBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Start Index");

        startIndexTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startIndexTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("End Index");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(generatePrimersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(minCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(22, 22, 22)
                                                        .addComponent(optCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(minTmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(minSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(22, 22, 22)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(optSizeTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(optTmTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(28, 28, 28))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(54, 54, 54)
                                                    .addComponent(jLabel4)
                                                    .addGap(24, 24, 24))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(90, 90, 90))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(maxCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maxSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maxTmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(endIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterBtn)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(minSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(maxTmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optTmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minTmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(minCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(generatePrimersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minSizeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSizeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSizeTxtActionPerformed

    private void minTmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minTmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minTmTxtActionPerformed

    private void optTmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optTmTxtActionPerformed

    private void maxTmTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxTmTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxTmTxtActionPerformed

    private void maxCGTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxCGTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxCGTxtActionPerformed

    private void optCGTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCGTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optCGTxtActionPerformed

    private void minCGTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minCGTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minCGTxtActionPerformed

    private void maxSizeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSizeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSizeTxtActionPerformed

    private void optSizeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSizeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optSizeTxtActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        if (DNAInputTxt.getText().indexOf('U') != -1) {
            RNA rna = new RNA(DNAInputTxt.getText());
            dna = rna.convertToDNA();
            DNAOutputTxt.setText(dna.getSequence());
        } else {
            dna = new DNA(DNAInputTxt.getText());
            DNAOutputTxt.setText(dna.getSequence());
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void generatePrimersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePrimersBtnActionPerformed

//        System.out.println(11 / 5);
//
//        System.out.println(11.0 / 5.0);
//
//        if (10.0 / 5.0 == 2) {
//            System.out.println("i:---------yes");
//        } else {
//            System.out.println("i:---------no");
//
//        }
        PrimerSetting.minSize = Integer.parseInt(minSizeTxt.getText());
        PrimerSetting.maxSize = Integer.parseInt(maxSizeTxt.getText());
        PrimerSetting.minTemperature = Integer.parseInt(minTmTxt.getText());
        PrimerSetting.maxTemperature = Integer.parseInt(maxTmTxt.getText());
        PrimerSetting.minCG = Double.parseDouble(minCGTxt.getText());
        PrimerSetting.optimalCG = Double.parseDouble(optCGTxt.getText());
        PrimerSetting.maxCG = Double.parseDouble(maxCGTxt.getText());

        int minSize = Integer.parseInt(minSizeTxt.getText());
        int maxSize = Integer.parseInt(maxSizeTxt.getText());
        int startIndex = Integer.parseInt(startIndexTxt.getText());
//        int endIndex = Integer.parseInt(endIndexTxt.getText());

        double CGcount;

//        for (int i = endIndex; i < DNAOutputTxt.getText().length(); i++) {
//            
//        }
        for (int i = 0; i < startIndex - minSize; i++) {
            //System.out.println("i:----------------" + i);
            for (int j = i + minSize; j < i + maxSize + 1; j++) {
                if (j > startIndex) {
                    break;
                }
                String primer = DNAOutputTxt.getText().substring(i, j);
                double primerLength = primer.length();               
                double cCount = primerLength - primer.replace("C", "").length();
                double gCount = primerLength - primer.replace("G", "").length();
                double aCount = primerLength - primer.replace("A", "").length();
                double tCount = primerLength - primer.replace("T", "").length();
                CGcount = cCount + gCount;
                double cgContent = CGcount / primerLength;

                double tm = (4 * (gCount + cCount) + 2 * (aCount + tCount));

                if (cgContent > 0.2 || cgContent < 0.6 && tm > 57 || tm < 63) {
                    System.out.println(primer);
                    System.out.println(CGcount);
                    System.out.println("Size: " + primerLength + " bp");
                    System.out.println("CG:   " + cgContent * 100 + " %");
                    System.out.println("Tm:   " + tm + " °C");

                }
            }
        }
    }//GEN-LAST:event_generatePrimersBtnActionPerformed

    private void startIndexTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startIndexTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startIndexTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DNAInputTxt;
    private javax.swing.JTextArea DNAOutputTxt;
    private javax.swing.JTextField endIndexTxt;
    private javax.swing.JButton enterBtn;
    private javax.swing.JButton generatePrimersBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField maxCGTxt;
    private javax.swing.JTextField maxSizeTxt;
    private javax.swing.JTextField maxTmTxt;
    private javax.swing.JTextField minCGTxt;
    private javax.swing.JTextField minSizeTxt;
    private javax.swing.JTextField minTmTxt;
    private javax.swing.JTextField optCGTxt;
    private javax.swing.JTextField optSizeTxt;
    private javax.swing.JTextField optTmTxt;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField startIndexTxt;
    // End of variables declaration//GEN-END:variables
}
