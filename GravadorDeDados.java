package Gabriel.silva.dcx;

import Gabriel.silva.dcx.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class GravadorDeDados {
    private String arquivoDados = "contatos.dat";

    public void salvarContato(Collection<Contato> contatos) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivoDados))) {
            out.writeObject(new ArrayList<>(contatos));
        }
    }
    public Collection<Contato> recuperarContatos() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivoDados))) {
            return (Collection<Contato>) in.readObject();
        } catch (ClassNotFoundException | ClassCastException e) {
            throw new IOException("Erro ao recuperar dados", e);
        }
    }
}