/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilos_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;

/**
 *
 * @author lizeth
 */
public class Principal implements Runnable {
    private String nombre;
    int cont1, cont2, cont3;
    
    String blue="\033[34m";
    String red="\033[31m";
    String green="\033[32m"; 
    String black="\033[30m";
    
    public Principal(String nombre){
        this.nombre = nombre;
    }
    // Cada hilo avanza de a 10 pasos para llegar al proximo hilo
    // La carrera termina a penas los tres hilo completen los paso y lleguen al total de 30 pasos
    @Override
    public void run(){
       int i;
       for(i = 0; i < 10; i++){
            try {
                pasos(1);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(black+" "+nombre);
    }
   
    private synchronized void pasos(int avanzar){
        for (int j = 0; j < avanzar; j++){
            if(nombre.equalsIgnoreCase("Equipo 1")){
            System.out.print(blue+"-");
            cont1++;
            } else if(nombre.equalsIgnoreCase("Equipo 2")){
                System.out.print(red+"-");
                cont2++;
            } else if(nombre.equalsIgnoreCase("Equipo 3")){
                System.out.print(green+"-");
                cont3++;
            }
        }
    }
}
