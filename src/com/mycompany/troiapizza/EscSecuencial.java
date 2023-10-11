/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.troiapizza;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author danic
 */
public class EscSecuencial {
    
    public static void escribirObjetos(String nombreArchivo, Object... objetos) {
        try {
            // Crear un FileOutputStream para escribir en el archivo
            FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo);

            // Crear un ObjectOutputStream para escribir objetos en el archivo
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Escribir cada objeto en el archivo
            for (Object objeto : objetos) {
                objectOutputStream.writeObject(objeto);
            }

            // Cerrar el ObjectOutputStream (esto también cierra el FileOutputStream)
            objectOutputStream.close();

            System.out.println("Los objetos se han escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir objetos en el archivo: " + e.getMessage());
        }
    }
}
