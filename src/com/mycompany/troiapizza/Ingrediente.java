/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.troiapizza;

/**
 *
 * @author danic
 */
public enum Ingrediente {
     
    SBBQ("Salsa BBQ", 01), SBOU("Salsa Bourbon", 02), STOM("Salsa de tomate", 03), SCREM("Salsa crema", 04),
    CYRK("Jamón York", 11), CBCN("Bacon", 12), CPPK("Pulled Pork", 13), CPPP("Pepperoni", 14), CNCH("Anchoas", 15), CATN("Atún", 16),
    VCHM("Champiñones", 21), VACT("Aceitunas", 22), VCEB("Cebolla", 23), VCCR("Cebolla caramelizada", 24), VTOM("Tomate", 25),
        VPIV("Pimiento verde", 26), VPIR("Pimiento rojo", 27), VPNA("Piña", 28), VMIZ("Maiz", 29),
    QPAR("Queso parmesano", 31), QMZZ("Queso mozzarela", 32), QCDD("Queso cheddar", 33), QAZL("Queso azul", 34), QEDM("Queso edam", 35);
    
    
    public final String label;
    public final int pos;
    
    private Ingrediente(String label, int pos){
        this.label = label;
        this.pos = pos;
    }
    
    
}
