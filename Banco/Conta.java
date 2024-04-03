/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Gabriel
 */
    abstract class Conta {

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private double saldo = 0;
    private double limite;
    private int numero;
    private static int totalDeContas;
    private Cliente titular;
    
    public Conta() {
        System.out.println("Conta criada com sucesso.");
        Conta.totalDeContas += 1;
    }
    
    public Conta(double saldo) {
        this(); 
        this.saldo = saldo;
    }
    
    public Conta(double saldo, int numero) {
        this(saldo);
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public int getTotal() {
        return Conta.totalDeContas;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setCliente(Cliente cliente){ 
        this.titular = cliente;
    }
    
    void deposita(double valor)throws ValorInvalidoException{
    if (valor < 0) {
    throw new ValorInvalidoException(valor);
    } else {
    this.saldo += valor - 0.10;
}
}
    
    public boolean saca(double saque) {
        if(this.saldo < saque) {
            return false;
        }
        this.setSaldo(this.saldo - saque);
        return true;
    }
    
    public boolean transferir(Conta conta, double valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.setSaldo(this.saldo - valor);
        conta.setSaldo(conta.saldo + valor);
        return true;
    }
    
    abstract void atualiza(double taxa);
    
}

