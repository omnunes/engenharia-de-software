public class PontoSela {
    public static void main(String[] args){
        int[][] matriz = {{1,3,5},
                          {2,4,6},
                          {7,8,9}};
        boolean foundPontoSela = false;

        for(int i = 0; i < matriz.length; i++){
            int minLinha = matriz[i][0];
            int minColuna = 0;
            
            // Encontra o menor valor da linha
            for(int j = 1; j < matriz[i].length; j++){
                if(matriz[i][j] < minLinha){
                    minLinha = matriz[i][j];
                    minColuna = j;
                }
            }
            boolean maiorNaColuna = true;
            for(int k = 0; k < matriz.length; k++){
                if(matriz[k][minColuna] > minLinha){
                    maiorNaColuna = false;
                    break;
                }
            }
            if(maiorNaColuna){
                System.out.println("Ponto de sela encontrado: "+minLinha+ ", na posição ("+i+ ", "+minColuna+ ")");
                foundPontoSela = true;
            }
        }
        
        if(!foundPontoSela){
            System.out.println("Não há ponto de sela na matriz");
        }
    
    }
}