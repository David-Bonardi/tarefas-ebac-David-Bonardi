package br.com.dbonardi;

/**
 * @author David Bonardi
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCNPJ: " + getCnpj();
    }
}
