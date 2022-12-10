/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.model.PHC;

import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class EMTDirectory {
 
    private ArrayList<EMT> emtDirectory;

    public ArrayList<EMT> getEmtDirectory() {
        return emtDirectory;
    }

    public void setEmtDirectory(ArrayList<EMT> emtDirectory) {
        this.emtDirectory = emtDirectory;
    }
    
      public EMTDirectory(){
        this.emtDirectory = new ArrayList<>();
    }
    
    public EMT addNewEMT(){
        EMT emt = new EMT();
        emtDirectory.add(emt);
        return emt;
    }
    
    public void EMTDoctor(EMT emt){
        emtDirectory.remove(emt);
    }
}
