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

public class Billing {
    private String billingId;
    private String patientId;
    private double amount;
    private String status;

    public Billing(String billingId, String patientId, double amount, String status) {
        this.billingId = billingId;
        this.patientId = patientId;
        this.amount = amount;
        this.status = status;
    }

    // Getter and Setter methods
    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
