/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class Community {
    private String nameOfCommunity;
    private ArrayList<House> listofHouse;

    public String getNameOfCommunity() {
        return nameOfCommunity;
    }

    public void setNameOfCommunity(String nameOfCommunity) {
        this.nameOfCommunity = nameOfCommunity;
    }

    public ArrayList<House> getListofHouse() {
        return listofHouse;
    }

    public void setListofHouse(ArrayList<House> listofHouse) {
        this.listofHouse = listofHouse;
    }
    
    public void addHouse(House house){
        this.listofHouse.add(house);
    }
}
