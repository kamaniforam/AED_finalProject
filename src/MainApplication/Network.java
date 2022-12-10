/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApplication;

import Enterprise.EnterpriseCatalog;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author richajain
 */
public class Network {
    
    private String nameOfNetwork;
    private EnterpriseCatalog enterpriseCatalog;

    public Network() {
        enterpriseCatalog = new EnterpriseCatalog();
    }

    public String getNetworkName() {
        return nameOfNetwork;
    }

    public void setNetworkName(String nameOfNetwork) {
        this.nameOfNetwork = nameOfNetwork;
    }

    public EnterpriseCatalog getEnterpriseCatalog() {
        return enterpriseCatalog;
    }

    @Override
    public String toString() {
        return nameOfNetwork;
    }
}
