/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Admin
 */
public class Doctor extends User {

    private String specialty;

    public Doctor(String id, String name, String username, String password, String specialty) {
        super(id, name, username, password);
        this.specialty = specialty;
    }

    // Getter and Setter methods
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
