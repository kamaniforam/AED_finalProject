/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents;

import Business.model.EMT.EMT;
import Business.model.EMT.EMTDirectory;
import Business.model.person.Person;
import Business.model.person.PersonDirectory;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import validations.VerifyNumber;
import validations.VerifyString;

/**
 *
 * @author foram
 */
public class EMTJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OPDJPanel
     */
    PersonDirectory personDirectory;
    EMTDirectory eMTDirectory;
    public EMTJPanel(PersonDirectory personDirectory, EMTDirectory eMTDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.eMTDirectory = eMTDirectory;
        
        displayEMTTableDetails();
        addVerifiers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        private void addVerifiers() {
        InputVerifier integerVerifier = new VerifyNumber();       
        txtAge.setInputVerifier(integerVerifier);
        
        InputVerifier stringVerifier = new VerifyString();
        txtfName.setInputVerifier(stringVerifier);
        lnameTxt.setInputVerifier(stringVerifier);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emtLbl = new javax.swing.JLabel();
        fnameLbl = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        medicalLbl = new javax.swing.JLabel();
        serviceCombo = new javax.swing.JComboBox<>();
        messageLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEMT = new javax.swing.JTable();
        lblName1 = new javax.swing.JLabel();
        lnameTxt = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        messageBox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        emtLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        emtLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emtLbl.setText("EMERGENCY MEDICAL TREATMENT");

        fnameLbl.setText("First Name:");

        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        medicalLbl.setText("Medical Service:");

        serviceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandage a wound", "CPR", "First-aid", "Need an ambulance", "Others" }));

        messageLbl.setText("Message:");

        tblEMT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Medical Service", "Message"
            }
        ));
        jScrollPane2.setViewportView(tblEMT);

        lblName1.setText("Last Name:");

        lnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTxtActionPerformed(evt);
            }
        });

        bookBtn.setText("Book Appoitment");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Request Blood");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(medicalLbl)
                                        .addGap(36, 36, 36)
                                        .addComponent(serviceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(114, 114, 114))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lnameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtfName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(emtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {serviceCombo, txtAge, txtfName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fnameLbl, lblAge, lblName1, medicalLbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(emtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnameLbl))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(messageLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicalLbl)
                            .addComponent(serviceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {serviceCombo, txtAge, txtfName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fnameLbl, lblAge, lblName1, medicalLbl});

    }// </editor-fold>//GEN-END:initComponents

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void lnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTxtActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        
        if(txtfName.getText().isEmpty() || lnameTxt.getText().isEmpty() || txtAge.getText().isEmpty()){     
            
            JOptionPane.showMessageDialog(this, "All fields are manadatory!");
            
        } else{
            
            EMT emt = eMTDirectory.addNewEMT();
            emt.setId(getUniqueIdPerson());
            emt.setFname(txtfName.getText());
            emt.setLname(lnameTxt.getText());
            emt.setAge(Integer.parseInt(txtAge.getText()));
            emt.setServices((String) serviceCombo.getSelectedItem());
            emt.setMessage(messageBox.getText());
            displayEMTTableDetails();
            JOptionPane.showMessageDialog(this, "Appointment Booked");
            
        }
        
        

    }//GEN-LAST:event_bookBtnActionPerformed
  
    private int getUniqueIdPerson() {
        
        int randomPIN = (int)(Math.random()*90000)+10000;
        for(Person person : personDirectory.getListOfPerson()){
            if(person.getIdOfPerson()== randomPIN){
            getUniqueIdPerson();
            }
        }
        return randomPIN;
    }
    
    private void displayEMTTableDetails() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblEMT.getModel();
        tblmodel.setRowCount(0);
        for (EMT emt : eMTDirectory.getEmtDirectory()) {
            Object[] row = new Object[10];
            row[0] = emt.getId();
            row[1] = emt.getFname() +" " + emt.getLname();
            row[2] = emt.getAge();
            row[3] = emt.getServices();
            row[4] = emt.getMessage();
            tblmodel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel emtLbl;
    private javax.swing.JLabel fnameLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JLabel medicalLbl;
    private javax.swing.JTextField messageBox;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JComboBox<String> serviceCombo;
    private javax.swing.JTable tblEMT;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtfName;
    // End of variables declaration//GEN-END:variables
}
