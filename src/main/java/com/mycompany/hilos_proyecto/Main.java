/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilos_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lizeth
 */
public class Main {
    public static void main(String[] args){
        Principal equipo1 = new Principal("Equipo 1");
        Thread hilo1 = new Thread(equipo1);
        Thread hilo2 = new Thread(equipo1);
        Thread hilo3 = new Thread(equipo1);
        Principal equipo2 = new Principal("Equipo 2");
        Thread hilo4 = new Thread(equipo2);
        Thread hilo5 = new Thread(equipo2);
        Thread hilo6 = new Thread(equipo2);
        Principal equipo3 = new Principal("Equipo 3");
        Thread hilo7 = new Thread(equipo3);
        Thread hilo8 = new Thread(equipo3);
        Thread hilo9 = new Thread(equipo3);

        // Arrancan los hilos todos al tiempo
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        
        /**
        try {
            hilo4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } hilo5.start();
        
        try {
            hilo5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } hilo6.start();
        
        try {
            hilo6.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } hilo7.start();
        
        try {
            hilo7.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } hilo8.start();
        
        try {
            hilo8.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } hilo9.start();
        */
    }
}
