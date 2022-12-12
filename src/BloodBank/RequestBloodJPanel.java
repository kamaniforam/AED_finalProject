/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BloodBank;

import Business.EcoSystem;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validations.VerifyEmail;
import validations.VerifyNumber;
import validations.VerifyString;

/**
 *
 * @author foram
 */
public class RequestBloodJPanel extends javax.swing.JPanel {

    private javax.swing.JSplitPane jSplitPane1;

    EcoSystem business;
    BloodUserClass blood;
    BloodUserDirectory bloodUserDirectory;
    RequestBlood rb;
    RequestBloodDirectory rbd;
            
    public RequestBloodJPanel(javax.swing.JSplitPane jSplitPane1, EcoSystem business, BloodUserDirectory bloodUserDirectory, BloodUserClass blood, RequestBlood rb,
    RequestBloodDirectory rbd) {
        initComponents();
 
        this.jSplitPane1 = jSplitPane1;    
        this.business = business;
        this.bloodUserDirectory = bloodUserDirectory;
        this.blood = blood;
        this.rb = rb;
        this.rbd = rbd;
        addVerifiers();
        displayrequestTableDetails();
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
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        viewPerson = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailId = new javax.swing.JTextField();
        blloodGroupTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTbl = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lblName.setText("Name:");

        lblAge.setText("Age:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Back<<");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        viewPerson.setBackground(new java.awt.Color(51, 153, 255));
        viewPerson.setForeground(new java.awt.Color(255, 255, 255));
        viewPerson.setText("Request Blood");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REQUEST BLOOD PORTAL");

        jLabel2.setText("EmailId:");

        jLabel3.setText("BloodGroup:");

        blloodGroupTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blloodGroupTxtActionPerformed(evt);
            }
        });

        requestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Email", "Blood Group"
            }
        ));
        jScrollPane2.setViewportView(requestTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(emailId)
                            .addComponent(txtAge)
                            .addComponent(blloodGroupTxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(viewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(blloodGroupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(viewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        BloodDonorJPanel bd = new BloodDonorJPanel(jSplitPane1, business, bloodUserDirectory, blood, rb, rbd);
        jSplitPane1.setRightComponent(bd);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
        // TODO add your handling code here:
       if ( txtAge.getText().isEmpty() || txtName.getText().isEmpty() || blloodGroupTxt.getText().isEmpty() || emailId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are Mandatory");
        } else {

            RequestBlood bc = rbd.addUser(rb);
            bc.setName(txtName.getText());
            bc.setAge(Integer.parseInt(txtAge.getText()));
            bc.setEmailId(emailId.getText());
            bc.setBloodGroup(blloodGroupTxt.getText());
            displayrequestTableDetails();
            JOptionPane.showMessageDialog(this, "Request Sent");

        }
        txtAge.setText("");
        txtName.setText("");
        emailId.setText("");
        blloodGroupTxt.setText("");
    }//GEN-LAST:event_viewPersonActionPerformed

    private void blloodGroupTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blloodGroupTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blloodGroupTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField blloodGroupTxt;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField emailId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable requestTbl;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton viewPerson;
    // End of variables declaration//GEN-END:variables

    
    private void addVerifiers() {
        InputVerifier integerVerifier = new VerifyNumber();       
        txtAge.setInputVerifier(integerVerifier);
        
        InputVerifier stringVerifier = new VerifyString();
        txtName.setInputVerifier(stringVerifier);
        //blloodGroupTxt.setInputVerifier(stringVerifier);
        
        InputVerifier emailVerifier = new VerifyEmail();
        emailId.setInputVerifier(emailVerifier);
        
    }
    
    private void displayrequestTableDetails(){
        DefaultTableModel tblmodel = (DefaultTableModel) requestTbl.getModel();
        tblmodel.setRowCount(0);
        for(RequestBlood bloodUser : rbd.getuserList()){
            Object[]row = new Object[10];
            row[0] = bloodUser.getName();
            row[1] = bloodUser.getAge();
            row[2] = bloodUser.getEmailId();
            row[3] = bloodUser.getBloodGroup();
   
            tblmodel.addRow(row);
        }
    }
}
