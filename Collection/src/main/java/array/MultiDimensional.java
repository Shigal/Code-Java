package array;

public class MultiDimensional {
    public static void main(String[] args) {
        String nameSets[][] = new String[2][2];
        nameSets[0][0] = "Kate";

        int[][] num = {{1,2}, {10,20}, {100, 200}};
        System.out.println(num.length); // 3

        for(int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
