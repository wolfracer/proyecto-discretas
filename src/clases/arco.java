/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author cristhian
 */
public class arco {
    
    //Declaracion de variables que afectan a la clase arco
    private int[] arista = new int[2];
    
    public arco(int fila, int columna) {
        // Atributos de la clase arco. Los indices del arreglo representan la conexion entre vertices
        arista[0]=fila;
        arista[1]=columna;
    }
    
    //Muestra 
    public void mostrar() {
        System.out.print("("+(this.arista[0]+1)+","+(this.arista[1]+1)+") / ");
    }
}
