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
public class EMR {
    private String emrId;
    private String patientId;
    private String medicalHistory;
    private String currentTreatment;

    public EMR(String emrId, String patientId, String medicalHistory, String currentTreatment) {
        this.emrId = emrId;
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
        this.currentTreatment = currentTreatment;
    }

    // Getter and Setter methods
    public String getEmrId() {
        return emrId;
    }

    public void setEmrId(String emrId) {
        this.emrId = emrId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getCurrentTreatment() {
        return currentTreatment;
    }

    public void setCurrentTreatment(String currentTreatment) {
        this.currentTreatment = currentTreatment;
    }
}
