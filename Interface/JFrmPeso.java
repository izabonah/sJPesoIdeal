/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Negocio.Pessoa;
import Persistencia.Pessoas;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Santos
 */
public class JFrmPeso extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPeso
     */
    Pessoas Ps;//vetor dinamico
    String titulo;
    public JFrmPeso() {
        titulo = "Controle de Peso";
        initComponents();
        Ps = new Pessoas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGBtnSexo = new javax.swing.ButtonGroup();
        jLblMatricula = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblIdade = new javax.swing.JLabel();
        jLblPeso = new javax.swing.JLabel();
        jLblAltura = new javax.swing.JLabel();
        jTxtMatricula = new javax.swing.JTextField();
        jTxtNome = new javax.swing.JTextField();
        jTxtPeso = new javax.swing.JTextField();
        jTxtAltura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtARelatorio = new javax.swing.JTextArea();
        jPnlBotoes = new javax.swing.JPanel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnListar = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jLblVF = new javax.swing.JLabel();
        JLblValorF = new javax.swing.JLabel();
        jLblP = new javax.swing.JLabel();
        JLblPesoI = new javax.swing.JLabel();
        jLblValorB = new javax.swing.JLabel();
        jTxtValorB = new javax.swing.JTextField();
        jLblSitua = new javax.swing.JLabel();
        JLblSituacao = new javax.swing.JLabel();
        jSpnIdade = new javax.swing.JSpinner();
        jLblEspecial = new javax.swing.JLabel();
        jCbmEspecial = new javax.swing.JComboBox();
        jPnlSexo = new javax.swing.JPanel();
        jRdBFem = new javax.swing.JRadioButton();
        jRdBMasc = new javax.swing.JRadioButton();
        jPnlAssiduo = new javax.swing.JPanel();
        jChkSim = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblMatricula.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblMatricula.setText("Matrícula:");

        jLblNome.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblNome.setText("Nome:");

        jLblIdade.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblIdade.setText("Idade:");

        jLblPeso.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblPeso.setText("Peso:");

        jLblAltura.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblAltura.setText("Altura:");

        jTxtMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtMatricula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtMatriculaFocusLost(evt);
            }
        });

        jTxtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTxtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtNomeKeyReleased(evt);
            }
        });

        jTxtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTxtAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTxtARelatorio.setColumns(20);
        jTxtARelatorio.setRows(5);
        jTxtARelatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(jTxtARelatorio);

        jPnlBotoes.setBackground(new java.awt.Color(22, 170, 207));
        jPnlBotoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.pink, java.awt.Color.pink, new java.awt.Color(238, 194, 244), new java.awt.Color(233, 160, 255)));
        jPnlBotoes.setForeground(new java.awt.Color(20, 206, 243));

        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnListar.setText("Listar");
        jBtnListar.setToolTipText("Relatório");
        jBtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListarActionPerformed(evt);
            }
        });

        jBtnLimpar.setText("Limpar");
        jBtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimparActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlBotoesLayout = new javax.swing.GroupLayout(jPnlBotoes);
        jPnlBotoes.setLayout(jPnlBotoesLayout);
        jPnlBotoesLayout.setHorizontalGroup(
            jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlBotoesLayout.setVerticalGroup(
            jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnListar)
                    .addComponent(jBtnLimpar)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLblVF.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblVF.setText("Valor Final:");

        JLblValorF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLblP.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblP.setText("Peso Ideal:");

        JLblPesoI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLblValorB.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblValorB.setText("Valor base:");

        jTxtValorB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLblSitua.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblSitua.setText("Situação:");

        JLblSituacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSpnIdade.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jSpnIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpnIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLblEspecial.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLblEspecial.setText("Especialidade:");

        jCbmEspecial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Sexo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jGBtnSexo.add(jRdBFem);
        jRdBFem.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jRdBFem.setText("Feminino");

        jGBtnSexo.add(jRdBMasc);
        jRdBMasc.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jRdBMasc.setText("Masculino");

        javax.swing.GroupLayout jPnlSexoLayout = new javax.swing.GroupLayout(jPnlSexo);
        jPnlSexo.setLayout(jPnlSexoLayout);
        jPnlSexoLayout.setHorizontalGroup(
            jPnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRdBFem)
                .addGap(18, 18, 18)
                .addComponent(jRdBMasc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlSexoLayout.setVerticalGroup(
            jPnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSexoLayout.createSequentialGroup()
                .addGroup(jPnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRdBFem)
                    .addComponent(jRdBMasc))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPnlAssiduo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Assíduo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jChkSim.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jChkSim.setText("Sim");

        javax.swing.GroupLayout jPnlAssiduoLayout = new javax.swing.GroupLayout(jPnlAssiduo);
        jPnlAssiduo.setLayout(jPnlAssiduoLayout);
        jPnlAssiduoLayout.setHorizontalGroup(
            jPnlAssiduoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlAssiduoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jChkSim)
                .addContainerGap())
        );
        jPnlAssiduoLayout.setVerticalGroup(
            jPnlAssiduoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAssiduoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jChkSim)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNome)
                                    .addComponent(jLblMatricula)
                                    .addComponent(jLblPeso)
                                    .addComponent(jLblAltura)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLblEspecial)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCbmEspecial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLblIdade)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jSpnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(42, 42, 42))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLblValorB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTxtValorB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, Short.MAX_VALUE)))
                                                .addComponent(jPnlAssiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(JLblValorF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLblP)
                                                    .addComponent(jLblSitua))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(JLblPesoI, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(JLblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLblVF)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtValorB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLblValorB))
                                            .addComponent(jTxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblNome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblPeso)
                                    .addComponent(jSpnIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblIdade)))
                            .addComponent(jLblMatricula))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPnlAssiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblAltura)
                    .addComponent(jLblEspecial)
                    .addComponent(jCbmEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblP)
                        .addGap(29, 29, 29)
                        .addComponent(jLblSitua))
                    .addComponent(jPnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLblPesoI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLblSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLblValorF, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLblVF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(646, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Pessoa c;
        if (jTxtMatricula.getText().isEmpty()||jTxtNome.getText().isEmpty()|| 
                jTxtAltura.getText().isEmpty()||jTxtPeso.getText().isEmpty()||
                    jTxtValorB.getText().isEmpty()|| (!jRdBFem.isSelected()&&!jRdBMasc.isSelected()
                        || jCbmEspecial.getSelectedIndex() < 0)
                                )
            JOptionPane.showMessageDialog(null,"Favor digitar todos os dados",titulo,
                    JOptionPane.INFORMATION_MESSAGE);
        else {
            c = new Pessoa();
            c.setMatricula(Integer.parseInt(jTxtMatricula.getText()));
            c.setNome(jTxtNome.getText());
            c.setAltura(Float.parseFloat(jTxtAltura.getText().replace(",",".")));
            c.setPeso(Float.parseFloat(jTxtPeso.getText().replace(",",".")));
            c.setIdade((int) jSpnIdade.getValue());
            c.setValor(Float.parseFloat(jTxtValorB.getText().replace(",",".")));
            c.setEsp((String) jCbmEspecial.getSelectedItem());
            c.setAss(jChkSim.isSelected());            
            if (jRdBFem.isSelected())
                c.setSexo('F');
            else if (jRdBMasc.isSelected())
                c.setSexo('M');         
                        else
                JOptionPane.showMessageDialog(null,"Favor informar seu sexo",titulo,
                    JOptionPane.INFORMATION_MESSAGE);
            //calculos
            JLblValorF.setText(NumberFormat.getCurrencyInstance().format(c.valorF()));
            JLblPesoI.setText(NumberFormat.getNumberInstance().format(c.pesoI()));
            JLblSituacao.setText(c.situacao());
            
            if (jBtnIncluir.isEnabled()){ // Incluir habilitando
                Ps.setPessoa(c,'I');
                JOptionPane.showMessageDialog(null,"Inserido com sucesso",titulo,JOptionPane.INFORMATION_MESSAGE);
            jBtnIncluir.setEnabled(false);
            jBtnAlterar.setEnabled(true);
            jBtnExcluir.setEnabled(true);
            }                    
            else{//alterar habilitado
                Ps.setPessoa(c,'A');
                JOptionPane.showMessageDialog(null,c.getNome() + " alterado com sucesso",titulo,JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
               
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimparActionPerformed
        // TODO add your handling code here:
       limpar();
    }//GEN-LAST:event_jBtnLimparActionPerformed

    private void carregaObjetos(Pessoa p){
         jTxtMatricula.setText(String.valueOf(p.getMatricula()));
         jTxtNome.setText(p.getNome());
         jTxtPeso.setText(String.valueOf(p.getPeso()));
         jTxtAltura.setText(String.valueOf(p.getAltura()));
         jSpnIdade.setValue(p.getIdade());
         jTxtValorB.setText(NumberFormat.getCurrencyInstance().format(p.getValor()));
         jCbmEspecial.setSelectedItem(p.getEsp());
         JLblValorF.setText(NumberFormat.getCurrencyInstance().format(p.valorF()));
         jChkSim.setSelected(p.isAss());
         if(p.getSexo() == 'M')
             jRdBMasc.setSelected(true);
         else
             jRdBFem.setSelected(true);
        JLblSituacao.setText(p.situacao());
        JLblPesoI.setText(NumberFormat.getNumberInstance().format(p.pesoI()));
        
    }
    
    private void limpar(){
        jTxtMatricula.setText("");
        jTxtNome.setText("");
        jSpnIdade.setValue(0);
        jTxtPeso.setText("");
        jTxtAltura.setText("");
        jTxtValorB.setText("");
        JLblValorF.setText("");
        JLblSituacao.setText("");
        JLblPesoI.setText("");
        jGBtnSexo.clearSelection();
        jCbmEspecial.setSelectedIndex(-1);
        jChkSim.setSelected(false);
        jTxtARelatorio.setText("");
        jBtnIncluir.setEnabled(false);
        //jBtnIncluir.setEnabled(true);
        //jTxtMatricula.requestFocusInWindow();
        jBtnAlterar.setEnabled(false);
        jBtnIncluir.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jTxtMatricula.setEditable(true);
     
    }
    
    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null,"Deseja Finalizar?",titulo ,JOptionPane.YES_NO_OPTION)==0) 
            System.exit(0);                  
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListarActionPerformed
        // TODO add your handling code here:
        if (Ps != null)
            jTxtARelatorio.setText(Ps.relatorioG());
        else
            JOptionPane.showMessageDialog(null,"Favor inserir algum Cliente.",titulo,
                    JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtnListarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jCbmEspecial.addItem("Clínico Geral");
        jCbmEspecial.addItem("Nutricionista");
        jCbmEspecial.addItem("Alergista");
        jCbmEspecial.addItem("Cardiologista");
        jCbmEspecial.addItem("Obstreta");
        limpar();
        
    }//GEN-LAST:event_formWindowOpened

    private void jTxtMatriculaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtMatriculaFocusLost
        // TODO add your handling code here:
        int ident,posi;
        try{//tratamento de erro
        if (jTxtMatricula.getText().isEmpty()) 
            JOptionPane.showMessageDialog(null,"Favor digitar a identificação",titulo,JOptionPane.INFORMATION_MESSAGE);
        
        else {
            ident = Integer.parseInt(jTxtMatricula.getText());
            posi = Ps.pesquisa(ident);
            if (posi == Ps.getTotal()){
                jBtnIncluir.setEnabled(true);
                JOptionPane.showMessageDialog(null,"Identificação inexistente",titulo,JOptionPane.INFORMATION_MESSAGE);
            }
         else {
        //TxtARelatorio.setText(Ps.getPs(posi).relatorio());
           jBtnAlterar.setEnabled(true);
           jBtnExcluir.setEnabled(true);
           Pessoa p = Ps.getPessoa(posi);
           carregaObjetos(p);
            } 
           jTxtMatricula.setEditable(false); 
        }
       
    }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Houve erro na conversão \n" + "Digite apenas caracteres numéricos" + 
                    erro.getMessage() ,titulo,JOptionPane.INFORMATION_MESSAGE);
        }
          
    }//GEN-LAST:event_jTxtMatriculaFocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jTxtNome.requestFocusInWindow();
    }//GEN-LAST:event_formWindowActivated

    private void jTxtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomeKeyReleased
        // TODO add your handling code here:
        jTxtNome.setText(jTxtNome.getText().toUpperCase()); 
    }//GEN-LAST:event_jTxtNomeKeyReleased

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
      jBtnIncluirActionPerformed(evt);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        int ident,posi;    
        
         if (JOptionPane.showConfirmDialog(null,"Deseja Excluir",titulo ,JOptionPane.YES_NO_OPTION)==0) {
             posi = Ps.pesquisa(Integer.parseInt(jTxtMatricula.getText()));
             Ps.setPessoa(Ps.getPessoa(posi), 'E');
             jBtnLimparActionPerformed(evt);
         }   
    }//GEN-LAST:event_jBtnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPeso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPeso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblPesoI;
    private javax.swing.JLabel JLblSituacao;
    private javax.swing.JLabel JLblValorF;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnLimpar;
    private javax.swing.JButton jBtnListar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox jCbmEspecial;
    private javax.swing.JCheckBox jChkSim;
    private javax.swing.ButtonGroup jGBtnSexo;
    private javax.swing.JLabel jLblAltura;
    private javax.swing.JLabel jLblEspecial;
    private javax.swing.JLabel jLblIdade;
    private javax.swing.JLabel jLblMatricula;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblP;
    private javax.swing.JLabel jLblPeso;
    private javax.swing.JLabel jLblSitua;
    private javax.swing.JLabel jLblVF;
    private javax.swing.JLabel jLblValorB;
    private javax.swing.JPanel jPnlAssiduo;
    private javax.swing.JPanel jPnlBotoes;
    private javax.swing.JPanel jPnlSexo;
    private javax.swing.JRadioButton jRdBFem;
    private javax.swing.JRadioButton jRdBMasc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpnIdade;
    private javax.swing.JTextArea jTxtARelatorio;
    private javax.swing.JTextField jTxtAltura;
    private javax.swing.JTextField jTxtMatricula;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPeso;
    private javax.swing.JTextField jTxtValorB;
    // End of variables declaration//GEN-END:variables
}
