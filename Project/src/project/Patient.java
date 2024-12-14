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
public class Patient extends User {
    private String medicalHistory;

    public Patient(String id, String name, String username, String password, String medicalHistory) {
        super(id, name, username, password);
        this.medicalHistory = medicalHistory;
    }

    // Getter and Setter methods
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
