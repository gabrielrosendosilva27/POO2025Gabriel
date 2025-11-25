package gabriel.silva.dcx.ufpb.br;

public class ProgramaCliente {
    void main(){
        ClienteSistema sistema = new ClienteSistema();
        boolean continuar = true;
        while(continuar) {
            String opcao = IO.readln("Digite uma opção:\n1.cadastrar cliente\n2.Pesquisar todos\n3.Sair");
            if (opcao.equals("1")){
                String nome = IO.readln("Nome do Cliente:\n");
                String idade = IO.readln("Idade do Cliente:\n");
                String cpf = IO.readln("CPF do Cliente:\n");
                try {
                    sistema.cadastrarCliente(nome,idade,cpf);
                } catch(ClienteExisteException e){
                    IO.println();
                }
            }
        }
    }
}
