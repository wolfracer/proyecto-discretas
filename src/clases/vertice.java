/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;

/**
 *
 * @author cristhian
 */
public class vertice {
    
    private String nombre;
    private char tipo;

    public vertice(String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void mostrar() {
        System.out.print("Nombre: "+this.nombre+" Tipo: "+this.tipo+" / ");
    }
}
