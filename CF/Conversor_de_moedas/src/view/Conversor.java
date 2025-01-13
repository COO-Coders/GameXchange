
package view;

import javax.swing.JOptionPane;

public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
        setTitle("Conversor de Moedas IFCE");
    }
    
    private void limparTextFields(){
        tfResultado.setText("");
        tfValor.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupde = new javax.swing.ButtonGroup();
        Para = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        real1 = new javax.swing.JRadioButton();
        dolar1 = new javax.swing.JRadioButton();
        euro1 = new javax.swing.JRadioButton();
        cad1 = new javax.swing.JRadioButton();
        ars1 = new javax.swing.JRadioButton();
        iene1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        real2 = new javax.swing.JRadioButton();
        dolar2 = new javax.swing.JRadioButton();
        euro2 = new javax.swing.JRadioButton();
        cad2 = new javax.swing.JRadioButton();
        ars2 = new javax.swing.JRadioButton();
        iene2 = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Conversor de Moedas");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Converter de:");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Para:");

        btnGroupde.add(real1);
        real1.setText("BRL R$ - Real (BR)");

        btnGroupde.add(dolar1);
        dolar1.setText("USD $ - Dólar (EUA)");

        btnGroupde.add(euro1);
        euro1.setText("EUR $ - Euro");

        btnGroupde.add(cad1);
        cad1.setText("CAD $ - Dólar (CAN)");

        btnGroupde.add(ars1);
        ars1.setText("ARS $ - Peso (Arg)");

        btnGroupde.add(iene1);
        iene1.setText("JPY ¥ - Iene (Japão)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(real1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dolar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(euro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cad1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(ars1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iene1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(real1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dolar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(euro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ars1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iene1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Para.add(real2);
        real2.setText("BRL R$ - Real (BR)");

        Para.add(dolar2);
        dolar2.setText("USD $ - Dólar (EUA)");

        Para.add(euro2);
        euro2.setText("EUR $ - Euro");

        Para.add(cad2);
        cad2.setText("CAD $ - Dólar (CAN)");

        Para.add(ars2);
        ars2.setText("ARS $ - Peso (Arg)");

        Para.add(iene2);
        iene2.setText("JPY ¥ - Iene (Japão)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(real2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dolar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(euro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ars2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(iene2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(real2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dolar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(euro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ars2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iene2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor:");

        tfValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Resultado:");

        tfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfValor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfResultado))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(tfValor)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpar))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        String valor;
        double tarifa = 1;
        double resultado = 0;
        String str_resultado;
        double valor_double = 0;
        
        valor = tfValor.getText();
        if ("".equals(valor)){
            JOptionPane.showMessageDialog(rootPane, "Insira algum valor no campo (valor)", "Erro - Nenhum valor inserido", 0, null);
            return;
        }
        valor = valor.replace(",",".");
        try{
            valor_double = Double.parseDouble(valor);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Insira um valor válido", "Erro - Valor inválido", 0, null);
            return;
        }
        

        
        if(real1.isSelected() && real2.isSelected()){
            tarifa = 1;
        } else if(real1.isSelected() && dolar2.isSelected()){
            tarifa = 0.16;
        } else if(real1.isSelected() && euro2.isSelected()){
            tarifa = 0.16;
        } else if (real1.isSelected() && cad2.isSelected()){
            tarifa = 0.24;
        } else if (real1.isSelected() && ars2.isSelected()){
            tarifa = 169.74;
        } else if (real1.isSelected() && iene2.isSelected()){
            tarifa = 25.84;
        } else if (dolar1.isSelected() && real2.isSelected()){
            tarifa = 6.11;
        } else if (dolar1.isSelected() && dolar2.isSelected()){
            tarifa = 1;
        } else if (dolar1.isSelected() && euro2.isSelected()){
            tarifa = 0.98;
        } else if (dolar1.isSelected() && cad2.isSelected()){
            tarifa = 1.44;
        } else if (dolar1.isSelected() && ars2.isSelected()){
            tarifa = 1036.50;
        } else if (dolar1.isSelected() && iene2.isSelected()){
            tarifa = 157.79;
        } else if(euro1.isSelected() && real2.isSelected()){
            tarifa = 6.25;
        } else if(euro1.isSelected() && euro2.isSelected()){
            tarifa = 1;
        } else if (euro1.isSelected() && dolar2.isSelected()){
            tarifa = 1.02;
        } else if (euro1.isSelected() && ars2.isSelected()){
            tarifa = 1061.89;
        } else if (euro1.isSelected() && iene2.isSelected()){
            tarifa = 161.62;
        } else if (euro1.isSelected() && cad2.isSelected()){
            tarifa = 1.48;
        } else if(cad1.isSelected() && real2.isSelected()){
            tarifa = 6.23;
        } else if(cad1.isSelected() && euro2.isSelected()){
            tarifa = 0.68;
        } else if (cad1.isSelected() && dolar2.isSelected()){
            tarifa = 0.69;
        } else if (cad1.isSelected() && ars2.isSelected()){
            tarifa = 718.85;
        } else if (cad1.isSelected() && iene2.isSelected()){
            tarifa = 109.42;
        } else if (cad1.isSelected() && cad2.isSelected()){
            tarifa = 1;
        } else if(ars1.isSelected() && real2.isSelected()){
            tarifa = 0.0059;
        } else if(ars1.isSelected() && euro2.isSelected()){
            tarifa = 0.00094;
        } else if (ars1.isSelected() && dolar2.isSelected()){
            tarifa = 0.00096;
        } else if (ars1.isSelected() && ars2.isSelected()){
            tarifa = 1;
        } else if (ars1.isSelected() && iene2.isSelected()){
            tarifa = 0.15;
        } else if (ars1.isSelected() && cad2.isSelected()){
            tarifa = 0.0014;
        } else if(iene1.isSelected() && real2.isSelected()){
            tarifa = 0.039;
        } else if(iene1.isSelected() && euro2.isSelected()){
            tarifa = 0.0062;
        } else if (iene1.isSelected() && dolar2.isSelected()){
            tarifa = 0.0063;
        } else if (iene1.isSelected() && ars2.isSelected()){
            tarifa = 6.57;
        } else if (iene1.isSelected() && iene2.isSelected()){
            tarifa = 1;
        } else if (iene1.isSelected() && cad2.isSelected()){
            tarifa = 0.0091;
        } else{
            JOptionPane.showMessageDialog(rootPane, "Selecione duas moedas para continuar!", "Erro - Moedas não selecionadas!", 0, null);
            return;
        }
        
        
        resultado = valor_double * tarifa;
 
        
        tfResultado.setText(String.valueOf(resultado));

        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Para.clearSelection();
        btnGroupde.clearSelection();       
        limparTextFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Para;
    private javax.swing.JRadioButton ars1;
    private javax.swing.JRadioButton ars2;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btnGroupde;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JRadioButton cad1;
    private javax.swing.JRadioButton cad2;
    private javax.swing.JRadioButton dolar1;
    private javax.swing.JRadioButton dolar2;
    private javax.swing.JRadioButton euro1;
    private javax.swing.JRadioButton euro2;
    private javax.swing.JRadioButton iene1;
    private javax.swing.JRadioButton iene2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton real1;
    private javax.swing.JRadioButton real2;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

    private void setTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
