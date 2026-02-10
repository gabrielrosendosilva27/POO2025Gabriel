package Gabriel.silva.dcx;

import java.util.Collection;
import java.io.IOException;

public interface Agenda {
    public boolean cadastrarContato(String nome, int dia, int mes);
    public Collection<Contato> pesquisarAniversarioantes(int dia, int mes);
    public boolean removeContato(String nome) throws ContatoInexistenteException;
    public void salvarDados() throws IOException;
    public void recuperarDados() throws IOException;
}