public class ExSobrecargaComSobrescrita {
    public static void main(String[] args){
        Notificacao notificacao = new Notificacao();
        notificacao.enviar("da classe Pai.");
        notificacao.enviar("foi enviado a partir da classe Pai.", "João");

        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
        notificacao.enviar("da classe Filho, sobreescreveu a Pai.");
        notificacao.enviar("foi enviado a partir da classe Filho, sobrescrevendo a classe Pai.", "João");
    }

}

class Notificacao {
    public void enviar(String mensagem){
        System.out.println("Enviando notificação: " + mensagem);
    }

    public void enviar(String mensagem, String destinatario){
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}

class NotificacaoEmail extends Notificacao{
    @Override
    public void enviar(String mensagem){
        //Sobrescreve o método enviar para enviar mensagem por email
        System.out.println("Enviando email: " + mensagem);
    }

    @Override
    public void enviar (String mensagem, String destinatario){
        //Sobrescreve o método enviar para enviar mensagem por email para um destinatário específico
        System.out.println("Enviando email para " + destinatario + ": " + mensagem);
    }
}