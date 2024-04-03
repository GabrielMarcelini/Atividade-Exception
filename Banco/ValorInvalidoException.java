/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Gabriel
 */
public class ValorInvalidoException extends Exception {
    ValorInvalidoException(double valor) {
    super("Valor invalido: "+ valor);
    }

}
