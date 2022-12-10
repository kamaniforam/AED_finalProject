/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.model.person;

import java.util.ArrayList;
import Business.model.location.House;

/**
 *
 * @author foram
 */
public class PersonDirectory {
    
    private ArrayList<Person> listOfPerson;
    
    public PersonDirectory(){
        this.listOfPerson = new ArrayList<>();
    }

    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(Person person) {
        //System.out.println(person);
        this.listOfPerson.add(person);
    }
    
    public Person addNewPerson(){
        House house = new House();
        Person newPerson = new Person();
        listOfPerson.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person person){
        listOfPerson.remove(person);
    }

    @Override
    public String toString() {
        return "PersonDirectory{" + "listOfPerson=" + listOfPerson + '}';
    }
    
}