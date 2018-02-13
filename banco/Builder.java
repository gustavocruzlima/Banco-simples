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
public interface Builder {
    
    public String dados(String nomeCliente,String dataNasc ,String CPF,String RG,String rendaMensal,String endereco);
    public String poupanca (String saldo, String rendimento);
    public String corrente (String saldo, String limiteDeSaque);
    public String credito(String limite);
            
            
}
