public class Notificacao {
    public void enviar(String mensagem){
        System.out.println("Enviando notificação: " + mensagem);
    }

    public void enviar(String mensagem, String destinatario){
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}
