package br.com.dbonardi;

/**
 * @author David Bonardi
 */
public abstract class Pessoa {

    private String nome;

    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
