/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOTravelling;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OOTravels extends javax.swing.JFrame {

    double Gross;
    cFlight cost = new cFlight();
    
    public OOTravels() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtxtPostCode = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtFirstname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jrbSingle = new javax.swing.JRadioButton();
        jrbStandard = new javax.swing.JRadioButton();
        jrbEconomy = new javax.swing.JRadioButton();
        jrbFirstClass = new javax.swing.JRadioButton();
        jrbReturn = new javax.swing.JRadioButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jlblFirstClass = new javax.swing.JLabel();
        jlblStandard = new javax.swing.JLabel();
        jlblEconomy = new javax.swing.JLabel();
        jlblSingle = new javax.swing.JLabel();
        jlblReturn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jrbTax = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jlblSubtotal = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        jtxReciept = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnTotal = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnReceipt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jchkAirportTax = new javax.swing.JCheckBox();
        jchkInsurance = new javax.swing.JCheckBox();
        jchkExtLuggage = new javax.swing.JCheckBox();
        jcmbDeparture = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jcmbDestination = new javax.swing.JComboBox<>();
        jchkAirMiles = new javax.swing.JCheckBox();
        jcmbAccomodation = new javax.swing.JComboBox<>();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Travel Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\myjuw.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\myjuw.jpg")); // NOI18N
        jLabel10.setText("jLabel2");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\myjuw.jpg")); // NOI18N
        jLabel11.setText("jLabel2");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1340, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Post Code");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));
        jPanel2.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, 30));

        jtxtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSurnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Surname");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 57, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));
        jPanel2.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("First Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        jtxtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Phone no");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jtxtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("E-Mail");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));
        jPanel2.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 410, 280));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbSingle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSingle.setText("Single");
        jPanel3.add(jrbSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jrbStandard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbStandard.setText("Standard");
        jrbStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbStandardActionPerformed(evt);
            }
        });
        jPanel3.add(jrbStandard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jrbEconomy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbEconomy.setText("Economy");
        jrbEconomy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEconomyActionPerformed(evt);
            }
        });
        jPanel3.add(jrbEconomy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jrbFirstClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbFirstClass.setText("First Class");
        jrbFirstClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFirstClassActionPerformed(evt);
            }
        });
        jPanel3.add(jrbFirstClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jrbReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbReturn.setText("Return");
        jPanel3.add(jrbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setText("Special need");
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jlblFirstClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblFirstClass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblFirstClass.setText("0");
        jlblFirstClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.add(jlblFirstClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 130, 30));

        jlblStandard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblStandard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblStandard.setText("0");
        jlblStandard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.add(jlblStandard, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, 30));

        jlblEconomy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblEconomy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblEconomy.setText("0");
        jlblEconomy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.add(jlblEconomy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 30));

        jlblSingle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSingle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblSingle.setText("0");
        jlblSingle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.add(jlblSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 130, 30));

        jlblReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblReturn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblReturn.setText("0");
        jlblReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.add(jlblReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 530, 280));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 320, 220));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Tellephone");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Post Code");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Address");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 40));

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox6.setText("jCheckBox1");
        jPanel9.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox7.setText("jCheckBox1");
        jPanel9.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox8.setText("jCheckBox1");
        jPanel9.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox9.setText("jCheckBox1");
        jPanel9.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel9.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel9.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, -1));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel9.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 440, 280));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 320, 220));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Tellephone");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Post Code");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Address");
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 40));

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox10.setText("jCheckBox1");
        jPanel12.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox11.setText("jCheckBox1");
        jPanel12.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox12.setText("jCheckBox1");
        jPanel12.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox13.setText("jCheckBox1");
        jPanel12.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel12.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel12.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, -1));

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel12.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, -1));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 440, 280));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 320, 220));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Tellephone");
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Post Code");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Address");
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 40));

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox14.setText("jCheckBox1");
        jPanel13.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox15.setText("jCheckBox1");
        jPanel13.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jCheckBox16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox16.setText("jCheckBox1");
        jPanel13.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jCheckBox17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox17.setText("jCheckBox1");
        jPanel13.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel13.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel13.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, -1));

        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel13.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, -1));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 440, 280));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Total");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Sub Total");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));

        jrbTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbTax.setText("Tax");
        jPanel5.add(jrbTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.add(jlblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 30));

        jlblSubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.add(jlblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 130, 30));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.add(jlblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 400, 190));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtReceipt.setColumns(20);
        jtxtReceipt.setRows(5);
        jtxtReceipt.setBorder(null);
        jScrollPane1.setViewportView(jtxtReceipt);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 420));

        jtxReciept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxReciept.setText("Receipt");
        jPanel6.add(jtxReciept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Heathrow", "Gatwick", "DFW Airport", "Oslo Airport", "Nairobi Airport", "MM  Airport", " " }));
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 370, 480));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 20, 80, 40));

        jbtnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnTotal.setText("Total");
        jbtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 40));

        jbtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReceipt.setText("Receipt");
        jbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceiptActionPerformed(evt);
            }
        });
        jPanel7.add(jbtnReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\myjuws.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 60, 60));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 780, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Accomodation");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Destination");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jchkAirportTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jchkAirportTax.setText("Airport Tax");
        jPanel4.add(jchkAirportTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jchkInsurance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jchkInsurance.setText("Travelling Insurance");
        jPanel4.add(jchkInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jchkExtLuggage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jchkExtLuggage.setText("Ext Luggage");
        jPanel4.add(jchkExtLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jcmbDeparture.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbDeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "karachi Airport", "Lahore Airport", "Islmabad  Airport", "Dubai Airport", "China Airport", "Saudia  Airport", " " }));
        jcmbDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDepartureActionPerformed(evt);
            }
        });
        jPanel4.add(jcmbDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 300, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Departure");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 40));

        jcmbDestination.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "fairy medos-7 Days in pakistan", "Lahore-7 Days in pakistan", "Makkah-7 Days in saudia", "Sharjah-7 Days in Dubai", "AbuDhabi-5 Days in Dubai", "ayubia- 5 Days in pakistan", "Madina- 5 Days in Saudia Arabia", "Naran Kaghan- 5 Days in pakistan", "Gilgit- 5 Days in pakistan", "Ajman-3 Days in Dubai", "Hunza-3 Days in pakistan", "Jeddah-3 Days in saudia" }));
        jcmbDestination.setEnabled(false);
        jcmbDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDestinationActionPerformed(evt);
            }
        });
        jPanel4.add(jcmbDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 300, -1));

        jchkAirMiles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jchkAirMiles.setText("Air Miles Over 20000");
        jPanel4.add(jchkAirMiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jcmbAccomodation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbAccomodation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Single", "Double", "Extra", " " }));
        jcmbAccomodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbAccomodationActionPerformed(evt);
            }
        });
        jPanel4.add(jcmbAccomodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 520, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        cQuit cExit = new cQuit() ;
        cExit.quit() ; 

    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceiptActionPerformed
        
       Calendar timer = Calendar.getInstance();
       timer.getTime();
       SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
       String iTime = (tTime.format(timer.getTime()));
       
       SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
       String iDate = (Tdate.format(timer.getTime()));
        
        int num1;
        String ref = "";
        num1 = 1325 + (int)(Math.random()*4238);
        ref += num1 + 1325;
        //========================================================================================
        String Firstname = (jtxtFirstname.getText());
        String Surname = (jtxtSurname.getText());
        String address = (jtxtAddress.getText());
        String postcode = (jtxtPostCode.getText());
        String Phone_no = (jtxtPhone.getText());
        String Email = (jtxtEmail.getText());
        String rTax = (jlblTax.getText());
        String rSubtotal = (jlblSubtotal.getText());
        String rTotal = (jlblTotal.getText());
        
        jtxtReceipt.append("\t Travel Management System:\n\n"
                +"\n Ref:\t\t\t "+ref
        +"\n========================================================================================="
        +"\nName:\t\t"+Firstname
        +"\nSurname:\t\t"+Surname
        +"\nAddress:\t\t"+address
        +"\nPostCode:\t\t"+postcode
        +"\nPhone_no:\t\t"+Phone_no
        +"\nEmail:\t\t"+Email
        +"\nTax:\t\t"+rTax
        +"\nSubTotal:\t\t"+rSubtotal
        +"\nTotal:\t\t"+rTotal
        +"\n=========================================================================================="
        +"\n Date:"+ iDate +"\tTime:" + iTime
        +"\n\n Thanks For Using \n Travel Management System"
        );
        
        
    
    }//GEN-LAST:event_jbtnReceiptActionPerformed

    private void jtxtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPhoneActionPerformed

    private void jtxtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstnameActionPerformed

    private void jtxtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSurnameActionPerformed

    private void jbtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotalActionPerformed
        // TODO add your handling code here:
       
        cCostTax iTax = new cCostTax() ; 
        double iTaxes, subtotal, total;
        
        
        if(jrbReturn.isSelected())
        {
            subtotal = Gross*2;
            String isubtotal = String.format("$%.2f",subtotal);
            jlblSubtotal.setText(isubtotal);
            
            iTaxes = iTax.cFindTax(subtotal);
            String Tax = String.format("$%.2f", iTaxes);
            jlblTax.setText(Tax);
       
            String iTotal = String.format("$%.2f",subtotal + iTaxes);
            jlblTotal.setText(iTotal);
            
            jlblReturn.setText(isubtotal);
        }    
        else
        {
            subtotal = Gross;
            String isubtotal = String.format("$%.2f",subtotal);
            jlblSubtotal.setText(isubtotal);
            
            iTaxes = iTax.cFindTax(subtotal);
            String Tax = String.format("$%.2f", iTaxes);
            jlblTax.setText(Tax);
       
            String iTotal = String.format("$%.2f",subtotal + iTaxes);
            jlblTotal.setText(iTotal);
        }
    }//GEN-LAST:event_jbtnTotalActionPerformed

    private void jcmbAccomodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbAccomodationActionPerformed
        
        
        

    }//GEN-LAST:event_jcmbAccomodationActionPerformed

    private void jrbStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbStandardActionPerformed
       if(jrbStandard.isSelected() == true)
       {
           jcmbDestination.setEnabled(true);
           jrbEconomy.setSelected(false);
           jrbFirstClass.setSelected(false);
           jlblEconomy.setText("0");
           jlblFirstClass.setText("0");
           jlblSingle.setText("0");
           jlblReturn.setText("0");
       }
        if(jrbStandard.isSelected() == false)
       {
           jcmbDestination.setSelectedItem("None");
           jcmbDestination.setEnabled(false);
           jlblStandard.setText("0");
           
       }
    }//GEN-LAST:event_jrbStandardActionPerformed

    private void jcmbDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbDepartureActionPerformed
    /*
    setting cost format and destinations...if any of the item is selected 
    */
    private void jcmbDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDestinationActionPerformed
        // TODO add your handling code here:
        
        if ((jcmbDestination.getSelectedItem().equals("fairy medos-7 Days in pakistan")) && jrbStandard.isSelected())
{
            Gross = cost.Fairy_maidows;
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Lahore-7 Days in pakistan")) && jrbStandard.isSelected())
{
            Gross = cost.Lahore;
            String Costs = String.format("$%.2f",Gross );
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  

        if ((jcmbDestination.getSelectedItem().equals("Makkah-7 Days in saudia")) && jrbStandard.isSelected())
{
            Gross = cost.Makkah;
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Sharjah-7 Days in Dubai")) && jrbStandard.isSelected())
{
            Gross = cost.Sharjah;
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("AbuDhabi-5 Days in Dubai")) && jrbStandard.isSelected())
{
            Gross = cost.AbuDhabi;
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("ayubia- 5 Days in pakistan")) && jrbStandard.isSelected())
{
            Gross = cost.Ayubia;
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Madina- 5 Days in Saudia Arabia")) && jrbStandard.isSelected())
{
           Gross = cost.Madina; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Naran Kaghan- 5 Days in pakistan")) && jrbStandard.isSelected())
{
             Gross = cost.Naran_Kaghan; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Gilgit- 5 Days in pakistan")) && jrbStandard.isSelected())
{
             Gross = cost.Gilgit; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Ajman-3 Days in Dubai")) && jrbStandard.isSelected())
{
             Gross = cost.Ajman; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Hunza-3 Days in pakistan")) && jrbStandard.isSelected())
{
             Gross = cost.Hunza; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
         if ((jcmbDestination.getSelectedItem().equals("Jeddah-3 Days in saudia")) && jrbStandard.isSelected())
{
             Gross = cost.Jeddah; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
            
}   
        
        //===== ================================================================================================================================
       if ((jcmbDestination.getSelectedItem().equals("fairy medos-7 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Fairy_maidows; 
            String Costs = String.format("$%.2f",Gross);
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Lahore-7 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Lahore; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  

        if ((jcmbDestination.getSelectedItem().equals("Makkah-7 Days in saudia")) && jrbEconomy.isSelected())
{
            Gross = cost.Makkah; 
            String Costs = String.format("$%.2f",Gross);
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Sharjah-7 Days in Dubai")) && jrbEconomy.isSelected())
{
            Gross = cost.Sharjah; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("AbuDhabi-5 Days in Dubai")) && jrbEconomy.isSelected())
{
            Gross = cost.AbuDhabi; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("ayubia- 5 Days in pakistan")) && jrbEconomy.isSelected())
{
           Gross = cost.Ayubia; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Madina- 5 Days in Saudia Arabia")) && jrbEconomy.isSelected())
{
            Gross = cost.Madina; 
            String Costs = String.format("$%.2f",Gross);
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Naran Kaghan- 5 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Naran_Kaghan; 
            String Costs = String.format("$%.2f",Gross );
            jlblStandard.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Gilgit- 5 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Gilgit; 
            String Costs = String.format("$%.2f",Gross);
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Ajman-3 Days in Dubai")) && jrbEconomy.isSelected())
{
            Gross = cost.Ajman; 
            String Costs = String.format("$%.2f",Gross);
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Hunza-3 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Hunza; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}
        if ((jcmbDestination.getSelectedItem().equals("Jeddah-3 Days in pakistan")) && jrbEconomy.isSelected())
{
            Gross = cost.Jeddah; 
            String Costs = String.format("$%.2f",Gross );
            jlblEconomy.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}
      //==========================================================================================
      if ((jcmbDestination.getSelectedItem().equals("fairy medos-7 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Fairy_maidows; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Lahore-7 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Lahore; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  

        if ((jcmbDestination.getSelectedItem().equals("Makkah-7 Days in saudia")) && jrbFirstClass.isSelected())
{
            Gross = cost.Makkah; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Sharjah-7 Days in Dubai")) && jrbFirstClass.isSelected())
{
            Gross = cost.Sharjah; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("AbuDhabi-5 Days in Dubai")) && jrbFirstClass.isSelected())
{
            Gross = cost.AbuDhabi; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("ayubia- 5 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Ayubia; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Madina- 5 Days in Saudia Arabia")) && jrbFirstClass.isSelected())
{
            Gross = cost.Madina; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Naran Kaghan- 5 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Naran_Kaghan; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Gilgit- 5 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Gilgit; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        
        if ((jcmbDestination.getSelectedItem().equals("Ajman-3 Days in Dubai")) && jrbFirstClass.isSelected())
{
            Gross = cost.Ajman; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}  
        if ((jcmbDestination.getSelectedItem().equals("Hunza-3 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Hunza; 
            String Costs = String.format("$%.2f",Gross );
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}
        if ((jcmbDestination.getSelectedItem().equals("Jeddah-3 Days in pakistan")) && jrbFirstClass.isSelected())
{
            Gross = cost.Jeddah; 
            String Costs = String.format("$%.2f",Gross);
            jlblFirstClass.setText(Costs);
            jlblSingle.setText(Costs);
            jrbSingle.setSelected(true);
}
            
  
    }//GEN-LAST:event_jcmbDestinationActionPerformed
 
    
    
    
    
    private void jrbEconomyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEconomyActionPerformed
        // TODO add your handling code here:
        if(jrbEconomy.isSelected() == true)
       {
           jcmbDestination.setEnabled(true);
           jrbStandard.setSelected(false);
           jrbFirstClass.setSelected(false);
           jlblStandard.setText("0");
           jlblFirstClass.setText("0");
           jlblSingle.setText("0");
           jlblReturn.setText("0");
       }
        if(jrbEconomy.isSelected() == false)
       {
           jcmbDestination.setSelectedItem("None");
           jcmbDestination.setEnabled(false);
           jlblEconomy.setText("0");
           
       }
    }//GEN-LAST:event_jrbEconomyActionPerformed

    private void jrbFirstClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFirstClassActionPerformed
        if(jrbFirstClass.isSelected() == true)
       {
           jcmbDestination.setEnabled(true);
           jrbStandard.setSelected(false);
           jrbEconomy.setSelected(false);
           jlblStandard.setText("0");
           jlblEconomy.setText("0");
           jlblSingle.setText("0");
           jlblReturn.setText("0");
       }
        if(jrbFirstClass.isSelected() == false)
       {
           jcmbDestination.setSelectedItem("None");
           jcmbDestination.setEnabled(false);
           jlblFirstClass.setText("0");
           
       }
    }//GEN-LAST:event_jrbFirstClassActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtFirstname.setText(null) ;
        jlblTax.setText(null) ;
        jlblSubtotal.setText(null) ;
        jlblTotal.setText(null) ;
        jtxtFirstname.setText(null) ;
        jtxtPostCode.setText(null) ;
        jtxtSurname.setText(null) ;
        jtxtAddress.setText(null) ;
        jtxtPhone.setText(null) ;
        jtxtEmail.setText(null) ;
        jtxReciept.setText("None") ;
        jcmbDeparture.setSelectedItem("None") ;
        jcmbAccomodation.setSelectedItem("None") ;
        jcmbDestination.setSelectedItem("None") ;
        jrbStandard.setSelected(false) ;
        jrbEconomy.setSelected(false) ;
        jrbFirstClass.setSelected(false) ;
        jrbSingle.setSelected(false) ;
        jrbReturn.setSelected(false) ;
        jchkAirportTax.setSelected(false) ;
        jchkInsurance.setSelected(false) ;
        jchkAirMiles.setSelected(false) ;
        jchkExtLuggage.setSelected(false) ;
        jlblStandard.setText("0");
        jlblEconomy.setText("0");
        jlblFirstClass.setText("0");
        jlblSingle.setText("0");
        jlblReturn.setText("0");
        
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(OOTravels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OOTravels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OOTravels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OOTravels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OOTravels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReceipt;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotal;
    private javax.swing.JCheckBox jchkAirMiles;
    private javax.swing.JCheckBox jchkAirportTax;
    private javax.swing.JCheckBox jchkExtLuggage;
    private javax.swing.JCheckBox jchkInsurance;
    private javax.swing.JComboBox<String> jcmbAccomodation;
    private javax.swing.JComboBox<String> jcmbDeparture;
    private javax.swing.JComboBox<String> jcmbDestination;
    private javax.swing.JLabel jlblEconomy;
    private javax.swing.JLabel jlblFirstClass;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSingle;
    private javax.swing.JLabel jlblStandard;
    private javax.swing.JLabel jlblSubtotal;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JRadioButton jrbEconomy;
    private javax.swing.JRadioButton jrbFirstClass;
    private javax.swing.JRadioButton jrbReturn;
    private javax.swing.JRadioButton jrbSingle;
    private javax.swing.JRadioButton jrbStandard;
    private javax.swing.JLabel jrbTax;
    private javax.swing.JLabel jtxReciept;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPhone;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField jtxtSurname;
    // End of variables declaration//GEN-END:variables
}
