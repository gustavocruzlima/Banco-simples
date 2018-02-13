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
public class DadosCliente implements Builder {
    private String nomeCliente;
    private String dataNasc;
    private int CPF;
    private String RG;
    private float rendaMensal;
    private String endereco;

    public DadosCliente(String nomeCliente, String dataNasc, int CPF, String RG, float rendaMensal, String endereco) {
        this.nomeCliente = nomeCliente;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
        this.RG = RG;
        this.rendaMensal = rendaMensal;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String dados(String nomeCliente, String dataNasc, String CPF, String RG, String rendaMensal, String endereco) {
        return "Nome: "+nomeCliente+" data de nascimento "+dataNasc+" CPF: "+CPF+" RG: "+RG+" Renda mensal: "+rendaMensal+" Endereco: "+endereco;
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
return null;
    }
    
    
}
