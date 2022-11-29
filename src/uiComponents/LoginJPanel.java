/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents;

import javax.swing.JOptionPane;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.PersonDirectory;
import model.UserDetails;
import validations.LoginCreds;

/**
 *
 * @author foram
 */
public class LoginJPanel extends javax.swing.JPanel {
    private javax.swing.JSplitPane jSplitPane1;

    /**
     * Creates new form LoginJPanel
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    EncounterHistory encounterHistory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hispDirectory;
    
    public LoginJPanel(javax.swing.JSplitPane jSplitPane1,PersonDirectory personDirectory, PatientDirectory patientDirectory, 
            EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory ) {
       initComponents();
       
       this.personDirectory = personDirectory;
       this.patientDirectory = patientDirectory;
       this.encounterHistory = encounterHistory;
       this.doctorDirectory = doctorDirectory;
       this.hispDirectory =hospitalDirectory;
       this.jSplitPane1 = jSplitPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        dropdownRole = new javax.swing.JComboBox<>();
        role = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        passwordLbl.setText("Password:");

        usernameLbl.setText("User Name:");

        loginLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("LOGIN");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        dropdownRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Role", "System administrator", "Patient", "Hospital administrator", "Community administrator", "Doctor" }));
        dropdownRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownRoleActionPerformed(evt);
            }
        });

        role.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameLbl)
                                    .addComponent(role, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dropdownRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(password)
                                    .addComponent(username)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(loginBtn)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdownRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(loginBtn)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        LoginCreds creds = new LoginCreds();
        
        String userName = username.getText();
        String pass = password.getText();
        String role = dropdownRole.getSelectedItem().toString();
        
        boolean loggedIn = creds.doLogin(userName, pass, role);
        
        if(loggedIn) {  
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFULL");
            if(null != UserDetails.Roles.fromString(role))switch (UserDetails.Roles.fromString(role)) {
                case SYSTEM_ADMINISTRATOR -> {
                    SystemAdminJPanel systemAdminPane = new SystemAdminJPanel(personDirectory, patientDirectory, encounterHistory, doctorDirectory,hispDirectory);
                    jSplitPane1.setRightComponent(systemAdminPane);
                    }
                case DOCTOR -> {
                    DoctorJPanel doctorPane = new DoctorJPanel( encounterHistory, personDirectory, patientDirectory, hispDirectory,jSplitPane1,doctorDirectory);
                    jSplitPane1.setRightComponent(doctorPane);
                    }
                case PATIENT -> {
                    CreateJPanel createPane = new CreateJPanel(personDirectory, patientDirectory, encounterHistory, jSplitPane1,hispDirectory, doctorDirectory);
                    jSplitPane1.setRightComponent(createPane);
                    }
                case COMMUNITY_ADMINISTRATOR -> {
                    CommunityAdminJPanel communityAdminPane = new CommunityAdminJPanel(personDirectory,patientDirectory, encounterHistory,doctorDirectory,hispDirectory,jSplitPane1);
                    jSplitPane1.setRightComponent(communityAdminPane);
                    }
                case HOSPITAL_ADMINISTRATOR -> {
                    HospitalAdminJPanel hospitalAdminPane = new HospitalAdminJPanel(personDirectory, patientDirectory, encounterHistory, doctorDirectory,hispDirectory,jSplitPane1);
                    jSplitPane1.setRightComponent(hospitalAdminPane);
                    }
                default -> {
                    JOptionPane.showMessageDialog(this, "SELECT ROLE");
                }
            } 
        } else{
            JOptionPane.showMessageDialog(this, "INVALID CREDENTIALS");
        }
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void dropdownRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dropdownRole;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel role;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}