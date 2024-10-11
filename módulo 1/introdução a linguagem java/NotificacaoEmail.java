public class NotificacaoEmail extends Notificacao{
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