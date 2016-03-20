/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import clases.*;

/**
 *
 * @author cristhian
 */
public class Conexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba de la creacion y llenado de un grafo
        int[][] grafo=new int[3][3];
        grafoND g=new grafoND();
        
        for (int i=0;i<3;i++) {
            for (int j=i;j<3;j++) {
                if (i==j) {
                    grafo[i][j]=0;
                }
                else {
                    grafo[i][j]=1;
                }
            }
        }
        g.llenarGrafo(grafo, g);
        g.mostrarGrafo();
    }
    
}
