/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.prg3;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Utilidades {

    static int numAzar(int n) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(n);
    }

    static void esperarTiempoAzar(int i) {
        try {
            Random randomNumber = new Random();
            int r = i/1000;
            randomNumber.nextInt(i);
            r = i * 1000;
            Thread.sleep(i);
        } catch (Exception e) {
            
        }
    }
}
