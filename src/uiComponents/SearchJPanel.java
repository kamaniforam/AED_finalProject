/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents;

import Business.EcoSystem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Business.model.doctor.Doctor;
import Business.model.doctor.DoctorDirectory;
import Business.model.encounter.Encounter;
import Business.model.encounter.EncounterHistory;
import Business.model.hospital.Hospital;
import Business.model.hospital.HospitalDirectory;
import Business.model.patient.Patient;
import Business.model.patient.PatientDirectory;
import Business.model.person.PersonDirectory;
import Business.model.vitalSigns.VitalSigns;
import Business.userAccountDetails.UserAccount;

/**
 *
 * @author foram
 */
public class SearchJPanel extends javax.swing.JPanel {

    private javax.swing.JSplitPane jSplitPane1;
    /**
     * Creates new form SearchJPanel
     */
    EncounterHistory encounterHistory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    EcoSystem business;
    UserAccount account;
    VitalSigns vitalSigns;

    public SearchJPanel(EncounterHistory encounterHistory, PatientDirectory patientDirectory, PersonDirectory personDirectory, 
            javax.swing.JSplitPane jSplitPane1, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, VitalSigns vitalSigns) {
        initComponents();
        this.encounterHistory = encounterHistory;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        this.jSplitPane1 = jSplitPane1;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.vitalSigns = vitalSigns;

        displayEncounterHistory();
        PopulateDoctorsTable();

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
        tblPatientHistory = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hospitalLbl1 = new javax.swing.JLabel();
        ddCommunity1 = new javax.swing.JComboBox<>();
        cityLbl = new javax.swing.JLabel();
        ddCity1 = new javax.swing.JComboBox<>();
        viewPerson = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        searchDoc = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visit Record");

        tblPatientHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "BloodPressure", "Heart Rate", "Health Check", "Appointment Type", "Visit Date"
            }
        ));
        jScrollPane1.setViewportView(tblPatientHistory);

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PatientID", "Name", "Age", "City", "Community", "BloodPressure", "isNormal", "Person'ID", "Apartment Number"
            }
        ));
        jScrollPane2.setViewportView(tblPatients);

        btnSearch.setText("Search Patient");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patient Encounter Detail");

        hospitalLbl1.setText("Community:");

        ddCommunity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a Community", "Boylston", "MissionMain", "MissionHill" }));
        ddCommunity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunity1ActionPerformed(evt);
            }
        });

        cityLbl.setText("City:");

        ddCity1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a City", "Boston", "Newyork", "California" }));
        ddCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCity1ActionPerformed(evt);
            }
        });

        viewPerson.setText("View");
        viewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hospital Id", "Hospital Name", "Community", "City", "Doctor Id", "Doctor Name"
            }
        ));
        DoctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DoctorTable);

        searchDoc.setText("Search Doctor");
        searchDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddCommunity1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddCity1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewPerson)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(427, 427, 427))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearch, jButton1, searchDoc, viewPerson});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(viewPerson))
                .addGap(2, 2, 2)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalLbl1)
                            .addComponent(ddCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddCity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cityLbl))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        String city = ddCity1.getSelectedItem().toString();
        String community = ddCommunity1.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);

        for (Patient patient : patientDirectory.getListOfPatients()) {
            Object[] row = new Object[10];

            row[0] = patient;

            if (patient.getHouse().getNameOfCity().equals(city) && patient.getHouse().getNameOfCommunity().equals(community)) {

                row[0] = patient.getPatientD();
                row[1] = patient.getNameOfPerson();
                row[2] = patient.getAgeOfPerson();
                row[3] = patient.getHouse().getNameOfCity();
                row[4] = patient.getHouse().getNameOfCommunity();
                row[5] = patient.getVitalSigns().getBloodPressure();
                row[6] = patient.isIsStable();
                row[7] = patient.getIdOfPerson();
                row[8] = patient.getHouse().getApartmentNumber();
                model.addRow(row);
            }
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void displayHospitalTableDetails() {
        DefaultTableModel tblmodel = (DefaultTableModel) DoctorTable.getModel();
        tblmodel.setRowCount(0);

        for (Hospital hospital : hospitalDirectory.getListOfHospital()) {
            Object[] row = new Object[4];
            row[0] = hospital.getHospitalId();
            row[1] = hospital.getHospitalName();
            row[2] = hospital.getCommunity();
            row[3] = hospital.getCity();

            tblmodel.addRow(row);
        }
    }

    private void ddCommunity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCommunity1ActionPerformed

    private void ddCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddCity1ActionPerformed

    private void viewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPane = new ViewJPanel(jSplitPane1, account, business, personDirectory, patientDirectory, encounterHistory, doctorDirectory,hospitalDirectory, vitalSigns);
        jSplitPane1.setRightComponent(viewPane);
    }//GEN-LAST:event_viewPersonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientHistory.getSelectedRow();
        patientDirectory.getListOfPatients().remove(selectedRowIndex);
        displayEncounterHistory();
        JOptionPane.showMessageDialog(this, "Appointment has been Canceled ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DoctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorTableMouseClicked

    }//GEN-LAST:event_DoctorTableMouseClicked

    private void searchDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDocActionPerformed
        // TODO add your handling code here:

        String city = ddCity1.getSelectedItem().toString();
        String community = ddCommunity1.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();
        model.setRowCount(0);

        for (Doctor doc : doctorDirectory.getListOfDoctors()) {

            Object[] row = new Object[10];
            
            row[0] = doc;
            
            if (doc.getHospital().getCommunity().equals(community) && doc.getHospital().getCity().equals(city)) {
                System.out.print(doc.getHospital().getHospitalId());
                row[0] = doc.getHospital().getHospitalId();
                row[1] = doc.getHospital().getHospitalName();
                row[2] = doc.getHospital().getCommunity();
                row[3] = doc.getHospital().getCity();
                row[4] = doc.getDoctorId();
                row[5] = doc.getDoctorName();

                model.addRow(row);

            }

        }


    }//GEN-LAST:event_searchDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JComboBox<String> ddCity1;
    private javax.swing.JComboBox<String> ddCommunity1;
    private javax.swing.JLabel hospitalLbl1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton searchDoc;
    private javax.swing.JTable tblPatientHistory;
    private javax.swing.JTable tblPatients;
    private javax.swing.JButton viewPerson;
    // End of variables declaration//GEN-END:variables

    private void displayEncounterHistory() {
        DefaultTableModel model = (DefaultTableModel) tblPatientHistory.getModel();
        model.setRowCount(0);
        for (Encounter encounter : encounterHistory.getListOfEncounter()) {
            Object[] row = new Object[10];
            row[0] = encounter.getPatientID();
            row[1] = encounter.getVitalSigns().getBloodPressure();
            row[2] = encounter.getVitalSigns().getHeartRate();
            row[3] = encounter.isIsStable() ? "Healthy" : "Not Healthy";
            row[4] = encounter.getAppointmentType();
            row[5] = encounter.getDateOfVisit();    
            model.addRow(row);
        }
    }

    private void PopulateDoctorsTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();
        model.setRowCount(0);

        for (Doctor doc : doctorDirectory.getListOfDoctors()) {
            Object[] row = new Object[10];
            row[0] = doc.getHospital().getHospitalId();
            row[1] = doc.getHospital().getHospitalName();
            row[2] = doc.getHospital().getCommunity();
            row[3] = doc.getHospital().getCity();
            row[4] = doc.getDoctorId();
            row[5] = doc.getDoctorName();
            model.addRow(row);
        }

    }

}
