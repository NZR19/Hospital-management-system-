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
import java.util.ArrayList;
import java.util.List;

public class HMSModel {
    protected List<User> users;
    protected List<Appointment> appointments;
    protected List<Billing> billings;
    protected List<Inventory> inventories;
    protected List<EMR> emrs;

    public HMSModel() {
        users = new ArrayList<>();
        appointments = new ArrayList<>();
        billings = new ArrayList<>();
        inventories = new ArrayList<>();
        emrs = new ArrayList<>();
    }

    // Methods to manage users
    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    // Methods to manage appointments
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    // Methods to manage billing
    public void addBilling(Billing billing) {
        billings.add(billing);
    }

    public List<Billing> getBillings() {
        return billings;
    }

    // Methods to manage inventory
    public void addInventory(Inventory inventory) {
        inventories.add(inventory);
    }

    public List<Inventory> getInventories() {
        return inventories;
    }

    // Methods to manage EMR
    public void addEMR(EMR emr) {
        emrs.add(emr);
    }

    public List<EMR> getEmrs() {
        return emrs;
    }
}
