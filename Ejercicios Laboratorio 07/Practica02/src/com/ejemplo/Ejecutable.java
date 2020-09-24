package com.ejemplo;

import com.ejemplo.gui.JFLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nacho
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            //Cargar el driver a memoria
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            JFLogin login = new JFLogin();
            login.setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el driver de la base de datos!");
        }

    }

}
