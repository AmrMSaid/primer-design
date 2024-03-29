package primerdesign_b025;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
Random sequences for testing:
DNA:
ATTACCTTTTTTAGGATCAGCCCTAACCCCTTCTTTCTAGTCCCCTTTTTCCTTTTTATTCAGGCTATCCCCTTTAAAATTTTCTGACCTCTTCTTTTATAATTTAAAATTCTAGTTCTAACAAAACCCCCTCCTTAATCCTTTTTTTAAATTTTTTTTTTCCTAATTTATTGATTTAGTGTTGTTTTTTTTTTTTTCCATGTTTCAATCTTTCCTCTGATCCTATTTTATAGCATGCACAAAACAAAAATTTAAAATCATCTTTTTCTTTTTTCCTTCCCCTTAGTTAGTGTGTCTGTATTTAAGAGAGATGACGCTCTCTCTATCAACCCTCCTCCCCCACTCTCTATCACCCCACCTATTACAGAAGTGTCGCCGTAAATATTTACTTCTAGTTTCTTGTGTTTAATAATTTATAAGATGGACCAAGTATTTAGGATTGGTTTACTGATGGTGTTATTTCATGGCTGATTATTTCAGTGAAGGAGTAGTGATGT
RNA:
AUUACAACACCAUUAUCCCAUAUGACGCCUCACUUCUCUGGUGAGAAGAGUGUAGUCCUGUAAGUUUACAUAUGUGGAUGCGUCGCUUUAGAUGCUCUCGGACCGGCCCCGCUGCACCAGGCCUAGCAUCCACCAGGUUACUGACUACCCCUAGUGUCUGAAAAUACUCCUAUUUAUGGGACCAUCAACCCUGGAGAUAUUUAAUGGCAAGACUCAUAUGUAAUACCGGCUGAUCCUAUGGUCUAGCAAGGAGCACAUAGUUGCUCACAGAGGCAUCUCUAAUUAUUGCAGCAUAGCGGCAAAACUAACUGGGUACGAGAAACGUUCUCGGUUACGCAGUCAACUGAACACCGGAAGUCUCAAUGUGCCUACACAUCAGGCUGGGAUCAUCCACAACGCACAAAUUAUCACGCUCAUAAUAGAGGGUUUCUGGAGAGAAAGAGGUAGCACGAUCAUAGCUGGUACUCCGAGGACUUGCCAGACUUUUUCAUCAUAUU
 */
public class Main extends javax.swing.JFrame {

    DNA dna;
    ArrayList<PrimerOutcome> forwardPrimers = new ArrayList<>();
    ArrayList<PrimerOutcome> reversePrimers = new ArrayList<>();

    public Main() {
        initComponents();
        setFormInputs();
    }

    private void setFormInputs() {
        minSizeTxt.setText(String.valueOf(PrimerSetting.minSize));
        optSizeTxt.setText(String.valueOf(PrimerSetting.OPTIMAL_SIZE));
        maxSizeTxt.setText(String.valueOf(PrimerSetting.maxSize));
        minTmTxt.setText(String.valueOf(PrimerSetting.minTemperature));
        optTmTxt.setText(String.valueOf(PrimerSetting.OPTIMAL_TEMPERATURE));
        maxTmTxt.setText(String.valueOf(PrimerSetting.maxTemperature));
        minCGTxt.setText(String.valueOf((PrimerSetting.minCG)));
        optCGTxt.setText(String.valueOf((PrimerSetting.optimalCG)));
        maxCGTxt.setText(String.valueOf((PrimerSetting.maxCG)));

        optSizeTxt.setEditable(false);
        optTmTxt.setEditable(false);

        optimalRadio.setSelected(true);
    }

    public void prepareDNA() throws CustomException {
        if (DNAInputTxt.getText().isEmpty()) {
            throw new CustomException("Enter a sequence of DNA or RNA.");
        }
        if (DNAInputTxt.getText().indexOf('U') != -1) {
            RNA rna = new RNA(DNAInputTxt.getText());
            dna = rna.convertToDNA();
            DNAOutputTxt.setText(dna.getSequence());
        } else {
            dna = new DNA(DNAInputTxt.getText());
            DNAOutputTxt.setText(dna.getSequence());
        }
    }

    public void setPrimerSettings() {
        PrimerSetting.minSize = Integer.parseInt(minSizeTxt.getText());
        PrimerSetting.maxSize = Integer.parseInt(maxSizeTxt.getText());
        PrimerSetting.minTemperature = Integer.parseInt(minTmTxt.getText());
        PrimerSetting.maxTemperature = Integer.parseInt(maxTmTxt.getText());
        PrimerSetting.minCG = Double.parseDouble(minCGTxt.getText());
        PrimerSetting.optimalCG = Double.parseDouble(optCGTxt.getText());
        PrimerSetting.maxCG = Double.parseDouble(maxCGTxt.getText());
    }

    public void setDNAindices() throws CustomException {
        if (startIndexTxt.getText().isEmpty() || endIndexTxt.getText().isEmpty()) {
            throw new CustomException("Enter start index and end index of the gene.");
        }
        boolean isNumeric = true;
        try {
            Double.parseDouble(startIndexTxt.getText());
            Double.parseDouble(endIndexTxt.getText());
        } catch (NumberFormatException e) {
            isNumeric = false;
        }
        if (!isNumeric) {
            throw new CustomException("Enter start index and end index of the gene as numbers.");
        }
        dna.setStartIndex(Integer.parseInt(startIndexTxt.getText()));
        dna.setEndIndex(Integer.parseInt(endIndexTxt.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        enterBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        startIndexTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        endIndexTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optimalRadio = new javax.swing.JRadioButton();
        sizeRadio = new javax.swing.JRadioButton();
        tempRadio = new javax.swing.JRadioButton();
        cgRadio = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        generatePrimersBtn = new javax.swing.JButton();

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

        jLabel10.setText("Start Index");

        startIndexTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startIndexTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("End Index");

        buttonGroup1.add(optimalRadio);
        optimalRadio.setText("Optimality");

        buttonGroup1.add(sizeRadio);
        sizeRadio.setText("Primer size");
        sizeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(tempRadio);
        tempRadio.setText("Temperature");

        buttonGroup1.add(cgRadio);
        cgRadio.setText("CG content");

        jLabel12.setText("Sort By:");

        generatePrimersBtn.setText("Generate Primers");
        generatePrimersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePrimersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(optimalRadio)
                    .addComponent(sizeRadio)
                    .addComponent(tempRadio)
                    .addComponent(cgRadio)
                    .addComponent(generatePrimersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addComponent(optimalRadio)
                .addGap(18, 18, 18)
                .addComponent(sizeRadio)
                .addGap(18, 18, 18)
                .addComponent(tempRadio)
                .addGap(18, 18, 18)
                .addComponent(cgRadio)
                .addGap(27, 27, 27)
                .addComponent(generatePrimersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel4)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(90, 90, 90))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(minCGTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(optCGTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(minSizeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                                            .addComponent(minTmTxt))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(optSizeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                                            .addComponent(optTmTxt))))
                                                .addGap(24, 24, 24)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(maxCGTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(maxTmTxt)
                                        .addComponent(maxSizeTxt, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(endIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGap(60, 60, 60)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(enterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endIndexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
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
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        try {
            prepareDNA();
        } catch (CustomException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Caution", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_enterBtnActionPerformed

    private void generatePrimersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePrimersBtnActionPerformed
        try {
            setPrimerSettings();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter primer settings as numbers.", "Caution", JOptionPane.WARNING_MESSAGE);
            return;
        }
        forwardPrimers.clear();
        reversePrimers.clear();

        try {
            setDNAindices();
        } catch (CustomException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Caution", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            PrimerData.generateForwardPrimers(dna, forwardPrimers);
            PrimerData.generateReversePrimers(dna, reversePrimers);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid start and end indices.", "Caution", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (optimalRadio.isSelected()) {
            PrimerData.sortOptimal(forwardPrimers);
            PrimerData.sortOptimal(reversePrimers);
        } else if (sizeRadio.isSelected()) {
            PrimerData.sortLength(forwardPrimers);
            PrimerData.sortLength(reversePrimers);
        } else if (tempRadio.isSelected()) {
            PrimerData.sortTm(forwardPrimers);
            PrimerData.sortTm(reversePrimers);
        } else if (cgRadio.isSelected()) {
            PrimerData.sortCG(forwardPrimers);
            PrimerData.sortCG(reversePrimers);
        }
        JTextArea textArea = new JTextArea();

        for (int i = 0; i < Math.min(forwardPrimers.size(), reversePrimers.size()); i++) {
            textArea.append(forwardPrimers.get(i).toString(i));
            textArea.append(reversePrimers.get(i).toString(i));
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Primers", JOptionPane.PLAIN_MESSAGE);
        scrollPane.getVerticalScrollBar().setValue(0);
        scrollPane.repaint();

        System.out.println("Forward primers: " + forwardPrimers.size());
        System.out.println("Reverse primers: " + reversePrimers.size());
    }//GEN-LAST:event_generatePrimersBtnActionPerformed

    private void startIndexTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startIndexTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startIndexTxtActionPerformed

    private void sizeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeRadioActionPerformed

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

        /* Create and toString the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DNAInputTxt;
    private javax.swing.JTextArea DNAOutputTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cgRadio;
    private javax.swing.JTextField endIndexTxt;
    private javax.swing.JButton enterBtn;
    private javax.swing.JButton generatePrimersBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JRadioButton optimalRadio;
    private javax.swing.JRadioButton sizeRadio;
    private javax.swing.JTextField startIndexTxt;
    private javax.swing.JRadioButton tempRadio;
    // End of variables declaration//GEN-END:variables
}

class CustomException extends Exception {

    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
