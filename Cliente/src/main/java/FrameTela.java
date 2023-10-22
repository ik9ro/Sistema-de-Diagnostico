
import java.awt.Color;
import java.awt.List;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class FrameTela extends javax.swing.JFrame {

    public FrameTela() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        btnSave.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelInforme = new javax.swing.JLabel();
        rS0 = new javax.swing.JRadioButton();
        rS1 = new javax.swing.JRadioButton();
        rS2 = new javax.swing.JRadioButton();
        rS3 = new javax.swing.JRadioButton();
        rS4 = new javax.swing.JRadioButton();
        rS5 = new javax.swing.JRadioButton();
        rS6 = new javax.swing.JRadioButton();
        rS7 = new javax.swing.JRadioButton();
        rS8 = new javax.swing.JRadioButton();
        rS9 = new javax.swing.JRadioButton();
        btnGerar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        panelDiagnostico = new javax.swing.JScrollPane();
        textDiagnostico = new javax.swing.JTextArea();
        labelDiagnostico = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnCasos = new javax.swing.JButton();
        btnWisard = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnPesq = new javax.swing.JButton();
        fieldInforme = new javax.swing.JTextField();
        labelPesquisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Sistema de Diagnostico");

        labelInforme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInforme.setText("Informe os sintomas do paciente:");

        rS0.setText("Dor de cabeça");

        rS1.setText("Febre");

        rS2.setText("Vômito");

        rS3.setText("Diarreia");

        rS4.setText("Erupção cutânea");

        rS5.setText("Dor de garganta");

        rS6.setText("Náusea");

        rS7.setText("Dor abdominal");

        rS8.setText("Fadiga");

        rS9.setText("Tosse");

        btnGerar.setBackground(new java.awt.Color(61, 117, 229));
        btnGerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGerar.setText("GERAR DIAGNOSTICO");
        btnGerar.setBorderPainted(false);
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(210, 48, 48));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR CAMPOS");
        btnLimpar.setBorderPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        textDiagnostico.setColumns(20);
        textDiagnostico.setRows(5);
        textDiagnostico.setEnabled(false);
        panelDiagnostico.setViewportView(textDiagnostico);

        labelDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDiagnostico.setText("Diagnostico:");

        btnNovo.setText("INICIAR NOVO DIAGNOSTICO");
        btnNovo.setEnabled(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCasos.setText("CASOS ARMAZENADOS");
        btnCasos.setEnabled(false);
        btnCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasosActionPerformed(evt);
            }
        });

        btnWisard.setBackground(new java.awt.Color(61, 117, 229));
        btnWisard.setForeground(new java.awt.Color(255, 255, 255));
        btnWisard.setText("DIAGNOSTICO WISARD");
        btnWisard.setBorderPainted(false);
        btnWisard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWisardActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(34, 145, 47));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SALVAR");
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPesq.setText("PESQUISA");
        btnPesq.setEnabled(false);
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        fieldInforme.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fieldInforme.setText("Informe o diagnostico");
        fieldInforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldInformeMouseClicked(evt);
            }
        });

        labelPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPesquisa.setText("Pesquisa por Diagnostico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnGerar)
                            .addGap(50, 50, 50)
                            .addComponent(btnWisard)
                            .addGap(50, 50, 50)
                            .addComponent(btnLimpar)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelInforme)
                                    .addGap(399, 399, 399))
                                .addComponent(labelTitulo))
                            .addGap(224, 224, 224)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiagnostico)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rS0)
                                    .addComponent(rS5))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rS1)
                                    .addComponent(rS6))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rS2)
                                    .addComponent(rS7))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rS3)
                                    .addComponent(rS8))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rS9)
                                    .addComponent(rS4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelDiagnostico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnNovo)
                                        .addComponent(btnCasos))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSave)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPesquisa))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelInforme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rS0)
                            .addComponent(rS2)
                            .addComponent(rS3)
                            .addComponent(rS1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rS5)
                            .addComponent(rS7)
                            .addComponent(rS8)
                            .addComponent(rS6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rS4)
                        .addGap(22, 22, 22)
                        .addComponent(rS9)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(btnLimpar)
                    .addComponent(btnWisard))
                .addGap(20, 20, 20)
                .addComponent(labelDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSave))
                        .addGap(20, 20, 20)
                        .addComponent(btnCasos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesq))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VERIFICA SE NAO HA RADIOS HABILITADOS
    private boolean esta_selecionado() {
        boolean selecionado = false;

        if (!(rS0.isSelected() | rS1.isSelected() | rS2.isSelected()
                | rS3.isSelected() | rS4.isSelected() | rS5.isSelected()
                | rS6.isSelected() | rS7.isSelected() | rS8.isSelected()
                | rS9.isSelected())) {
            selecionado = false;
            return false;
        }

        return true;
    }

    //LIMPA RADIOS
    private void limpa_sintomas() {
        rS0.setSelected(false);
        rS2.setSelected(false);
        rS3.setSelected(false);
        rS1.setSelected(false);
        rS4.setSelected(false);
        rS5.setSelected(false);
        rS7.setSelected(false);
        rS8.setSelected(false);
        rS6.setSelected(false);
        rS9.setSelected(false);
    }

    //DESABILITA RADIOS
    private void disable_sintomas() {
        rS0.setEnabled(false);
        rS2.setEnabled(false);
        rS3.setEnabled(false);
        rS1.setEnabled(false);
        rS4.setEnabled(false);
        rS5.setEnabled(false);
        rS7.setEnabled(false);
        rS8.setEnabled(false);
        rS6.setEnabled(false);
        rS9.setEnabled(false);
    }

    //HABILITA RADIOS
    private void enable_sintomas() {
        rS0.setEnabled(true);
        rS2.setEnabled(true);
        rS3.setEnabled(true);
        rS1.setEnabled(true);
        rS4.setEnabled(true);
        rS5.setEnabled(true);
        rS7.setEnabled(true);
        rS8.setEnabled(true);
        rS6.setEnabled(true);
        rS9.setEnabled(true);
    }

    //GERA O DIAGNOSTICO COM BASE NAS COMBINACOES DEFINIDAS
    private void diagnostico_manual() {
        if (rS0.isSelected() && rS1.isSelected() && rS2.isSelected()
                && rS3.isSelected() && rS4.isSelected() && rS5.isSelected()
                && rS6.isSelected() && rS7.isSelected() && rS8.isSelected()
                && rS9.isSelected()) {
            textDiagnostico.setText("Procure um medico urgentemente");
        } else if (rS0.isSelected() && rS5.isSelected() && rS2.isSelected()) {
            textDiagnostico.setText("Enxaqueca");
        } else if (rS6.isSelected() && rS3.isSelected() && rS8.isSelected()) {
            textDiagnostico.setText("Gastroenterite");
        } else if (rS9.isSelected() && rS5.isSelected() && rS2.isSelected()
                && rS6.isSelected() && rS3.isSelected()) {
            textDiagnostico.setText("Infecção Respiratória");
        } else if (rS0.isSelected() && rS1.isSelected()
                && rS5.isSelected() && rS6.isSelected()) {
            textDiagnostico.setText("Covid"); //D5
        } else if (rS1.isSelected() && rS9.isSelected() && rS5.isSelected()) {
            textDiagnostico.setText("Resfriado Comum");
        } else {
            textDiagnostico.setText("Indisponivel");
        }
    }

    //GERA UMA STRING COM OS SINTOMAS
    private String get_conjunto_sintomas() {
        String conjSintomas = "";

        if (rS0.isSelected()) {
            conjSintomas += rS0.getText() + ", ";
        }
        if (rS1.isSelected()) {
            conjSintomas += rS1.getText() + ", ";
        }
        if (rS2.isSelected()) {
            conjSintomas += rS2.getText() + ", ";
        }
        if (rS3.isSelected()) {
            conjSintomas += rS3.getText() + ", ";
        }
        if (rS4.isSelected()) {
            conjSintomas += rS4.getText() + ", ";
        }
        if (rS5.isSelected()) {
            conjSintomas += rS5.getText() + ", ";
        }
        if (rS6.isSelected()) {
            conjSintomas += rS6.getText() + ", ";
        }
        if (rS7.isSelected()) {
            conjSintomas += rS7.getText() + ", ";
        }
        if (rS8.isSelected()) {
            conjSintomas += rS8.getText() + ", ";
        }
        if (rS9.isSelected()) {
            conjSintomas += rS9.getText() + ", ";
        }

        return conjSintomas;
    }

    private String[] obterSintomasSelecionados() {
        ArrayList<String> sintomasSelecionados = new ArrayList<>();

        if (rS0.isSelected()) {
            sintomasSelecionados.add(rS0.getText());
        }
        if (rS1.isSelected()) {
            sintomasSelecionados.add(rS1.getText());
        }
        if (rS2.isSelected()) {
            sintomasSelecionados.add(rS2.getText());
        }
        if (rS3.isSelected()) {
            sintomasSelecionados.add(rS3.getText());
        }
        if (rS4.isSelected()) {
            sintomasSelecionados.add(rS4.getText());
        }
        if (rS5.isSelected()) {
            sintomasSelecionados.add(rS5.getText());
        }
        if (rS6.isSelected()) {
            sintomasSelecionados.add(rS6.getText());
        }
        if (rS7.isSelected()) {
            sintomasSelecionados.add(rS7.getText());
        }
        if (rS8.isSelected()) {
            sintomasSelecionados.add(rS8.getText());
        }
        if (rS9.isSelected()) {
            sintomasSelecionados.add(rS9.getText());
        }

        return sintomasSelecionados.toArray(new String[0]);
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_sintomas();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        boolean info = esta_selecionado();

        if (info) {
            labelInforme.setForeground(Color.black);
            btnNovo.setEnabled(true);
            disable_sintomas();
            diagnostico_manual();
            btnLimpar.setEnabled(false);
            btnGerar.setEnabled(false);
            btnSave.setEnabled(true);
            btnWisard.setEnabled(false);
        } else {
            labelInforme.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpa_sintomas();
        enable_sintomas();
        textDiagnostico.setText("");
        btnLimpar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnGerar.setEnabled(true);
        btnSave.setEnabled(false);
        btnWisard.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String sintomas = get_conjunto_sintomas();

        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            if (oos != null && ois != null) {
                String diagnostico = textDiagnostico.getText();
                Paciente patient = new Paciente(sintomas, diagnostico);
                oos.writeObject(patient);

                String response = (String) ois.readObject();
                System.out.println(response);
            } else {
                System.out.println("Erro ao estabelecer conexão com o servidor.");
            }

            ois.close();
            oos.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        btnSave.setEnabled(false);
        btnCasos.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasosActionPerformed
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            oos.writeObject("listar"); // Envia um comando para o servidor indicando que deseja listar os pacientes

            String response;
            System.out.println("\n+-------LISTAGEM DE PACIENTES-------+");
            while ((response = (String) ois.readObject()) != null) {
                System.out.println(response); // Imprime a resposta recebida do servidor
            }
            System.out.println("-------------------------------------\n");

            ois.close();
            oos.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCasosActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            oos.writeObject("pesquisar");
            oos.writeObject(fieldInforme.getText());

            String response;
            System.out.println("\n+-------LISTAGEM DE PACIENTES COM DIAGNÓSTICO - " + fieldInforme.getText() + "-------+");
            while ((response = (String) ois.readObject()) != null) {
                System.out.println(response); //IMPRESSAO
            }
            System.out.println("-------------------------------------\n");

            ois.close();
            oos.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        fieldInforme.setText("");
    }//GEN-LAST:event_btnPesqActionPerformed

    private void fieldInformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldInformeMouseClicked
        btnPesq.setEnabled(true);
        fieldInforme.setText("");
    }//GEN-LAST:event_fieldInformeMouseClicked

    private void btnWisardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWisardActionPerformed
        try {
            String[] sintomasSelecionados = obterSintomasSelecionados();

            Socket socket = new Socket("localhost", 12345);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            oos.writeObject("wisard");
            oos.writeObject(sintomasSelecionados);

            String response = (String) ois.readObject();
            textDiagnostico.setText(response);

            oos.close();
            ois.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        btnWisard.setEnabled(false);
        btnGerar.setEnabled(false);
        btnLimpar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCasos.setEnabled(true);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnWisardActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasos;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnWisard;
    private javax.swing.JTextField fieldInforme;
    private javax.swing.JLabel labelDiagnostico;
    private javax.swing.JLabel labelInforme;
    private javax.swing.JLabel labelPesquisa;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JScrollPane panelDiagnostico;
    private javax.swing.JRadioButton rS0;
    private javax.swing.JRadioButton rS1;
    private javax.swing.JRadioButton rS2;
    private javax.swing.JRadioButton rS3;
    private javax.swing.JRadioButton rS4;
    private javax.swing.JRadioButton rS5;
    private javax.swing.JRadioButton rS6;
    private javax.swing.JRadioButton rS7;
    private javax.swing.JRadioButton rS8;
    private javax.swing.JRadioButton rS9;
    private javax.swing.JTextArea textDiagnostico;
    // End of variables declaration//GEN-END:variables
}
