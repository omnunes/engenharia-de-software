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