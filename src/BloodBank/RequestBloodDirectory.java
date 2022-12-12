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
public class RequestBloodDirectory {
    
    private ArrayList<RequestBlood> userList;

    public RequestBloodDirectory() {
        userList = new ArrayList<>();
    }

    public ArrayList<RequestBlood> getuserList() {
        return userList;
    }

    public void setuserList(ArrayList<RequestBlood> medicineList) {
        this.userList = medicineList;
    }

     public RequestBlood addUser(RequestBlood bc) {
        userList.add(bc);
        return bc;
    }

    public void deleteUser(RequestBlood med) {
     userList.remove(med);
    }
    
}
