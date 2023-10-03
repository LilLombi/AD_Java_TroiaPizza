package com.mycompany.troiapizza;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.xml.*;
import org.w3c.dom.*;

/**
 *
 * @author danic
 */
public class Main {

    private static final Properties myProperties = new Properties();
    
    public static void main(String[] args) {

         try {
            Main.myProperties.load(new FileInputStream("pizzaApp.properties"));
        } catch (IOException e) {
            System.out.println("No se pueden cargar la inicialización del programa. Saliendo...");
            System.exit(100);
        }
    }
}
