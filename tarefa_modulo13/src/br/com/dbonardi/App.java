package br.com.dbonardi;

/**
 * @author David Bonardi
 */
public class App {
    public static void main(String[] args) {

        System.out.println("***** Pessoa Física *****");
        PessoaFisica pessoaFisica = new PessoaFisica();

        pessoaFisica.setNome("David");
        pessoaFisica.setIdade(22);
        pessoaFisica.setCpf("434.566.444-76");

        System.out.println(pessoaFisica);

        System.out.println("***** Pessoa Jurídica *****");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaJuridica.setNome("NiceTech");
        pessoaJuridica.setIdade(10);
        pessoaJuridica.setCnpj("54.623.904/0001-73");

        System.out.println(pessoaJuridica);
    }
}
