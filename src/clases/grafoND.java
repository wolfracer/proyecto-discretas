/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
/**
 *
 * @author cristhian
 */
public class grafoND {
    
    private String[] maquinas, conexiones, maquinas_mant;

    /**
     *
     * @param maquinas
     * @param conexiones
     * @param maquinas_mant
     */
    public grafoND(String[] maquinas, String[] conexiones, String[] maquinas_mant) {
        this.maquinas = maquinas;
        this.conexiones = conexiones;
        this.maquinas_mant = maquinas_mant;
    }

    /**
     *
     * @param valores
     * @throws IOException
     */
    public void llenarGrafo(ArrayList<String> valores) throws IOException {
        
        int contador=0, indice=0, numero;
        String cadena;
        
        for (String valore : valores) {
            if (isNumeric(valore)) {
                indice=0;
                numero = Integer.parseInt(valore);
                if (contador==0){
                    this.maquinas = new String[numero];
                    contador++;
                }
                else if (contador==1) {
                    this.conexiones = new String[numero];
                    contador++;
                }
                else if(contador==2) {
                    this.maquinas_mant = new String[numero];
                    contador++;
                }
            } else {
                cadena = valore;
                if (contador==1) {
                    maquinas[indice] = cadena;
                    indice++;
                }
                if (contador==2) {
                    conexiones[indice] = cadena;
                    indice++;
                }
                if (contador==3) {
                    maquinas_mant[indice] = cadena;
                    indice++;
                }
            }
        }
    }
    
    public void mostrarMaquinas() {
        System.out.print("Maquinas en el grafo: \n");
        for (String maquina : this.maquinas) {
            System.out.print("<" + maquina + ">" + " ");
        }
        System.out.println("\n");
    }
    
    public void mostrarConexiones() {
        System.out.print("Conexiones de maquinas: \n");
        for (String conexione : this.conexiones) {
            System.out.print("<" + conexione + ">" + " ");
        }
        System.out.println("\n");
    }
    
    public void mostrarMantenimiento() {
        System.out.print("Maquinas a realizar mantenimiento: \n");
        for (String maquinas_mant1 : this.maquinas_mant) {
            System.out.print("<" + maquinas_mant1 + ">" + " ");
        }
        System.out.println("\n");
    }
    
    public static boolean isNumeric(String str) {
      NumberFormat formatter = NumberFormat.getInstance();
      ParsePosition pos = new ParsePosition(0);
      formatter.parse(str, pos);
      return str.length() == pos.getIndex();
    }
}
