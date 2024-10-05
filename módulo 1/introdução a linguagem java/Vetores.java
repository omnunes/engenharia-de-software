public class Vetores {
    public static void main(String[] args){
        int[] birdsPerDay= {0, 2, 5, 3, 7, 8, 4, 6, 2, 1, 0, 3, 4, 5};
        int totalBirds = 0;
        int birdsInWeek1 = 0;
        int birdsInWeek2 = 0;

        for(int i=0; i<birdsPerDay.length; i++){
            totalBirds += birdsPerDay[i];
            if(i<7){
                birdsInWeek1 += birdsPerDay[i];
            }
            if(i>=7){
                birdsInWeek2 += birdsPerDay[i];
            }
        }
        System.out.println("Total de pássaros: " + totalBirds);
        System.out.println("Total de pássaros na primeira semana: " + birdsInWeek1);
        System.out.println("Total de pássaros na segunda semana: " + birdsInWeek2);
    }
}
