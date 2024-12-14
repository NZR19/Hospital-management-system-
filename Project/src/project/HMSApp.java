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
import javax.swing.SwingUtilities;

public class HMSApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HMSView view = new HMSView();
            HMSModel model = new HMSModel();
            new HMSController(view, model);
        });
    }
}
