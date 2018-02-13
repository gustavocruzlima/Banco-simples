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
public class CartaoCredito implements Builder{
    private float limite;

    public CartaoCredito(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String dados(String nomeCliente, String dataNasc, String CPF, String RG, String rendaMensal, String endereco) {
return null;
    }

    @Override
    public String poupanca(String saldo, String rendimento) {
return null;
    }

    @Override
    public String corrente(String saldo, String limiteDeSaque) {
return null;
    }

    @Override
    public String credito(String limite) {
        return " Limite de credito "+limite;
    }
   
    
    
}
