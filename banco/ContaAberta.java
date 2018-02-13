/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author gustavo.fclima
 */
public class ContaAberta extends DadosCliente {

    public ContaAberta(String nomeCliente, String dataNasc, int CPF, String RG, float rendaMensal, String endereco) {
        super(nomeCliente, dataNasc, CPF, RG, rendaMensal, endereco);
    }
    
    /**
     *
     * @param limite
     * @return
     */
    @Override
    public String credito(String limite){
        return "Limite de credito"+limite;
        
    }

    
}
