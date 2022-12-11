/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uiComponents.PHC;
import Business.EcoSystem;
import Business.Network;
import Business.Pharmacy.Organizations.PharmacyOrganization;
import Business.Roles.Role;
import static Business.Roles.Role.BLOODBANK_COMMUNITY_ADMINISTRATOR;
import static Business.Roles.Role.DENTAL_PATIENT;
import static Business.Roles.Role.DENTIST;
import static Business.Roles.Role.HOSPITAL_ADMINISTRATOR;
import static Business.Roles.Role.PATIENT;
import static Business.Roles.Role.PHARMACY_ADMIN;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Business.db40Utility.DB4OUtil;
import Bussiness.model.PHC.EMTDirectory;
import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.PersonDirectory;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.VitalSigns;
import Bussiness.model.PHC.UserAccount;
import Enterprise.Enterprise;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import uiComponents.DentalHospital.Doctor.DentistWorkAreaJPanel;
import uiComponents.DentalHospital.FrontDesk.FrontDeskWorkAreaJPanel;
import uiComponents.DentalPatientRole.DentalPatientJPanel;

import uiComponents.Pharmacy.PharmacyAdminWorkAreaJPanel;

/**
 *
 * @author foram
 */
public class MainJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainJFrame
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    EncounterHistory encounterHistory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    UserAccount account;
    EcoSystem business;  
    VitalSigns vitalSigns;
    
    EMTDirectory eMTDirectory;
    PharmacyOrganization org;
    Network network;
    Enterprise enterprise;
    //WorkRequest wr;
   
            
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance(); //Richa
       
    
    public MainJFrame() {
        initComponents();
   
        setSize(1680, 1050);
        //int MAXIMIZED_BOTH1 = MainJFrame.MAXIMIZED_BOTH;
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.personDirectory = new PersonDirectory();
        this.patientDirectory = new PatientDirectory();
        this.encounterHistory = new EncounterHistory();
        this.doctorDirectory = new DoctorDirectory();
        this.hospitalDirectory = new HospitalDirectory();
        this.vitalSigns = new VitalSigns();
        this.eMTDirectory = new EMTDirectory();
        //this.account = new UserAccount();
        this.business = dB4OUtil.retrieveSystem(); //Richa
        System.out.println("Business: "+business);
         ArrayList<WorkRequest> wr = WorkQueue.getInstance();
         System.out.println(wr);
        //business.setWorkQueue(wq);
        this.org = new PharmacyOrganization();
        this.network = new Network();
        
        //this.enterprise = new Enterprise(enterprise);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        loginBtn2 = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        passwordLbl = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        role = new javax.swing.JLabel();
        dropdownRole = new javax.swing.JComboBox<>();
        usernameLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOGOUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        loginBtn2.setBackground(new java.awt.Color(51, 153, 255));
        loginBtn2.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn2.setText("LOGIN");
        loginBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, loginBtn2});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(loginBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(954, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, loginBtn2});

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(leftPanel);

        container.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        container.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                containerComponentAdded(evt);
            }
        });
        container.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                containerAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1formComponentAdded(evt);
            }
        });

        passwordLbl.setText("Password:");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        role.setText("Role:");

        dropdownRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE A ROLE", "SUPER ADMIN", "SYSTEM ADMINISTRATOR", "PATIENT", "COMMUNITY ADMINISTRATOR", "HOSPITAL ADMINISTRATOR", "PHARMACY ADMIN", "RECEPTIONIST", "DENTAL PATIENT", "DENTIST" }));
        dropdownRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownRoleActionPerformed(evt);
            }
        });

        usernameLbl.setText("User Name:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTHCARE MANAGEMENT SYSTEM");

        loginBtn1.setBackground(new java.awt.Color(51, 153, 255));
        loginBtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn1.setText("SUBMIT");
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(passwordLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(role, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dropdownRole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(usernameLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(loginBtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLbl)
                            .addComponent(role, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(43, 43, 43)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dropdownRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdownRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(loginBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(796, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void containerComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_containerComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_containerComponentAdded

    private void containerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_containerAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_containerAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        username.setText("");
        password.setText("");
        dropdownRole.setSelectedIndex(0);

        container.removeAll();
        loginJPanel login = new loginJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory,
        doctorDirectory, hospitalDirectory, vitalSigns, org, network, enterprise);

        jSplitPane1.setRightComponent(login);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void dropdownRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownRoleActionPerformed

    private void jPanel1formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1formComponentAdded

    private void loginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn2ActionPerformed
        // TODO add your handling code here:
        loginJPanel login = new loginJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory,
        doctorDirectory, hospitalDirectory, vitalSigns, org, network, enterprise);
        jSplitPane1.setRightComponent(login);
    }//GEN-LAST:event_loginBtn2ActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
        // TODO add your handling code here
        UserAccount superUser = new UserAccount("fk", "fk", Role.SYSTEM_ADMINISTRATOR);
        
        UserAccount superUser1 = new UserAccount("rj", "rj", Role.SUPER_ADMIN);

        String usernameText = username.getText();
        String passwordText = password.getText();
        String dropdownrole = dropdownRole.getSelectedItem().toString();

        if (usernameText.isEmpty() || passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and Password field's cannot be empty");
            return;
        }else if(dropdownrole == null || Role.fromString(dropdownrole) == null) {
            JOptionPane.showMessageDialog(null, "Please select a role");
            return;
        }

        Role role = Role.fromString(dropdownrole);
        UserAccount user = new UserAccount(usernameText, passwordText, role);
        ObjectSet result = DB4OUtil.getDBInstance().queryByExample(user);

        if (user.equals(superUser1) || !result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFULL");

            switch (role) {
                case SYSTEM_ADMINISTRATOR:
                SystemAdminJPanel userPanel = new SystemAdminJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory, doctorDirectory, hospitalDirectory);
                jSplitPane1.setRightComponent(userPanel);
                break;
                case PATIENT:
                CreateJPanel createPane = new CreateJPanel(jSplitPane1, account, business,personDirectory, patientDirectory, encounterHistory, doctorDirectory, hospitalDirectory, vitalSigns);
                jSplitPane1.setRightComponent(createPane);
                break;
                case BLOODBANK_COMMUNITY_ADMINISTRATOR:
                //CommunityAdminJPanel communityAdminPane = new CommunityAdminJPanel(personDirectory, patientDirectory, encounterHistory, doctorDirectory, hospitalDirectory, jSplitPane1);
                //jSplitPane1.setRightComponent(communityAdminPane);
                break;
                case HOSPITAL_ADMINISTRATOR:
                HospitalAdminJPanel hospitalAdminPane = new HospitalAdminJPanel(personDirectory, patientDirectory, encounterHistory, doctorDirectory, hospitalDirectory, jSplitPane1, vitalSigns);
                jSplitPane1.setRightComponent(hospitalAdminPane);
                break;
                case PHARMACY_ADMIN:
                PharmacyAdminWorkAreaJPanel pharmacy = new PharmacyAdminWorkAreaJPanel(jSplitPane1, account, org, enterprise, network, business);
                jSplitPane1.setRightComponent(pharmacy);
                break;
                case DENTIST:
                DentistWorkAreaJPanel dentist = new DentistWorkAreaJPanel(business);
                jSplitPane1.setRightComponent(dentist);
                break;
                case DENTAL_PATIENT:
                DentalPatientJPanel dental = new DentalPatientJPanel(business, jSplitPane1, account, org, enterprise, network);
                jSplitPane1.setRightComponent(dental);
                break;
                case RECEPTIONIST:
                FrontDeskWorkAreaJPanel desk = new FrontDeskWorkAreaJPanel(business);
                jSplitPane1.setRightComponent(desk);
                case SUPER_ADMIN:
                AddUserPanel makeUser = new AddUserPanel();
                jSplitPane1.setRightComponent(makeUser);
                break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "INVALID CREDENTIALS");
        }
    }//GEN-LAST:event_loginBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JComboBox<String> dropdownRole;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JButton loginBtn2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel role;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables

}