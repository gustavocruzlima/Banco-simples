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
public class ContaCorrente implements Builder{
    private float saldo;
    private float limiteDeSaque;

    public ContaCorrente(float saldo, float limiteDeSaque) {
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(float limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
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
        return "Saldo: "+saldo+" Limite de saque: "+limiteDeSaque;
    }

    @Override
    public String credito(String limite) {
        return null;
    }
    
    
    
}
