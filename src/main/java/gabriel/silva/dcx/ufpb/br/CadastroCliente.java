package gabriel.silva.dcx.ufpb.br;

import java.util.Objects;

public class CadastroCliente {
    private String nome;
    private String idade;
    private String cpf;

    public CadastroCliente(String nome, String idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public CadastroCliente(){
        this("","","");
    }
    public String getNome(){
        return this.nome;
    }
    public String getIdade(){
        return this.idade;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String toString(){
        return this.nome + " : "+ this.idade+ "  " + this.cpf+ " " ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome,idade,cpf);
    }
}
