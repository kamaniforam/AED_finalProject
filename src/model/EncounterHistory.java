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
public class EncounterHistory {
    private ArrayList<Encounter> listOfEncounter;
    
    public EncounterHistory(){
        this.listOfEncounter = new ArrayList<>();
    }

    public ArrayList<Encounter> getListOfEncounter() {
        return listOfEncounter;
    }

    public void setListOfEncounter(Encounter encounter) {
        this.listOfEncounter.add(encounter);
    }
    
    public void addEncounter(Encounter encounter){
        this.listOfEncounter.add(encounter);
    }
}
