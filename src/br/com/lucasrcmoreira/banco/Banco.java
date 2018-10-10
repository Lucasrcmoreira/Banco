package br.com.lucasrcmoreira.banco;


import java.util.*;

public class Banco {

    
        private ArrayList<ContaBancaria> lista;

        public Banco() {
            lista = new ArrayList<ContaBancaria>();
        }

        public void adicionar(ContaBancaria b) {
            lista.add(b);
        }

        public ContaBancaria consultar(int numero) {
            ContaBancaria contaEncontrada = null;
            for (int i = 0; i < lista.size(); i++) {
                ContaBancaria b = lista.get(i);
                if (b.getNumero() == numero) {
                    contaEncontrada = b;
                }
            }
            return contaEncontrada;
        }
                
        public int contarContaSaldoMin(double valor){
            int	quantidade  =  0;	
                    for(int i=0; i<lista.size(	);i++){	
                    ContaBancaria b = lista.get(i);	
                    if(b.getSaldo()>= valor){	
                        quantidade +=  1;	
                    }							
                }
            return quantidade;
        }
        public int contarContaSaldoMax(double valor){
            int	quantidade  =  0;	
                    for(int i=0; i<lista.size(	);i++){	
                    ContaBancaria b = lista.get(i);	
                    if(b.getSaldo()<= valor){	
                        quantidade +=  1;	
                    }							
                }
            return quantidade;
        }
        
        public ContaBancaria consultaContaSaldoMaximo() {
        ContaBancaria contaMaiorSaldo = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            ContaBancaria conta = lista.get(i);
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        return contaMaiorSaldo;
    }
    }


