/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.prg2;

/**
 *
 * @author DELL
 */
public class HiloCliente implements Runnable{

    Cuenta cuenta;
    int cantidad;

    public HiloCliente(Cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        /* Forzamos la maquinaria: repetimos
        la operación muchísimas veces para
        intentar verificar si la simulación es
        correcta
         */
        for (int i = 0; i < 100; i++) {
            cuenta.hacerMovimiento(cantidad);
            System.out.println(cuenta.getSaldo());
        }
    }
}
