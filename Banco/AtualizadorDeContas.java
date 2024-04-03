/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Gabriel
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.setSaldo((c.getSaldo() + (c.getSaldo() * this.getSelic())));
        System.out.println("Saldo atualizado: " + c.getSaldo());
        this.setSaldoTotal(this.getSaldoTotal() + c.getSaldo());
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }


    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    
    public double getSelic() {
        return selic;
    }

    
    public void setSelic(double selic) {
        this.selic = selic;
    }
}
