public class Main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ian";
        //pessoa.comissao = 8.5; //Erro, pois nao é possivel acessar o atributo comissao da classe Vendedor, devido a falra de herança

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Midori";
        vendedor.comissao = 8.5; //Correto, pois a classe Vendedor herda de Pessoa
    }
}
