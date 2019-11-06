package KAROJOMA;

import static KAROJOMA.MAIN.table;
import Model.methods;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Update extends javax.swing.JFrame {

    public Update() {
        initComponents();
        display();
        setLocationRelativeTo(null);
    }
    
    public static void display(){
              int row = MAIN.table.getSelectedRow();
             t1.setText(""+table.getValueAt(row, 0));
             t2.setText(""+table.getValueAt(row, 1));
             t3.setText(""+table.getValueAt(row, 2));
             t4.setText(""+table.getValueAt(row, 3));
             t5.setText(""+table.getValueAt(row, 4));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Size :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity :");

        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("SAVE");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date Supply:");

        t4.setEditable(false);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SUPPLIER:");

        cancel.setText("CANCEL");
        cancel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(t4)
                        .addComponent(t3)
                        .addComponent(t2)
                        .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            methods obj = new methods();
            String temp1 = "";
            String temp2 = "";
            String temp3 = "";
            String temp4 = "";
            String temp5 = "";
             t4.setText(MAIN.Date.format(MAIN.Ttime.getTime())+" "+MAIN.Time.format(MAIN.Ttime.getTime()));
             int move = 0;
         try{
            methods.size = Integer.parseInt(t2.getText());
            methods.Quantity = Integer.parseInt(t3.getText());
         }catch(Exception e){    
             move = 1;
             JOptionPane.showMessageDialog(null,"Invalid Input in Size or Quantity");
         }
            int row = MAIN.table.getSelectedRow();
            DefaultTableModel model =(DefaultTableModel) table.getModel();
    if(move==0){        
        if(t1.getText().equals("")||t4.getText().equals("") || t5.getText().equals("")){        
             JOptionPane.showMessageDialog(null,"Empty Fields");
        }else{
               if(MAIN.cmb.getSelectedIndex()==1){ 
                    temp1 = methods.product1[row][0];
                    temp2 = methods.product1[row][1];
                    temp3 = methods.product1[row][2];
                    temp4 = methods.product1[row][3];
                    temp5 = methods.product1[row][4];
                    obj.product1[row][0] = ""+t1.getText();
                    obj.product1[row][1] = ""+methods.size;
                    obj.product1[row][2] = ""+methods.Quantity;
                    obj.product1[row][3] = ""+t4.getText();
                    obj.product1[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==2){
                    temp1 = methods.product2[row][0];
                    temp2 = methods.product2[row][1];
                    temp3 = methods.product2[row][2];
                    temp4 = methods.product2[row][3];
                    temp5 = methods.product2[row][4];
                    obj.product2[row][0] = ""+t1.getText();
                    obj.product2[row][1] = ""+methods.size;
                    obj.product2[row][2] = ""+methods.Quantity;
                    obj.product2[row][3] = ""+t4.getText();
                    obj.product2[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==3){
                    temp1 = methods.product3[row][0];
                    temp2 = methods.product3[row][1];
                    temp3 = methods.product3[row][2];
                    temp4 = methods.product3[row][3];
                    temp5 = methods.product3[row][4];
                    obj.product3[row][0] = ""+t1.getText();
                    obj.product3[row][1] = ""+methods.size;
                    obj.product3[row][2] = ""+methods.Quantity;
                    obj.product3[row][3] = ""+t4.getText();
                    obj.product3[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==4){
                    temp1 = methods.product4[row][0];
                    temp2 = methods.product4[row][1];
                    temp3 = methods.product4[row][2];
                    temp4 = methods.product4[row][3];
                    temp5 = methods.product4[row][4];
                    obj.product4[row][0] = ""+t1.getText();
                    obj.product4[row][1] = ""+methods.size;
                    obj.product4[row][2] = ""+methods.Quantity;
                    obj.product4[row][3] = ""+t4.getText();
                    obj.product4[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==5){
                    temp1 = methods.product5[row][0];
                    temp2 = methods.product5[row][1];
                    temp3 = methods.product5[row][2];
                    temp4 = methods.product5[row][3];
                    temp5 = methods.product5[row][4];
                    obj.product5[row][0] = ""+t1.getText();
                    obj.product5[row][1] = ""+methods.size;
                    obj.product5[row][2] = ""+methods.Quantity;
                    obj.product5[row][3] = ""+t4.getText();
                    obj.product5[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==6){
                    temp1 = methods.product6[row][0];
                    temp2 = methods.product6[row][1];
                    temp3 = methods.product6[row][2];
                    temp4 = methods.product6[row][3];
                    temp5 = methods.product6[row][4];
                    obj.product6[row][0] = ""+t1.getText();
                    obj.product6[row][1] = ""+methods.size;
                    obj.product6[row][2] = ""+methods.Quantity;
                    obj.product6[row][3] = ""+t4.getText();
                    obj.product6[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==7){
                    temp1 = methods.product7[row][0];
                    temp2 = methods.product7[row][1];
                    temp3 = methods.product7[row][2];
                    temp4 = methods.product7[row][3];
                    temp5 = methods.product7[row][4];
                    obj.product7[row][0] = ""+t1.getText();
                    obj.product7[row][1] = ""+methods.size;
                    obj.product7[row][2] = ""+methods.Quantity;
                    obj.product7[row][3] = ""+t4.getText();
                    obj.product7[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==8){
                    temp1 = methods.product8[row][0];
                    temp2 = methods.product8[row][1];
                    temp3 = methods.product8[row][2];
                    temp4 = methods.product8[row][3];
                    temp5 = methods.product8[row][4];
                    obj.product8[row][0] = ""+t1.getText();
                    obj.product8[row][1] = ""+methods.size;
                    obj.product8[row][2] = ""+methods.Quantity;
                    obj.product8[row][3] = ""+t4.getText();
                    obj.product8[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==9){
                    temp1 = methods.product9[row][0];
                    temp2 = methods.product9[row][1];
                    temp3 = methods.product9[row][2];
                    temp4 = methods.product9[row][3];
                    temp5 = methods.product9[row][4];
                    obj.product9[row][0] = ""+t1.getText();
                    obj.product9[row][1] = ""+methods.size;
                    obj.product9[row][2] = ""+methods.Quantity;
                    obj.product9[row][3] = ""+t4.getText();
                    obj.product9[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==10){
                    temp1 = methods.product10[row][0];
                    temp2 = methods.product10[row][1];
                    temp3 = methods.product10[row][2];
                    temp4 = methods.product10[row][3];
                    temp5 = methods.product10[row][4];
                    obj.product10[row][0] = ""+t1.getText();
                    obj.product10[row][1] = ""+methods.size;;
                    obj.product10[row][2] = ""+methods.Quantity;
                    obj.product10[row][3] = ""+t4.getText();
                    obj.product10[row][4] = ""+t5.getText();
                }else if(MAIN.cmb.getSelectedIndex()==11){
                    temp1 = methods.product11[row][0];
                    temp2 = methods.product11[row][1];
                    temp3 = methods.product11[row][2];
                    temp4 = methods.product11[row][3];
                    temp5 = methods.product11[row][4];
                    obj.product11[row][0] = ""+t1.getText();
                    obj.product11[row][1] = ""+methods.size;
                    obj.product11[row][2] = ""+methods.Quantity;
                    obj.product11[row][3] = ""+t4.getText();
                    obj.product11[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==12){
                    temp1 = methods.product12[row][0];
                    temp2 = methods.product12[row][1];
                    temp3 = methods.product12[row][2];
                    temp4 = methods.product12[row][3];
                    temp5 = methods.product12[row][4];
                    obj.product12[row][0] = ""+t1.getText();
                    obj.product12[row][1] = ""+methods.size;
                    obj.product12[row][2] = ""+methods.Quantity;
                    obj.product12[row][3] = ""+t4.getText();
                    obj.product12[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==13){
                    temp1 = methods.product13[row][0];
                    temp2 = methods.product13[row][1];
                    temp3 = methods.product13[row][2];
                    temp4 = methods.product13[row][3];
                    temp5 = methods.product13[row][4];
                    obj.product13[row][0] = ""+t1.getText();
                    obj.product13[row][1] = ""+methods.size;
                    obj.product13[row][2] = ""+methods.Quantity;
                    obj.product13[row][3] = ""+t4.getText();
                    obj.product13[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==14){
                    temp1 = methods.product14[row][0];
                    temp2 = methods.product14[row][1];
                    temp3 = methods.product14[row][2];
                    temp4 = methods.product14[row][3];
                    temp5 = methods.product14[row][4];
                    obj.product14[row][0] = ""+t1.getText();
                    obj.product14[row][1] = ""+methods.size;
                    obj.product14[row][2] = ""+methods.Quantity;
                    obj.product14[row][3] = ""+t4.getText();
                    obj.product14[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==15){
                    obj.product15[row][0] = ""+t1.getText();
                    obj.product15[row][1] = ""+methods.size;
                    obj.product15[row][2] = ""+methods.Quantity;
                    obj.product15[row][3] = ""+t4.getText();
                    obj.product15[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==16){
                    obj.product16[row][0] = ""+t1.getText();
                    obj.product16[row][1] = ""+methods.size;
                    obj.product16[row][2] = ""+methods.Quantity;
                    obj.product16[row][3] = ""+t4.getText();
                    obj.product16[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==17){
                    obj.product17[row][0] = ""+t1.getText();
                    obj.product17[row][1] = ""+methods.size;
                    obj.product17[row][2] = ""+methods.Quantity;
                    obj.product17[row][3] = ""+t4.getText();
                    obj.product17[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==18){
                    obj.product18[row][0] = ""+t1.getText();
                    obj.product18[row][1] = ""+methods.size;
                    obj.product18[row][2] = ""+methods.Quantity;
                    obj.product18[row][3] = ""+t4.getText();
                    obj.product18[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==19){
                    obj.product19[row][0] = ""+t1.getText();
                    obj.product19[row][1] = ""+methods.size;
                    obj.product19[row][2] = ""+methods.Quantity;
                    obj.product19[row][3] = ""+t4.getText();
                    obj.product19[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==20){
                    obj.product20[row][0] = ""+t1.getText();
                    obj.product20[row][1] = ""+methods.size;
                    obj.product20[row][2] = ""+methods.Quantity;
                    obj.product20[row][3] = ""+t4.getText();
                    obj.product20[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==21){
                    obj.product21[row][0] = ""+t1.getText();
                    obj.product21[row][1] = ""+methods.size;
                    obj.product21[row][2] = ""+methods.Quantity;
                    obj.product21[row][3] = ""+t4.getText();
                    obj.product21[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==22){
                    obj.product22[row][0] = ""+t1.getText();
                    obj.product22[row][1] = ""+methods.size;
                    obj.product22[row][2] = ""+methods.Quantity;
                    obj.product22[row][3] = ""+t4.getText();
                    obj.product22[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==23){
                    obj.product23[row][0] = ""+t1.getText();
                    obj.product23[row][1] = ""+methods.size;
                    obj.product23[row][2] = ""+methods.Quantity;
                    obj.product23[row][3] = ""+t4.getText();
                    obj.product23[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==24){
                    obj.product24[row][0] = ""+t1.getText();
                    obj.product24[row][1] = ""+methods.size;
                    obj.product24[row][2] = ""+methods.Quantity;
                    obj.product24[row][3] = ""+t4.getText();
                    obj.product24[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==25){
                    obj.product25[row][0] = ""+t1.getText();
                    obj.product25[row][1] = ""+methods.size;
                    obj.product25[row][2] = ""+methods.Quantity;
                    obj.product25[row][3] = ""+t4.getText();
                    obj.product25[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==26){
                    obj.product26[row][0] = ""+t1.getText();
                    obj.product26[row][1] = ""+methods.size;
                    obj.product26[row][2] = ""+methods.Quantity;
                    obj.product26[row][3] = ""+t4.getText();
                    obj.product26[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==27){
                    obj.product27[row][0] = ""+t1.getText();
                    obj.product27[row][1] = ""+methods.size;
                    obj.product27[row][2] = ""+methods.Quantity;
                    obj.product27[row][3] = ""+t4.getText();
                    obj.product27[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==28){
                    obj.product28[row][0] = ""+t1.getText();
                    obj.product28[row][1] = ""+methods.size;
                    obj.product28[row][2] = ""+methods.Quantity;
                    obj.product28[row][3] = ""+t4.getText();
                    obj.product28[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==29){
                    obj.product29[row][0] = ""+t1.getText();
                    obj.product29[row][1] = ""+methods.size;
                    obj.product29[row][2] = ""+methods.Quantity;
                    obj.product29[row][3] = ""+t4.getText();
                    obj.product29[row][4] = ""+t5.getText();
               }else if(MAIN.cmb.getSelectedIndex()==30){
                    obj.product30[row][0] = ""+t1.getText();
                    obj.product30[row][1] = ""+methods.size;
                    obj.product30[row][2] = ""+methods.Quantity;
                    obj.product30[row][3] = ""+t4.getText();
                    obj.product30[row][4] = ""+t5.getText();
               }
                    JOptionPane.showMessageDialog(null,"The data has been update!");
                    model.setValueAt(t1.getText(),row,0);
                    model.setValueAt(t2.getText(),row,1);
                    model.setValueAt(t3.getText(),row,2);
                    model.setValueAt(t4.getText(),row,3);
                    model.setValueAt(t5.getText(),row,4);
                    
    try{
          FileWriter fw = new FileWriter(MAIN.file, true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println("Update Items in "+MAIN.cmb.getSelectedItem());
          pw.println("Before :"+temp1+"  After :"+t1.getText());
          pw.println("Before :"+temp2+"  After :"+t2.getText());
          pw.println("Before :"+temp3+"  After :"+t3.getText());
          pw.println("Before :"+temp4+"  After :"+t4.getText());
          pw.println("Before :"+temp5+"  After :"+t5.getText());
          
          
          pw.close();
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR");
    }
    dispose();
    
        }
                    
    }       
            
            
            
        
          
            
                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed
    
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    public static javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
