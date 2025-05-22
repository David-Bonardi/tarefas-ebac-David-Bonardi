package br.com.dbonardi;

/**
 * @author David Bonardi
 */
public class PessoaFisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf();
    }
}
