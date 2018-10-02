/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.*;

/**
 *
 * @author Lucas Ramos
 */
public class Banco {

   private ArrayList<ContaBancaria> lista;

    public Banco(){
        lista = new ArrayList<ContaBancaria>( );
    }
    
    public void adicionar(ContaBancaria b){
        lista.add(b);
    }
    
    public ContaBancaria consultar(int numero){
        ContaBancaria contaEncontrada = null;
        for(int i=0; i < lista.size(); i++){
            ContaBancaria b = lista.get( i );
            if(b.getNumero() == numero){
                contaEncontrada = b;
            }
        }
        return  contaEncontrada;
    }
    
    
}
