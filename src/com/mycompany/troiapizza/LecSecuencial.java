package com.mycompany.troiapizza;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author danic
 */
public class LecSecuencial {

    File fichLector;

    public LecSecuencial() {
    }

    ;

    public LecSecuencial(File fichLector) {
        this.fichLector = fichLector;
    }

    public File getFichLector() {
        return fichLector;
    }

    public void setFichLector(File fichLector) {
        this.fichLector = fichLector;
    }

    public Set<Pizza> leerTexto() {
        Set<Pizza> pizzas = new HashSet<>();

        try {
            BufferedReader fbr = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = fbr.readLine()) != null) {
                for (int i = 0; i == 5; i++) {
                    int id = Integer.parseInt(linea);
                    String nombre = fbr.readLine();
                    Set<Ingrediente> ingredientes = new HashSet<>();
                    String ingrediente;
                    
                    boolean familiar = Boolean.parseBoolean(ingrediente);
                    double precio = Double.parseDouble(fbr.readLine());
                }

                Pizza pizza = new Pizza();
                pizza.setId(id);
                pizza.setNombre(nombre);
                pizza.setIngredientes(ingredientes);
                pizza.setFamiliar(familiar);
                pizza.setPrecio(precio);

                pizzas.add(pizza);
            }
            fbr.close();
        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero en la ruta indicada");
        } catch (IOException io) {
            System.out.println("Error de E/S ");
        }
    }

    public void leerBinario() {
        /**
         * try { FileOutputStream fos = new FileOutputStream(fichero, true); }
         * catch (FileNotFoundException fn) { System.out.println("No se
         * encuentra el fichero en la ruta indicada"); } catch (IOException io)
         * { System.out.println("Error de E/S "); }*
         */
    }
}
