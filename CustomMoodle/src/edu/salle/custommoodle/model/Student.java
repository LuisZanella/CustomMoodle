/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author Zane
 */
public class Student {
    private String Name;
    private String LastName;
    private String Id;

    public Student(String Name, String LastName) {
        this.Name = Name;
        this.LastName = LastName;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getId() {
        return Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return String.format("Id=%s,\nName=%s,\nLastName=%s",Id,Name,LastName); //To change body of generated methods, choose Tools | Templates.
    }
    
}
