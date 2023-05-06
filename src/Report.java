/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l0l
 */
public class Report extends javax.swing.JFrame {
        String position;
    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        Connect();
        table();
        
    }
    // establish the connection
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    ResultSetMetaData res;
    // make connection
    public void Connect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grade_system_management","root","");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // display table
    private void table(){
        try{
            int i;
            pst= con.prepareStatement("select * from report");
            
            rs= pst.executeQuery();
            res= rs.getMetaData();
            i = res.getColumnCount();
            
            DefaultTableModel Df= (DefaultTableModel)tbl_display.getModel();
            Df.setRowCount(0);
            
            while(rs.next()){
                Vector v= new Vector();
                for(int j=1; j<=i; j++){
                    v.add(rs.getInt("id"));
                    v.add(rs.getInt("stid"));
                    v.add(rs.getString("term"));
                    v.add(rs.getDouble("math"));
                    v.add(rs.getDouble("english"));
                    v.add(rs.getDouble("science"));
                    v.add(rs.getDouble("kinyarwanda")); 
                    v.add(rs.getDouble("social_study"));
                    v.add(rs.getDouble("french"));
                    v.add(rs.getDouble("total"));
                    v.add(rs.getDouble("percentage"));
                    v.add(rs.getString("position"));
                    
                }
                Df.addRow(v);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        st_id = new javax.swing.JTextField();
        termtxt = new javax.swing.JComboBox<>();
        mathtxt = new javax.swing.JTextField();
        englishtxt = new javax.swing.JTextField();
        sciencetxt = new javax.swing.JTextField();
        kinytxt = new javax.swing.JTextField();
        socialtxt = new javax.swing.JTextField();
        frenchtxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        stubtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_display = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REPORT PORTAL");

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Math");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Term");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("English");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Science");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Kinyarwanda");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Social Study");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("French");

        st_id.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        termtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        termtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        mathtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        englishtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        sciencetxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        kinytxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        socialtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        frenchtxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        savebtn.setBackground(new java.awt.Color(0, 255, 0));
        savebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        savebtn.setText("INSERT");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 102, 255));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(255, 0, 0));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewbtn.setText("VIEW");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        stubtn.setBackground(new java.awt.Color(51, 255, 102));
        stubtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stubtn.setText("STUDENTS");
        stubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stubtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(termtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(608, 608, 608))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(16, 16, 16))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(englishtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sciencetxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kinytxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mathtxt)
                                    .addComponent(socialtxt)
                                    .addComponent(frenchtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(savebtn)
                                    .addComponent(deletebtn))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stubtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(st_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mathtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(englishtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sciencetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kinytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(socialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(frenchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(updatebtn)
                    .addComponent(stubtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn)
                    .addComponent(resetbtn)
                    .addComponent(viewbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DISPLAY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        tbl_display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "stid", "Term", "Math", "English", "Science", "Kinyarwanda", "Social Studies", "French", "TOTAL", "%", "Position"
            }
        ));
        tbl_display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_displayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_display);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        try {
            st_id.setText("");
            mathtxt.setText("");
            englishtxt.setText("");
            sciencetxt.setText("");
            kinytxt.setText("");
            socialtxt.setText("");
            frenchtxt.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_resetbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        try { 
            int stId = Integer.parseInt(st_id.getText());
            double math = Double.parseDouble(mathtxt.getText());
            double english = Double.parseDouble(englishtxt.getText());
            double science = Double.parseDouble(sciencetxt.getText());
            double kiny = Double.parseDouble(kinytxt.getText());
            double social = Double.parseDouble(socialtxt.getText());
            double french = Double.parseDouble(frenchtxt.getText());
            String term = termtxt.getSelectedItem().toString();

            double total = math + english + science + kiny + social + french;
            double percentage = total * 100 / 600;
    // Check if any of the required fields are empty
    if (st_id.getText().trim().isEmpty() || mathtxt.getText().trim().isEmpty()
            || englishtxt.getText().trim().isEmpty() || sciencetxt.getText().trim().isEmpty()
            || kinytxt.getText().trim().isEmpty() || socialtxt.getText().trim().isEmpty()
            || frenchtxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required");
    } else if(st_id.getText().length()!= 5){
        JOptionPane.showMessageDialog(this, "Student ID Should be 5 characters","Error",JOptionPane.ERROR_MESSAGE);
                st_id.setText("");
    }
    else {
        
        
        if (percentage >= 90 && percentage <= 100) {
        position = "Grand Distinction";
        } else if (percentage >= 80 && percentage < 90) {
            position = "Distinction";
        } else if (percentage >= 70 && percentage < 80) {
            position = "Fair";
        } else if (percentage >= 60 && percentage < 70) {
            position = "Pass";
        } else {
            position = "Fail";
        }
        // check if the user exist
        String query = "select * from students where stid= ?";
        pst = con.prepareStatement(query);
        pst.setInt(1,stId);
        rs = pst.executeQuery();
        
        if(rs.next()){
            
            // Create a PreparedStatement with the SQL query string
        pst = con.prepareStatement("INSERT INTO report (id, stid, term, math, english, science, kinyarwanda, social_study, french, total, percentage, position) VALUES(null,?,?,?,?,?,?,?,?,?,?,?)");
        
        // Set the values for each placeholder in the SQL query string
        
        pst.setInt(1, stId);
        pst.setString(2, term);
        pst.setDouble(3, math);
        pst.setDouble(4, english);
        pst.setDouble(5, science);
        pst.setDouble(6, kiny);
        pst.setDouble(7, social);
        pst.setDouble(8, french);
        pst.setDouble(9, total);
        pst.setDouble(10, percentage);
        pst.setString(11, position);

        // Execute the query and check if any rows were affected
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected >= 1) {
            JOptionPane.showMessageDialog(null, "Saved");
            table();
            st_id.setText("");
            termtxt.setSelectedItem("");
            mathtxt.setText("");
            englishtxt.setText("");
            sciencetxt.setText("");
            kinytxt.setText("");
            socialtxt.setText("");
            frenchtxt.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to save");
                }
            }else{
            JOptionPane.showMessageDialog(null, "Student does not exist");
            st_id.setText("");
        }
        }
        
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }//GEN-LAST:event_savebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try {
            
        // Check if any of the required fields are empty
    if (st_id.getText().trim().isEmpty() || mathtxt.getText().trim().isEmpty()
            || englishtxt.getText().trim().isEmpty() || sciencetxt.getText().trim().isEmpty()
            || kinytxt.getText().trim().isEmpty() || socialtxt.getText().trim().isEmpty()
            || frenchtxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required");
    }else if(st_id.getText().length()!= 5){
        JOptionPane.showMessageDialog(this, "Student ID Should be 5 characters","Error",JOptionPane.ERROR_MESSAGE);
                st_id.setText("");
    }
    else {
        DefaultTableModel Df= (DefaultTableModel)tbl_display.getModel();
        int selectedIndex= tbl_display.getSelectedRow();
        int stId = Integer.parseInt(st_id.getText());
        double math = Double.parseDouble(mathtxt.getText());
        double english = Double.parseDouble(englishtxt.getText());
        double science = Double.parseDouble(sciencetxt.getText());
        double kiny = Double.parseDouble(kinytxt.getText());
        double social = Double.parseDouble(socialtxt.getText());
        double french = Double.parseDouble(frenchtxt.getText());
        String term = termtxt.getSelectedItem().toString();

        double total = math + english + science + kiny + social + french;
        double percentage = total * 100 / 600;
        
        if (percentage >= 90 && percentage <= 100) {
        position = "Grand Distinction";
        } else if (percentage >= 80 && percentage < 90) {
            position = "Distinction";
        } else if (percentage >= 70 && percentage < 80) {
            position = "Fair";
        } else if (percentage >= 60 && percentage < 70) {
            position = "Pass";
        } else {
            position = "Fail";
        }
        // check if the user exist
        String query = "select * from students where stid= ?";
        pst = con.prepareStatement(query);
        pst.setInt(1,stId);
        rs = pst.executeQuery();
        
        if(rs.next()){
            // Create a PreparedStatement with the SQL query string
        String value= (tbl_display.getModel().getValueAt(selectedIndex,0).toString());
        pst = con.prepareStatement("update report set stid=?, term=?, math=?, english=?, science=?, kinyarwanda=?, social_study=?, french=?, total=?, percentage=?, position=? where id ='"+value+"' ");
        
        // Set the values for each placeholder in the SQL query string
        pst.setInt(1, stId);
        pst.setString(2, term);
        pst.setDouble(3, math);
        pst.setDouble(4, english);
        pst.setDouble(5, science);
        pst.setDouble(6, kiny);
        pst.setDouble(7, social);
        pst.setDouble(8, french);
        pst.setDouble(9, total);
        pst.setDouble(10, percentage);
        pst.setString(11, position);
        

        // Execute the query and check if any rows were affected
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected >= 1) {
            JOptionPane.showMessageDialog(null, "Updated");
            table();
            st_id.setText("");
            termtxt.setSelectedItem("");
            mathtxt.setText("");
            englishtxt.setText("");
            sciencetxt.setText("");
            kinytxt.setText("");
            socialtxt.setText("");
            frenchtxt.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update");
                }
        }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_updatebtnActionPerformed

    private void tbl_displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_displayMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel Df= (DefaultTableModel)tbl_display.getModel();
            int selectedIndex= tbl_display.getSelectedRow();
            st_id.setText(Df.getValueAt(selectedIndex, 1).toString());
            termtxt.setSelectedItem(Df.getValueAt(selectedIndex, 2).toString());
            mathtxt.setText(Df.getValueAt(selectedIndex, 3).toString());
            englishtxt.setText(Df.getValueAt(selectedIndex, 4).toString());
            sciencetxt.setText(Df.getValueAt(selectedIndex, 5).toString());
            kinytxt.setText(Df.getValueAt(selectedIndex, 6).toString());
            socialtxt.setText(Df.getValueAt(selectedIndex, 7).toString());
            frenchtxt.setText(Df.getValueAt(selectedIndex, 8).toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbl_displayMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        try {
            
            int del = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete?","delete",JOptionPane.YES_NO_OPTION);
            if(del==0){
                DefaultTableModel Df= (DefaultTableModel)tbl_display.getModel();
                int selectedIndex= tbl_display.getSelectedRow();
                String value= (tbl_display.getModel().getValueAt(selectedIndex,0).toString());
                pst  = con.prepareStatement("delete from report where id='"+value+"'");
                    // executeUpdate
                int rowAffected= pst.executeUpdate();
                if(rowAffected<=1){
                    JOptionPane.showMessageDialog(this, "Deleted!");
                    table();
                    st_id.setText("");
                    termtxt.setSelectedItem("");
                    mathtxt.setText("");
                    englishtxt.setText("");
                    sciencetxt.setText("");
                    kinytxt.setText("");
                    socialtxt.setText("");
                    frenchtxt.setText("");
                }
            // close the connection
            //con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void stubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stubtnActionPerformed
        // TODO add your handling code here:
        try {
            Students st= new Students();
            st.setVisible(true);
            dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_stubtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
                try {
            StudentResult result= new StudentResult();
            result.setVisible(true);
            dispose();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField englishtxt;
    private javax.swing.JTextField frenchtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kinytxt;
    private javax.swing.JTextField mathtxt;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField sciencetxt;
    private javax.swing.JTextField socialtxt;
    private javax.swing.JTextField st_id;
    private javax.swing.JButton stubtn;
    private javax.swing.JTable tbl_display;
    private javax.swing.JComboBox<String> termtxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
