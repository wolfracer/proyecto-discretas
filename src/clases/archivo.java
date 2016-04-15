/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;

/**
 *
 * @author cristhian
 */
public class archivo {
    
    String linea;
    int contador=0, indice=0, numero;
    File arch = new File("C:\\Users\\cristhian\\Documents\\NetBeansProjects\\conexiones\\src\\clases\\archivo.txt");
    FileReader fr = null;
    BufferedReader br;
    
    public void leerArchivo(ArrayList<String> val) throws IOException {
        
        try {
            fr = new FileReader (arch);
            br = new BufferedReader(fr);
            while ((linea=br.readLine())!=null) {
                val.add(linea);
            }
        }
        catch ( SecurityException securityException ) {
            System.err.println("No tienes derecho a entrar al archivo" );
            System.exit( 1 );
        }
        catch ( FileNotFoundException fileNotFoundException ) {
            System.err.println( "Error al abrir o crear el archivo" );
            System.exit(1);
        }
        finally {
            try {                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }
            catch (Exception ex){ 
                ex.printStackTrace();
            }
        }
    }
    
    public void escribirArchivo() {
        
    }
    
    

}