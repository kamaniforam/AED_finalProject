/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBank;

import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class BloodUserDirectory {
    
    private ArrayList<BloodUserClass> userList;

    public BloodUserDirectory() {
        userList = new ArrayList<>();
    }

    public ArrayList<BloodUserClass> getuserList() {
        return userList;
    }

    public void setuserList(ArrayList<BloodUserClass> medicineList) {
        this.userList = medicineList;
    }

     public void addUser(BloodUserClass bc) {
        userList.add(bc);
        
    }
    
}
