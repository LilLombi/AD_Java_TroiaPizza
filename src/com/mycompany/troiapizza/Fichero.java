/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.troiapizza;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danic
 */
public class Fichero {
    
    private static File dir = new File("./storage");
    private static Scanner read = new Scanner(System.in);
    
    public static File crearFichero(String route){
        File f = new File(dir, route);
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    public void moverFichero(File fich){
        //File f = new File(dir, route);
        String nruta;
        System.out.println("Indique la nueva ruta en la que desea establecer el fichero " + fich.getName());
        nruta = read.next();
        
    }
    
    public void copiarFichero(File fich){
        String nruta;
        System.out.println("Indique la nueva ruta en la que desea establecer el fichero " + fich.getName());
        nruta = read.next();
        File dest = new File(nruta);
        //FileUtils.copyFile(fich.getAbsoluteFile(), dest);
        
    }
    
    public void borrarFichero(File fich){
        if (fich.exists()){
            fich.delete();
        }
    }
}
