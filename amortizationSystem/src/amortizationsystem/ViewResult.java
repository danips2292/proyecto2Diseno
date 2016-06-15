/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author aleja
 */
public class ViewResult extends javax.swing.JFrame {

    /**
     * Creates new form ViewResult
     */
    public ViewResult(LoanDTO loan) {
        initComponents();
        this.lblAmount.setText(Double.toString(loan.getAmount()));
        this.lblInterestRate.setText(Float.toString(loan.getAnualInterest()));
        this.lblTerm.setText(Integer.toString(loan.getTerm()));
        this.lblMoneda.setText(loan.getCurrency());
        this.lblName.setText(loan.getOwner());
        this.lblLoanType.setText(loan.getAmortizationSystem());
        this.lblresult.setText(loan.getTable().toString(loan.getTerm()));
        this.lblExchange.setText(loan.getResourceManagerList().get(1).getResource());
        this.lblChuckyTime.setText(loan.getResourceManagerList().get(0).getResource());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblresult = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        lblInterestRate = new javax.swing.JLabel();
        lblLoanType = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblExchange = new javax.swing.JLabel();
        lblChuckyTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Resultado del Banco ");

        lblresult.setColumns(20);
        lblresult.setRows(5);
        jScrollPane1.setViewportView(lblresult);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Monto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Plazo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Interes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tipo de Amortizacion");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Moneda");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblName.setText("NULL");

        lblAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAmount.setText("NULL");

        lblTerm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTerm.setText("NULL");

        lblInterestRate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInterestRate.setText("NULL");

        lblLoanType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLoanType.setText("NULL");

        lblMoneda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMoneda.setText("NULL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Exhcnage Rate");

        lblExchange.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblExchange.setText("NULL");

        lblChuckyTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblChuckyTime.setText("NULL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblAmount)
                                    .addComponent(lblTerm)
                                    .addComponent(lblInterestRate)
                                    .addComponent(lblLoanType)
                                    .addComponent(lblMoneda)
                                    .addComponent(lblExchange)))
                            .addComponent(lblChuckyTime))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExchange)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTerm))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblInterestRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblLoanType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblMoneda))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChuckyTime)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], final LoanDTO loan) {
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
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewResult(loan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblChuckyTime;
    private javax.swing.JLabel lblExchange;
    private javax.swing.JLabel lblInterestRate;
    private javax.swing.JLabel lblLoanType;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JTextArea lblresult;
    // End of variables declaration//GEN-END:variables
}
