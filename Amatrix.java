public class Amatrix {
    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 12;
        flats[0][1] = 13;
        flats[0][2] = 14;
        flats[1][0] = 15;
        flats[1][1] = 16;
        flats[1][2] = 17;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
            }
        }
    }
}
