import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args){
        //Cria um ArrayList de strings
        ArrayList<String> lista = new ArrayList<>();

        //Adiciona elementos na lista
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");
        lista.add("Manga");

        System.out.println("Elementos da lista: "+ lista);

        //Adiciona um elemento antes da elemento informado
        lista.add(lista.indexOf("Banana"), "Pera");
        System.out.println("Elementos da lista após adicionar um elemento (Pera) antes de Banana: "+ lista);

        //Acessar um elemento especifico
        String fruta = lista.get(1);
        System.out.println("Elemento na posição 1: "+ fruta);

        //Remover um elemento
        lista.remove("Banana");
        System.out.println("Elementos da lista após remover Banana: "+ lista);

        //Substituir um elemento
        lista.set(2, "Uva");
        System.out.println("Elementos da lista após substituir Laranja por Uva: "+ lista);

        //Verificar se um elemento existe na lista
        if(lista.contains("Manga")){
            System.out.println("O elemento procurado (Manga) está na lista");
        }
        else{
            System.out.println("O elemento procurado (Manga) não está na lista");
        }

        //Ordenar a lista
        lista.sort(null);
        System.out.println("Elementos da lista após ordenar: "+ lista);

        //Ordenar a lista de forma decrescente através de Collections
        Collections.reverse(lista);
        System.out.println("Elementos da lista após ordenar de forma decrescente: "+ lista);

        //Tamanho da lista
        System.out.println("Tamanho da lista: "+ lista.size());

        //Limpar a lista
        lista.clear();

        //Verificar se a lista está vazia
        if(lista.isEmpty()){
            System.out.println("A lista está vazia");
        }
        else{
            System.out.println("A lista não está vazia");
        }
    }   
}
