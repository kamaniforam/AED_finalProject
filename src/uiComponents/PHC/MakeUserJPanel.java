/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents.PHC;

import Business.EcoSystem;
import Business.Roles.Role;
import Business.db40Utility.DB4OUtil;
import Bussiness.model.PHC.DoctorDirectory;
import Bussiness.model.PHC.EncounterHistory;
import Bussiness.model.PHC.HospitalDirectory;
import Bussiness.model.PHC.House;
import Bussiness.model.PHC.PatientDirectory;
import Bussiness.model.PHC.Person;
import Bussiness.model.PHC.PersonDirectory;
import Bussiness.model.PHC.VitalSigns;
import Bussiness.model.PHC.UserAccount;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author foram
 */
public class MakeUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MakeUserJPanel
     */
       private javax.swing.JSplitPane jSplitPane1;

    /**
     * Creates new form CreateJPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    EcoSystem ecosystem;
    UserAccount account;
    VitalSigns vitalSigns;
    
    public MakeUserJPanel(javax.swing.JSplitPane jSplitPane1, UserAccount account, EcoSystem ecosystem, PersonDirectory personDirectory, PatientDirectory patientDirectory,EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, VitalSigns vitalSigns) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.jSplitPane1 = jSplitPane1;
        this.doctorDirectory = doctorDirectory;
        this.ecosystem = ecosystem;
        this.vitalSigns = vitalSigns;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateProfile = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblHouseNumber = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        ddCity = new javax.swing.JComboBox<>();
        ddCommunity = new javax.swing.JComboBox<>();
        ddHouseNumber = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        viewPerson = new javax.swing.JButton();
        uploadPhoto = new javax.swing.JLabel();
        displayPhoto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confirmPasswordLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        confirmPasswordTxt = new javax.swing.JPasswordField();
        SignupBtn = new javax.swing.JButton();
        role = new javax.swing.JLabel();
        dropdownRole = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        signupLbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        lblName.setText("Name:");

        lblAge.setText("Age:");

        lblAddress.setText("Address:");

        lblCommunity.setText("Community:");

        lblCity.setText("City:");

        lblZipCode.setText("ZipCode:");

        lblHouseNumber.setText("House Number:");

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

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        ddCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a City", "Boston", "Newyork", "California" }));
        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        ddCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Community", "Boylston", "MissionMain", "MissionHill" }));
        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        ddHouseNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose House Number", "1", "2", "3", "4", "5", "6" }));

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save Profile");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        viewPerson.setBackground(new java.awt.Color(51, 153, 255));
        viewPerson.setForeground(new java.awt.Color(255, 255, 255));
        viewPerson.setText("View");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });

        uploadPhoto.setForeground(new java.awt.Color(255, 255, 255));
        uploadPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), null));

        displayPhoto.setBackground(new java.awt.Color(51, 153, 255));
        displayPhoto.setForeground(new java.awt.Color(255, 255, 255));
        displayPhoto.setText("UPLOAD PHOTO");
        displayPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        displayPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPhotoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Person Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCity)
                                    .addComponent(lblAge)
                                    .addComponent(lblName)
                                    .addComponent(lblHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblZipCode))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ddCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtZipCode)
                                    .addComponent(txtAddress)
                                    .addComponent(txtAge)
                                    .addComponent(txtName)
                                    .addComponent(ddCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ddHouseNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnSave)
                        .addGap(34, 34, 34)
                        .addComponent(viewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddress)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblZipCode)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHouseNumber)
                            .addComponent(ddHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CreateProfile.addTab("Create Profile", jPanel1);

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));

        usernameLbl.setText("username:");

        passwordLbl.setText("password:");

        confirmPasswordLbl.setText("confirm password:");

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        SignupBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.accentColor"));
        SignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignupBtn.setText("SIGNUP");
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });

        role.setText("Role:");

        dropdownRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE A ROLE", "SYSTEM ADMINISTRATOR", "PATIENT", "COMMUNITY ADMINISTRATOR", "HOSPITAL ADMINISTRATOR", "PHARMACY ADMIN", "RECEPTIONIST", "DENTAL PATIENT", "DENTIST" }));
        dropdownRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownRoleActionPerformed(evt);
            }
        });

        jPanel4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.hoverBorderColor"));

        signupLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        signupLbl.setText("SIGNUP");
        signupLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(signupLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(signupLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTxt)
                                    .addComponent(usernameTxt)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(confirmPasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dropdownRole, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmPasswordTxt)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(SignupBtn)))
                .addGap(485, 485, 485))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLbl)
                    .addComponent(confirmPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdownRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(SignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        CreateProfile.addTab("Add User", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateProfile)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateProfile)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCityActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtAddress.getText().isEmpty() || txtAge.getText().isEmpty()
            || txtZipCode.getText().isEmpty() || ddCity.getSelectedItem() == null
            || ddCommunity.getSelectedItem() == null || ddHouseNumber.getSelectedItem() == null || ddCity.getSelectedIndex() == 0
            || ddCommunity.getSelectedIndex() == 0 || ddHouseNumber.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "All fields are Mandatory");
        } else {

            Person person = personDirectory.addNewPerson();
            House house = new House();

            ImageIcon dPhoto = (ImageIcon) uploadPhoto.getIcon();

            person.setIdOfPerson(getUniqueIdPerson());
            person.setAgeOfPerson(Integer.parseInt(txtAge.getText()));
            person.setNameOfPerson(txtName.getText());
            person.setPhoto(dPhoto);
            house.setStreetName(txtAddress.getText());
            house.setApartmentNumber(ddHouseNumber.getSelectedItem().toString());
            house.setNameOfCity(ddCity.getSelectedItem().toString());
            house.setNameOfCommunity(ddCommunity.getSelectedItem().toString());
            house.setZipCode(Integer.parseInt(txtZipCode.getText()));

            person.setHouse(house);
            JOptionPane.showMessageDialog(this, "Profile Saved");

        }

        txtAge.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtZipCode.setText("");
        ddHouseNumber.setSelectedIndex(0);
        ddCity.setSelectedIndex(0);
        ddCommunity.setSelectedIndex(0);
        uploadPhoto.setIcon(null);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPane = new ViewJPanel(jSplitPane1, account, ecosystem, personDirectory, patientDirectory, encounterHistory, doctorDirectory,hospitalDirectory,vitalSigns);
        jSplitPane1.setRightComponent(viewPane);
    }//GEN-LAST:event_viewPersonActionPerformed

    private void displayPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChoose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Supports 3 extensions", "jpg", "jpeg", "png");
        fileChoose.setFileFilter(filter);
        int select = fileChoose.showOpenDialog(null);

        if (select == JFileChooser.APPROVE_OPTION) {
            File file = fileChoose.getSelectedFile();
            String getImage = file.getAbsolutePath();
            ImageIcon img = new ImageIcon(getImage);

            Image imgFit = img.getImage();
            Image imageFit = imgFit.getScaledInstance(uploadPhoto.getWidth(), uploadPhoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon format = new ImageIcon(imageFit);
            uploadPhoto.setIcon(format);
        }
    }//GEN-LAST:event_displayPhotoActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
        // TODO add your handling code here:

        String userName = usernameTxt.getText();
        String password = passwordTxt.getText();
        String confirmPassword = confirmPasswordTxt.getText();
        String role = dropdownRole.getSelectedItem().toString();

        if(userName.isBlank() || password.isBlank()){
            JOptionPane.showMessageDialog(this, "Username/Password cannot be blank");
            return;
        }else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password doesn't match");
            return;
        }

        ObjectContainer db = DB4OUtil.getDBInstance();
        UserAccount newUser = new UserAccount(userName, password, Role.fromString(role));
        
        ObjectSet result = db.queryByExample(newUser);
        
        if(!result.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The profile already exists..");
            return;
        }
        
        db.store(newUser);
        JOptionPane.showMessageDialog(this, "Profile Created");
    }//GEN-LAST:event_SignupBtnActionPerformed

    private void dropdownRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane CreateProfile;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JPasswordField confirmPasswordTxt;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JComboBox<String> ddHouseNumber;
    private javax.swing.JButton displayPhoto;
    private javax.swing.JComboBox<String> dropdownRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel role;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel uploadPhoto;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JButton viewPerson;
    // End of variables declaration//GEN-END:variables

    private int getUniqueIdPerson() {
        
        int randomPIN = (int)(Math.random()*90000)+10000;
        for(Person person : personDirectory.getListOfPerson()){
            if(person.getIdOfPerson()== randomPIN){
            getUniqueIdPerson();
            }
        }
        return randomPIN;
    }
}
