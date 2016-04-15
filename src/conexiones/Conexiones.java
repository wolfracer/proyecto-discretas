/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import clases.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cristhian
 */
public class Conexiones {
    
        static String[] maq, conex, mant;
        static ArrayList<String> valores = new ArrayList();
        static archivo arch = new archivo();
        static grafoND grafo = new grafoND(maq, conex, mant);
    
    public static void main(String[] args) throws IOException {
        //Prueba de la creacion y llenado de un grafo
        arch.leerArchivo(valores);
        grafo.llenarGrafo(valores);
        grafo.mostrarMaquinas();
        grafo.mostrarConexiones();
        grafo.mostrarMantenimiento();
    }
    
}
