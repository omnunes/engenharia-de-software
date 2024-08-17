import java.util.Scanner;


public class estrutura_condicional {
    public static void main(String[] args){
        String nome;
        int opcaoMenu = 99;

        System.out.println("Informe o seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();

        while (opcaoMenu != 0){
            System.out.println("Olá " +nome+ " digite a opção desejada");
            System.out.println("1 - Verificar média\n" + 
                            "2 - Verificar ano bissexto\n" + 
                            "3 - Verificar numero primo\n" + 
                            "0 - Sair");
            opcaoMenu = sc.nextInt();

            switch(opcaoMenu){
                case 1: 
                    System.out.println("Média\n");
                    float nota1, nota2, media;
                    System.out.println("Informe a primeira nota: ");
                    nota1 = sc.nextFloat();
                    System.out.println("Informe a segunda nota: ");
                    nota2 = sc.nextFloat();
                    media = (nota1 + nota2) / 2;
                    if(media >= 6){
                        System.out.println("Aprovado");
                    }
                    else if(media < 6 && media >= 3){
                        System.out.println("Recuperação");
                    }
                    else{
                        System.out.println("Reprovado");
                    }
                    break;
                
                case 2:
                    System.out.println("Ano bissexto\n");
                    System.out.println("Informe o ano: ");
                    int ano = sc.nextInt();
                    if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                        System.out.println("Ano bissexto");
                    }
                    else{
                        System.out.println("Ano não bissexto");
                    }
                    break;

                case 3:
                    int n;
                    System.out.println("Número primo\n");
                    System.out.println("Informe um número: ");
                    n = sc.nextInt();
                    int cont = 0;
                    for(int i = 1; i < (n + 1); i++){
                        if(n % i == 0){
                            cont++;
                        }
                    }
                    System.out.println("O número " + n + " é primo? " + (cont == 2));
                    break;           
                    
                case 0:
                    System.out.println("Programa encerrado.");
                    opcaoMenu = 0;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break; 

            }
        }

    }
    
}
