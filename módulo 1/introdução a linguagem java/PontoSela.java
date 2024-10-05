import java.util.Scanner;

public class PontoSela {
    public static void main(String[] args){
        int[][] matriz = {{9,8,7},
                          {5,3,2},
                          {6,6,7}}; // Matriz 3x3
        boolean foundPontoSela = false;
        for(int i = 0; i < matriz.length; i++){
            int menor = matriz[i][0];
            int coluna = 0;
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                    coluna = j;
                }
            }
            int maior = matriz[i][coluna];
            for(int k = 0; k < matriz.length; k++){
                if(matriz[k][coluna] > maior){
                    maior = matriz[k][coluna];
                }
            }
            if(maior == menor){
                System.out.println("Ponto de sela encontrado na linha " +i+ " coluna " +coluna);
                foundPontoSela = true;
            }
        }
    }
    
}
