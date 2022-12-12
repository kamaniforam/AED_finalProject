/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pharmacy.Model;

import java.util.Date;

/**
 *
 * @author richajain
 */
public class Medicine {

    private int serialNumber;
    private String medicineName;
    private int maxStock;
    private Date expiryDate;
    private String category;
    private int quantity;
    private double purchasePrice;
    private double sellingPrice;
    private int availQuantity;
    private String status;

    public Medicine(){
        
    }
    
    public Medicine(String medName, int maxStock, Date expiryDate, String category, int quantity,
            double purPrice, double sellPrice, int availQuantity, String status, int serialNumber){

        this.medicineName = medName;
        this.maxStock = maxStock;
        this.expiryDate = expiryDate;
        this.category = category;
        this.quantity = quantity;
        this.purchasePrice = purPrice;
        this.sellingPrice = sellPrice;
        this.availQuantity = availQuantity;
        this.status = status;
        this.serialNumber = serialNumber;
        
    }
    
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int availQuantity) {
        this.quantity = availQuantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getAvailQuantity() {
        return availQuantity;
    }

    public void setAvailQuantity(int availQuantity) {
        this.availQuantity = availQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }

}
