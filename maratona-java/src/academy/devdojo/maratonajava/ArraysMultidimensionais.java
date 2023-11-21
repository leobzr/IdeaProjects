package academy.devdojo.maratonajava;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //esses arrays são basicamente os linked arrays.
        //int[][] dias = new int[3][3];
        //int[]  = new int[3];
        //Na primeira parte, vc pode ter a base do array, a segunda parte pode ser declarada depois

        int[][] arrayInt = new int[3][];

        

        for (int[] arrayBase: arrayInt) {
            for(int num: arrayBase){
                System.out.println(num);
            }

        }
    }
}
