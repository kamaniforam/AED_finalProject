/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.model.PHC;

import javax.swing.ImageIcon;

/**
 *
 * @author foram
 */
public class Person {
    private String nameOfPerson;
    private int ageOfPerson;
    private int idOfPerson;
    private ImageIcon photo;
    House house;
  

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    public int getIdOfPerson() {
        return idOfPerson;
    }

    public void setIdOfPerson(int idOfPerson) {
        this.idOfPerson = idOfPerson;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

  
}
