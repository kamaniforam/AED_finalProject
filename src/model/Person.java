/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author foram
 */
public class Person {
    private String nameOfPerson;
    private int ageOfPerson;
    private int idOfPerson;
    House house;
    
    public Person(){
        
    }
    public Person(String name, int age, int id, House house){
        this.nameOfPerson = name;
        this.ageOfPerson = age;
        this.idOfPerson = id;
        this.house = house;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int getIdOfPerson() {
        return idOfPerson;
    }

    public void setIdOfPerson(int idOfPerson) {
        this.idOfPerson = idOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Person{" + "nameOfPerson=" + nameOfPerson + ", ageOfPerson=" + ageOfPerson + ", idOfPerson=" + idOfPerson + ", house=" + house + '}';
    }
    
}
