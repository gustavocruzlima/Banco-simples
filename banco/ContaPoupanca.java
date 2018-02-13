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
public class ContaPoupanca implements Builder{
    private float saldo;
    private float rendimento;

    public ContaPoupanca(float saldo, float rendimento) {
        this.saldo = saldo;
        this.rendimento = rendimento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String dados(String nomeCliente, String dataNasc, String CPF, String RG, String rendaMensal, String endereco) {
        return null;
    }

    @Override
    public String poupanca(String saldo, String rendimento) {
    return  "Saldo: "+saldo+" Rendimento: "+rendimento;
    }

    @Override
    public String corrente(String saldo, String limiteDeSaque) {
        return null;
    }

    @Override
    public String credito(String limite) {
return null;
    }
    
    
    
}
