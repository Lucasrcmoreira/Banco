/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Lucas Ramos
 */
public class ContaBancaria {
    private double saldo;
          private int numero;
          private int senha;
          
          public ContaBancaria(int numero, int senha){
              this.numero = numero;
              this.senha = senha;
          }  

          
          public void depositar(double valor){
              double novoSaldo = saldo + valor;
              saldo = novoSaldo;
          }

          public void sacar(double valor){
	     	  double novoSaldo = saldo - valor;
              saldo = novoSaldo;
          }
          
          public void transferir(double valor, ContaBancaria contaDestino){
          	    //retirando da conta de origem
          	    saldo = saldo - valor;
          	    
          	    //colocando na conta destino
          	    contaDestino.saldo = contaDestino.saldo + valor;
          }

          public double getSaldo( ){
      	      return saldo;
          }
          
          public int getNumero(){
              return numero;
          }
          
          public int getSenha(){
              return senha;
          }
}
