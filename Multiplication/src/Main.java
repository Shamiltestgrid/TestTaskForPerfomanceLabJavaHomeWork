public class Main {

    public static void main(String[] args) {

        int [] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        int [][] total = new int[numbers.length][numbers.length];

       for (int i = 0; i < total.length; i++){
           total[0][i] = numbers [i];
       }
        for (int i = 1; i < total.length; i++){
            for (int j = 0; j < total[i].length; j++){
                total[i][j] = total[0][i] * total[0][j];
            }
        }

        for(int[] row: total)
        {   System.out.println("");
            for(int element: row)
                System.out.print(element + " ");
        }
    }
}
