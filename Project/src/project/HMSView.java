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
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class HMSView {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel adminPanel;
    private JPanel doctorPanel;
    private JPanel receptionistPanel;
    private JPanel patientPanel;

    public HMSView() {
        frame = new JFrame("Hospital Management System");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create and add different panels (login, admin, doctor, receptionist, patient)
        mainPanel.add(createLoginPanel(), "Login");
        adminPanel = new JPanel();
        doctorPanel = new JPanel();
        receptionistPanel = new JPanel();
        patientPanel = new JPanel();
        mainPanel.add(adminPanel, "Admin");
        mainPanel.add(doctorPanel, "Doctor");
        mainPanel.add(receptionistPanel, "Receptionist");
        mainPanel.add(patientPanel, "Patient");

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        formPanel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        formPanel.add(usernameField);
        formPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        formPanel.add(passwordField);

        loginButton = new JButton("Login");
        formPanel.add(new JLabel());
        formPanel.add(loginButton);

        panel.add(formPanel, BorderLayout.CENTER);

        return panel;
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setLoginAction(Action action) {
        loginButton.setAction(action);
    }

    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }

    public void updateAdminPanel(List<User> users) {
        adminPanel.removeAll();
        adminPanel.add(new JLabel("Admin Dashboard"));
        for (User user : users) {
            adminPanel.add(new JLabel(user.getName()));
        }
        adminPanel.revalidate();
        adminPanel.repaint();
    }

    public void updateDoctorPanel(List<Appointment> appointments) {
        doctorPanel.removeAll();
        doctorPanel.add(new JLabel("Doctor Dashboard"));
        for (Appointment appointment : appointments) {
            doctorPanel.add(new JLabel(appointment.getAppointmentId() + " - " + appointment.getDate()));
        }
        doctorPanel.revalidate();
        doctorPanel.repaint();
    }

    public void updateReceptionistPanel(List<Appointment> appointments) {
        receptionistPanel.removeAll();
        receptionistPanel.add(new JLabel("Receptionist Dashboard"));
        for (Appointment appointment : appointments) {
            receptionistPanel.add(new JLabel(appointment.getAppointmentId() + " - " + appointment.getDate()));
        }
        receptionistPanel.revalidate();
        receptionistPanel.repaint();
    }

    public void updatePatientPanel(List<EMR> emrs) {
        patientPanel.removeAll();
        patientPanel.add(new JLabel("Patient Dashboard"));
        for (EMR emr : emrs) {
            patientPanel.add(new JLabel(emr.getEmrId() + " - " + emr.getCurrentTreatment()));
        }
        patientPanel.revalidate();
        patientPanel.repaint();
    }
}
