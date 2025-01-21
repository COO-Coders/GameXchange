
package view;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.tools.Tool;

public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
        setTitle("Conversor de Moedas IFCE");
        tfResultado.setEditable(false);
        setIcon();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcombode = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcombopara = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        tfResultado = new javax.swing.JTextField();
        Troca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/2907505_cent_coin_currency_dollar_usd_icon (2).png"))); // NOI18N
        jLabel2.setText("Conversor de Moedas");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Converter de:");

        jcombode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRL R$ - Real Brasileiro", "USD $ - Dólar (EUA)", "EUR € - Euro", "CAD $ - Dólar Canadense", "JPY ¥ - Iene (Japão)", "ARS $ - Peso Argentino" }));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Para:");

        jcombopara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRL R$ - Real Brasileiro", "USD $ - Dólar (EUA)", "EUR € - Euro", "CAD $ - Dólar Canadense", "JPY ¥ - Iene (Japão)", "ARS $ - Peso Argentino" }));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Resultado:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/3005766_account_door_exit_logout_icon (1).png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/5027823_calculator_coin_dollar_money_icon.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/118917_edit_clear_icon.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfResultado.setKeymap(null);
        tfResultado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tfResultadoComponentResized(evt);
            }
        });
        tfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResultadoActionPerformed(evt);
            }
        });

        Troca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/9075842_exchange_business_finance_currency_trade_icon (1).png"))); // NOI18N
        Troca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrocaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor:");

        tfValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcombode, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Troca, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcombopara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCalcular)
                        .addGap(77, 77, 77)
                        .addComponent(btnLimpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcombode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcombopara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Troca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(616, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResultadoActionPerformed

    }//GEN-LAST:event_tfResultadoActionPerformed

    private void tfResultadoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tfResultadoComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_tfResultadoComponentResized

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTextFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        String valor;
        String escolha1, escolha2;
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
        
        escolha1 = jcombode.getSelectedItem().toString();
        escolha2 = jcombopara.getSelectedItem().toString();
        
        if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 1;
        } 
        else if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 0.17;
        }
        else if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("EUR € - Euro")){
            tarifa = 0.16;
        }
        else if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 0.24;
        } 
        else if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 0.24;
        } 
        else if(escolha1.equals("BRL R$ - Real Brasileiro") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 173.33;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 6.03;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 1;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("EUR € - Euro")){
            tarifa = 0.96;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 1.43;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 155;
        }
        else if(escolha1.equals("USD $ - Dólar (EUA)") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 1045.50;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("EUR € - Euro")){
            tarifa = 1;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 6.29;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 1.04;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 1.49;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 161.68;
        }
        else if(escolha1.equals("EUR € - Euro") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 1090.35;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 1;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 4.22;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 0.70;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("EUR € - Euro")){
            tarifa = 0.63;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 108.46;
        }
        else if(escolha1.equals("CAD $ - Dólar Canadense") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 731.17;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 1;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 0.0039;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 0.0064;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("EUR € - Euro")){
            tarifa = 0.0062;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 0.0092;
        }
        else if(escolha1.equals("JPY ¥ - Iene (Japão)") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 6.74;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("ARS $ - Peso Argentino")){
            tarifa = 1;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("BRL R$ - Real Brasileiro")){
            tarifa = 0.0058;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("USD $ - Dólar (EUA)")){
            tarifa = 0.00096;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("EUR € - Euro")){
            tarifa = 0.00092;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("CAD $ - Dólar Canadense")){
            tarifa = 0.0014;
        }
        else if(escolha1.equals("ARS $ - Peso Argentino") && escolha2.equals("JPY ¥ - Iene (Japão)")){
            tarifa = 0.15;
        }
       
        resultado = valor_double * tarifa;

        DecimalFormat x = new DecimalFormat("0.00");
        tfResultado.setText(String.valueOf(x.format(resultado)));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed

        
        
        
    }//GEN-LAST:event_tfValorActionPerformed

    private void TrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocaActionPerformed
        String escolha1, escolha2;

        escolha1 = jcombode.getSelectedItem().toString();
        escolha2 = jcombopara.getSelectedItem().toString();

        jcombode.setSelectedItem(escolha2);
        jcombopara.setSelectedItem(escolha1);

    }//GEN-LAST:event_TrocaActionPerformed


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
    private javax.swing.JButton Troca;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup btnGroupde;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcombode;
    private javax.swing.JComboBox<String> jcombopara;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables

    private void setTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/2907505_cent_coin_currency_dollar_usd_icon (2).png")));
    }
}
