package gabriel.amigosecreto;

public class Amigo {
    private String nome;
    private String email;
    private String emailAmigoSecreto;

    public Amigo (String nome, String email, String emailAmigoSecreto) {
        this.nome=nome;
        this.email=email;
        this.emailAmigoSecreto=emailAmigoSecreto;

    }
    public String getNome() {
    return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmailAmigoSecreto() {
        return this.emailAmigoSecreto;
    }
    public void setEmailAmigoSecreto(String emailAmigoSecreto) {
        this.emailAmigoSecreto = emailAmigoSecreto;
    }
}
