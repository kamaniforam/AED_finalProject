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
public class City {
    
    private String nameOfCity;
    private ArrayList<Community> listOfCommunity;

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public ArrayList<Community> getListOfCommunity() {
        return listOfCommunity;
    }

    public void setListOfCommunity(ArrayList<Community> listOfCommunity) {
        this.listOfCommunity = listOfCommunity;
    }
    
    public void addCommunity(Community community){
        this.listOfCommunity.add(community);
    }
    
}
