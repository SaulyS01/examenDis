/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen.prg2;

/**
 *
 * @author DELL
 */
public class Cuenta {

    private int saldo;
    private int saldoInicial;

    public Cuenta(int saldo) {
        this.saldoInicial = saldo;
        this.saldo = saldo;
    }

    public synchronized void hacerMovimiento(int cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public boolean esSimulacionCorrecta() {
        if (this.saldo == this.saldoInicial) {
            return true;
        }
        return false;
    }

    public int getSaldo() {
        return this.saldo;
    }
}
