package KAROJOMA;
import Model.methods;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MAIN extends javax.swing.JFrame {
public static File file = new File("Data.txt");
public static String p1 = "";
public static String pass1 = "";
public static String pass2 = ""; 
public static String pass3 = "";
public static String pass4 = "";
public static String pass5 = "";
        public static Calendar Ttime =  Calendar.getInstance();
        public static SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss");
        public static SimpleDateFormat Date = new SimpleDateFormat("MMM:dd:yyyy");
 public static void readFile()throws FileNotFoundException{
     String data = " ";
     Scanner s1 = new Scanner(new File("Data.txt"));
  
        while(s1.hasNextLine()){
          data = data + s1.nextLine() + "\n";
        }
         logs.setText(data);
   }
 
        public MAIN(){
        methods obj = new methods();
        obj.table1(table);
        initComponents();
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnllogin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        pnlsad = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlInventory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        pnlAddProduct = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addP = new javax.swing.JTextField();
        pnlLogs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTextArea();
        pnldash = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        btn_inve = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_logs = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlContainer.setLayout(new java.awt.CardLayout());

        pnllogin.setBackground(new java.awt.Color(51, 255, 255));
        pnllogin.setRequestFocusEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PASSWORD :");

        user.setBackground(new Color(0,0,0,0));
        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME :");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminlogo.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("LOGIN");
        jButton9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sidelogo.jpg"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        pass.setBackground(new Color(0,0,0,0));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlloginLayout = new javax.swing.GroupLayout(pnllogin);
        pnllogin.setLayout(pnlloginLayout);
        pnlloginLayout.setHorizontalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloginLayout.createSequentialGroup()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlloginLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlloginLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloginLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        pnlloginLayout.setVerticalGroup(
            pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloginLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(pnlloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pnlContainer.add(pnllogin, "card2");

        pnlsad.setBackground(new java.awt.Color(0, 153, 153));
        pnlsad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainlogo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlContent.add(pnlHome, "card2");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NAME", "SIZE", "QUANTITY", "DATE SUPPLY", "SUPPLIER "
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton5.setText("UPDATE");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT PRODUCTS" }));
        cmb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });

        jButton7.setText("ADD ITEM");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInventoryLayout = new javax.swing.GroupLayout(pnlInventory);
        pnlInventory.setLayout(pnlInventoryLayout);
        pnlInventoryLayout.setHorizontalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(pnlInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInventoryLayout.setVerticalGroup(
            pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlContent.add(pnlInventory, "card3");

        jButton6.setText("SAVE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("NAME OF PRODUCT:");

        javax.swing.GroupLayout pnlAddProductLayout = new javax.swing.GroupLayout(pnlAddProduct);
        pnlAddProduct.setLayout(pnlAddProductLayout);
        pnlAddProductLayout.setHorizontalGroup(
            pnlAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProductLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(addP, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        pnlAddProductLayout.setVerticalGroup(
            pnlAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddProductLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(pnlAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pnlContent.add(pnlAddProduct, "card4");

        logs.setColumns(20);
        logs.setRows(5);
        jScrollPane2.setViewportView(logs);

        javax.swing.GroupLayout pnlLogsLayout = new javax.swing.GroupLayout(pnlLogs);
        pnlLogs.setLayout(pnlLogsLayout);
        pnlLogsLayout.setHorizontalGroup(
            pnlLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
        pnlLogsLayout.setVerticalGroup(
            pnlLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pnlContent.add(pnlLogs, "card5");

        pnlsad.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 480, 410));

        pnldash.setBackground(new java.awt.Color(0, 153, 153));
        pnldash.setLayout(new java.awt.GridLayout(5, 0, 2, 15));

        home.setBackground(new java.awt.Color(153, 153, 153));
        home.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setOpaque(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        pnldash.add(home);

        btn_inve.setBackground(new java.awt.Color(153, 153, 153));
        btn_inve.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_inve.setText("Inventory");
        btn_inve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inve.setOpaque(false);
        btn_inve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inveActionPerformed(evt);
            }
        });
        pnldash.add(btn_inve);

        btn_add.setBackground(new java.awt.Color(153, 153, 153));
        btn_add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_add.setText("Add Product");
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_add.setOpaque(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        pnldash.add(btn_add);

        btn_logs.setBackground(new java.awt.Color(153, 153, 153));
        btn_logs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_logs.setText("Logs");
        btn_logs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logs.setOpaque(false);
        btn_logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logsActionPerformed(evt);
            }
        });
        pnldash.add(btn_logs);

        btnlogout.setBackground(new java.awt.Color(153, 153, 153));
        btnlogout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnlogout.setText("Log-out");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.setOpaque(false);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        pnldash.add(btnlogout);

        pnlsad.add(pnldash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 410));

        jLabel1.setBackground(new Color (0,0,0,0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("  X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlsad.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 50, 60));

        jLabel5.setBackground(new Color (0,0,0,0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("     _");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        pnlsad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 50, 60));

        pnlContainer.add(pnlsad, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(639, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        home.setBackground(new Color(51,51,51));
        btn_inve.setBackground(new Color (153,153,153));
        btn_add.setBackground(new Color (153,153,153));
        btn_logs.setBackground(new Color (153,153,153));
        pnlContent.removeAll();
        pnlContent.add(pnlHome);
        revalidate();
        repaint();
    }//GEN-LAST:event_homeActionPerformed

    private void btn_inveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inveActionPerformed
        home.setBackground(new Color(153,153,153));
        btn_inve.setBackground(new Color (51,51,51));
        btn_add.setBackground(new Color (153,153,153));
        btn_logs.setBackground(new Color (153,153,153));
        cmb.setSelectedIndex(0);
        pnlContent.removeAll();
        pnlContent.add(pnlInventory);
        revalidate();
        repaint();   
    }//GEN-LAST:event_btn_inveActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        btn_add.setBackground(new Color(51,51,51));
        btn_inve.setBackground(new Color (153,153,153));
        home.setBackground(new Color (153,153,153));
        btn_logs.setBackground(new Color (153,153,153));
        pnlContent.removeAll();
        pnlContent.add(pnlAddProduct);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logsActionPerformed
        btn_logs.setBackground(new Color(51,51,51));
        btn_inve.setBackground(new Color (153,153,153));
        btn_add.setBackground(new Color (153,153,153));
        home.setBackground(new Color (153,153,153));
    try {
        readFile();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
    }
  
        pnlContent.removeAll();
        pnlContent.add(pnlLogs);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_logsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
        if(table.getSelectedRow()>=0&&cmb.getSelectedIndex()>=1){
            if(cmb.getSelectedIndex()==1&&methods.product1[table.getSelectedRow()][0]==null){
                 JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==2&&methods.product2[table.getSelectedRow()][0]==null){    
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==3&&methods.product3[table.getSelectedRow()][0]==null){    
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==4&&methods.product4[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==5&&methods.product5[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==6&&methods.product6[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==7&&methods.product7[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==8&&methods.product8[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==9&&methods.product9[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==10&&methods.product10[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else if(cmb.getSelectedIndex()==11&&methods.product11[table.getSelectedRow()][0]==null){
                JOptionPane.showMessageDialog(null,"Selected row is empty!");
            }else{
                
             Update obj = new Update();
             obj.setVisible(true);      
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please select row to update or product! ");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
        methods obj = new methods();
        if(cmb.getSelectedIndex()==0){
            try{   
                for(int i = 0;i<=obj.product1.length;i++){  
                    table.setValueAt( null, i, 0);
                    table.setValueAt( null, i, 1);
                    table.setValueAt( null, i, 2);
                    table.setValueAt( null, i, 3);
                    table.setValueAt( null, i, 4);
                }
            }catch(Exception e){}
        }else{
            obj.table1(table);
        }
        
    }//GEN-LAST:event_cmbActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(cmb.getSelectedIndex()>0){
            Add obj= new Add();
            obj.setVisible(true);
        }else{
          JOptionPane.showMessageDialog(null,"Please Select Item");   
         }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(addP.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Invalid Input");
        }else{
            cmb.addItem(addP.getText());
            JOptionPane.showMessageDialog(null,"Success");
            pnlContent.removeAll();
            pnlContent.add(pnlAddProduct);
        }
        
        try{
        
          FileWriter fw = new FileWriter(file , true);
          PrintWriter pw = new PrintWriter(fw);
          
          pw.println(addP.getText());
          pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR");
        } 
        
        
        addP.setText("");
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        methods obj=new methods();
        
        if(obj.admin[0].equals(user.getText())&&obj.admin[1].equals(pass.getText())){ 
              JOptionPane.showMessageDialog(null,"Success log-in");   

     try{
          FileWriter fw = new FileWriter(file , true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println(user.getText()+"  Login Time :"+Date.format(Ttime.getTime())+" "+Time.format(Ttime.getTime()));
          pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR");
        }
            home.setBackground(new Color(51,51,51));
            pnlContainer.removeAll();
            pnlContainer.add(pnlsad);
            pnlContent.removeAll();
            pnlContent.add(pnlHome);
             user.setText("");
             pass.setText("");
             revalidate();
             repaint();
        }else{
         JOptionPane.showMessageDialog(null,"Invalid Account");   
         user.setText("");
         pass.setText("");
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        btn_add.setBackground(new Color(153,153,153));
        btn_inve.setBackground(new Color (153,153,153));
        home.setBackground(new Color (153,153,153));
        btn_logs.setBackground(new Color (153,153,153));
        try{
          FileWriter fw = new FileWriter(file , true);
          PrintWriter pw = new PrintWriter(fw);
          pw.println("jano"+"  Logout Time :"+Date.format(Ttime.getTime())+" "+Time.format(Ttime.getTime()));
          pw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR");
        }

        pnlContainer.removeAll();
        pnlContainer.add(pnllogin);
        revalidate();
        repaint();
//        showPanels(pnllogin);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addP;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_inve;
    private javax.swing.JButton btn_logs;
    private javax.swing.JButton btnlogout;
    public static javax.swing.JComboBox cmb;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea logs;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel pnlAddProduct;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlInventory;
    private javax.swing.JPanel pnlLogs;
    private javax.swing.JPanel pnldash;
    private javax.swing.JPanel pnllogin;
    private javax.swing.JPanel pnlsad;
    public static javax.swing.JTable table;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    public void showPanels(JPanel p){
        pnlContent.removeAll();
        pnlContent.add(p);
        pnllogin.add(p);
        revalidate();
        repaint();
    }

}
