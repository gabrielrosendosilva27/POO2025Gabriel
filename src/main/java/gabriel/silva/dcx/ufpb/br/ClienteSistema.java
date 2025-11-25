package gabriel.silva.dcx.ufpb.br;

import java.util.ArrayList;
import java.util.List;

public class ClienteSistema {
    private List<CadastroCliente> clientes;

    public ClienteSistema(){
        this.clientes = new ArrayList<>();
    }
    public List<CadastroCliente> pesquisarTodosClientes(){
        return this.clientes;
    }
    public List<CadastroCliente> pesquisarTodosClientes(String nome, String idade, String cpf){
        List<CadastroCliente> pesquisarTodosClientes = new ArrayList<>();
        for (CadastroCliente a: this.clientes){
            if (a.getNome().equals(nome) || a.getIdade().equals(idade)
            || a.getCpf().equals(cpf)){
                pesquisarTodosClientes.add(a);
            }
        }
        return pesquisarTodosClientes;
    }
    public void cadastrarCliente(String nome, String idade, String cpf)
        throws ClienteExisteException {
        CadastroCliente cliente = new CadastroCliente(nome, idade, cpf);
        if (this.clientes.contains(nome)){
            throw new ClienteExisteException("Já existe um cliente com esses dados:" + cliente.toString());
        } else {
            this.clientes.add(cliente);
        }
    }
}
