package Gabriel.silva.dcx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AgendaGabriel implements Agenda {
    private GravadorDeDados gravadorDeDados = new GravadorDeDados();
    private HashMap<String, Contato> contatos = new HashMap<>();

    @Override
    public boolean cadastrarContato(String nome, int dia, int mes) {
        if (this.contatos.containsKey(nome)) {
            return false;
        } else {
            Contato contato = new Contato(nome, dia, mes);
            this.contatos.put(nome, contato);
            return true;
        }
    }
    @Override
    public Collection<Contato> pesquisarAniversarioantes(int dia,int mes) {
        List<Contato> aniversariantes = new ArrayList<>();
        for (Contato contato : this.contatos.values()) {
            if (contato.getDiaAniversario() == dia && contato.getMesAniversario() == mes) {
                aniversariantes.add(contato);
            }
        }
        return aniversariantes;
    }
    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        if (this.contatos.containsKey(nome)) {
            this.contatos.remove(nome);
            return true;
        } else {
            throw new ContatoInexistenteException("Contato não existe!");
        }
    }
    @Override
    public void salvarDados() throws IOException {
        gravadorDeDados.salvarContato(this.contatos.values());
    }
    @Override
    public void recuperarDados() throws IOException {
        Collection<Contato> contatoesRecuperados = gravadorDeDados.recuperarContatos();
        for (Contato c : contatoesRecuperados) {
            this.contatos.put(c.getNome(), c);
        }
    }
}