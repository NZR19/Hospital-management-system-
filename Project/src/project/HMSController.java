/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class HMSController {
    private HMSView view;
    private HMSModel model;

    public HMSController(HMSView view, HMSModel model) {
        this.view = view;
        this.model = model;

        view.setLoginAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String username = view.getUsername();
        String password = view.getPassword();
        User user = model.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            if (user instanceof Admin) {
                view.showPanel("Admin");
                List<User> users = model.getUsers();
                view.updateAdminPanel(users);
            } else if (user instanceof Doctor) {
                view.showPanel("Doctor");
                List<Appointment> appointments = model.getAppointments();
                view.updateDoctorPanel(appointments);
            } else if (user instanceof Receptionist) {
                view.showPanel("Receptionist");
                List<Appointment> appointments = model.getAppointments();
                view.updateReceptionistPanel(appointments);
            } else if (user instanceof Patient) {
                view.showPanel("Patient");
                List<EMR> emrs = model.getEmrs();
                view.updatePatientPanel(emrs);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid login credentials");
        }
    }
}
