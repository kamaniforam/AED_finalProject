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
public class PersonDirectory {
    
    private ArrayList<Person> listOfPerson;
    
    public PersonDirectory(){
        this.listOfPerson = new ArrayList<Person>();
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
        Person newPerson = new Person("",0, 0, house);
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
