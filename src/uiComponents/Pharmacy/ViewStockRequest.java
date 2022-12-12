/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiComponents.Pharmacy;

import Business.EcoSystem;
import Business.Network;
import Business.Organization;
import Business.Pharmacy.Model.Medicine;
import Business.Pharmacy.Model.MedicinesInventory;
import Business.Pharmacy.Model.Vaccine;
import Business.Pharmacy.Organizations.PharmacyOrganization;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.VaccineWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Bussiness.model.PHC.UserAccount;
import Enterprise.Enterprise;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richajain
 */
public class ViewStockRequest extends javax.swing.JPanel {

    javax.swing.JSplitPane userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private MedicinesInventory medInv;
    private Organization org;
    private PharmacyOrganization pharmorg;
    private Network network;
    private EcoSystem business;

    /**
     * Creates new form ViewStockRequest
     * @param userProcessContainer
     * @param userAccount
     * @param pharmorg
     * @param enterprise
     * @param network
     * @param business
     */
    public ViewStockRequest(javax.swing.JSplitPane userProcessContainer, UserAccount userAccount, PharmacyOrganization pharmorg, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.pharmorg = pharmorg;
        this.network = network;
        this.business = EcoSystem.getInstance();
        
        populateTable();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestedStockTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineRequestsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        requestedStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Patient's Name", "Required Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestedStockTable);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Complete the Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeStockRequestActionPerformed(evt);
            }
        });

        vaccineRequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccination Name", "Patient's Name", "Required Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccineRequestsJTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Medical Requests");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Vaccines Requests");

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton3.setText("Complete the Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeVaccinationRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(197, 197, 197)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completeStockRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeStockRequestActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = requestedStockTable.getSelectedRow();
        System.out.println(requestedStockTable.getValueAt(selectedRow, 1));
        System.out.println(selectedRow);
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        if (requestedStockTable.getValueAt(selectedRow, 3) == "Completed") {
            JOptionPane.showMessageDialog(null, "This request is already completed");
            return ;
          
        }
        String name = requestedStockTable.getValueAt(selectedRow, 0).toString();
        if ((Integer) requestedStockTable.getValueAt(selectedRow, 2) > availableMedicineStock(name)) {
           JOptionPane.showMessageDialog(null, "Not enough quantity in the stock");
           return;
        }
        if (requestedStockTable.getValueAt(selectedRow, 3) == "Pending") {
           MedicineWorkRequest req = (MedicineWorkRequest) requestedStockTable.getValueAt(selectedRow, 0);
           req.setStatus("Completed");
        }
        
        populateTable();
        
    }//GEN-LAST:event_completeStockRequestActionPerformed

    private void completeVaccinationRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeVaccinationRequestActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = vaccineRequestsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        String name = vaccineRequestsJTable.getValueAt(selectedRow, 0).toString();
        if (vaccineRequestsJTable.getValueAt(selectedRow, 3) == "Completed") {
            JOptionPane.showMessageDialog(null, "This request is already completed");
            return ;
          
        }
        if ((Integer) vaccineRequestsJTable.getValueAt(selectedRow, 2) > availableVaccineStock(name)) {
           JOptionPane.showMessageDialog(null, "Not enough quantity in the stock");
           return;
        }
        if (vaccineRequestsJTable.getValueAt(selectedRow, 3) == "Pending") {
           VaccineWorkRequest req = (VaccineWorkRequest) vaccineRequestsJTable.getValueAt(selectedRow, 0);
           req.setStatus("Completed");
        }
        
        populateTable();
    }//GEN-LAST:event_completeVaccinationRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        PharmacyAdminWorkAreaJPanel pharmacy = new PharmacyAdminWorkAreaJPanel(userProcessContainer, userAccount, pharmorg, enterprise, network, business);
        userProcessContainer.setRightComponent(pharmacy);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)requestedStockTable.getModel();
        
        model.setRowCount(0);
//        if(WorkQueue.getInstance().size() != 0){
//            for (WorkRequest request : WorkQueue.getInstance()){
//                if(request instanceof MedicineWorkRequest){
//                    Object[] row = new Object[4];
//                    row[0] = ((MedicineWorkRequest) request);
//                    row[1] = ((MedicineWorkRequest) request).getPatientName();
//                    row[2] = ((MedicineWorkRequest) request).getQuantity();
//                    row[3] =  ((MedicineWorkRequest) request).getStatus();
//                    model.addRow(row);
//                }
//            }
//        }
        
        DefaultTableModel model1 = (DefaultTableModel)vaccineRequestsJTable.getModel();
        
        model1.setRowCount(0);

            for (WorkRequest request : business.getWorkQueue().getWorkRequestList()){
                if(request instanceof VaccineWorkRequest){
                    Object[] row = new Object[4];
                    row[0] = ((VaccineWorkRequest) request);
                    row[1] = "Patient's Name";
                    row[2] = ((VaccineWorkRequest) request).getQuantity();
                    row[3] =  ((VaccineWorkRequest) request).getStatus();
                    model1.addRow(row);
                }
            }
        
    }
    
    private int availableMedicineStock(String name){
        int quant = 0;
        for(Medicine med : pharmorg.getMedList()) {
            if(med.getMedicineName().equalsIgnoreCase(name)){
                quant = med.getQuantity();
            }
        }
        return quant;
    }
    
    private int availableVaccineStock(String name) {
        int quant = 0;
        for(Vaccine vc : pharmorg.getVacList()) {
            if(vc.getVaccineName().equalsIgnoreCase(name)){
                quant = vc.getQuantity();
            }
        }
        return quant;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestedStockTable;
    private javax.swing.JTable vaccineRequestsJTable;
    // End of variables declaration//GEN-END:variables
}
