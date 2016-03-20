/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.*;
import java.io.*;
/**
 *
 * @author cristhian
 */
public class grafoND {
    
    BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<vertice> listaVertices= new ArrayList<vertice>();
    ArrayList<arco> listaArcos= new ArrayList<arco>();
    arco a;
    vertice v;
    int cantidadvertices, fila, columna;
    String nombre, tipo;
    char tipo_aux;
    grafoND g;
    
    public grafoND() {
    }
    public grafoND(ArrayList listaVertices, ArrayList listaArcos) {
        this.listaVertices=listaVertices;
        this.listaArcos=listaArcos;
    }
    
    public void llenarGrafo(int mgrafo[][], grafoND g) {
        for (fila=0;fila<mgrafo[0].length;fila++){
            try {
                System.out.println("Ingrese nombre del vertice "+(fila+1)+":");
                nombre=en.readLine();
                System.out.println("Escriba si es maquina(M) o servidor(S):");
                tipo=en.readLine();
                tipo_aux=tipo.charAt(0);
            }
            catch (IOException e) {}
            listaVertices.add(v=new vertice(nombre,tipo_aux));
            for (columna=0; columna<mgrafo[0].length; columna++  ) {
                if (mgrafo[fila][columna]==1){
                    listaArcos.add(a=new arco(fila,columna));                    
                }                    
            }
        }
        g = new grafoND(listaVertices,listaArcos);
    }
    
    public void mostrarGrafo() {
        
        Iterator<vertice> iterador= this.listaVertices.iterator();
        while (iterador.hasNext()) {
            vertice vert = iterador.next();
            vert.mostrar();
        }
        
        Iterator<arco> iterador2= this.listaArcos.iterator();
        while (iterador2.hasNext()) {
            arco arc = iterador2.next();
            arc.mostrar();
        }
    }
}
