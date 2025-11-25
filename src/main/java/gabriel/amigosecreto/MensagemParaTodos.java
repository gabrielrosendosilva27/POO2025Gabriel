package gabriel.amigosecreto;

public abstract class MensagemParaTodos  extends  Mensagem {

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima){
        super(texto, emailRemetente, anonima);
    }
    public String getTextoCompletoAExibir(){
        return  "Mensagem de: " + super.getEmailRemetente() + ". Texto: " + super.getTexto();
        }
    }

