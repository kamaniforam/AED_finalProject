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

     public BloodUserClass addUser(BloodUserClass bc) {
        userList.add(bc);
        return bc;
    }

    public void deleteUser(BloodUserClass med) {
     userList.remove(med);
    }
    
}
