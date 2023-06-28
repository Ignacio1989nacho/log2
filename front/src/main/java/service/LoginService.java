/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import gui.VistaMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LoginService {

    public static boolean ingresar(String p, String u) {

        String user = "pablo";
        String contr = "elpepo";
        boolean comp = false;

        if (u.equals(user) && p.equals(contr)) {

            VistaMenu mg = new VistaMenu();
            mg.setVisible(true);
            comp = true;
            return comp;

        } else {
            return comp;
        }

    }

}


