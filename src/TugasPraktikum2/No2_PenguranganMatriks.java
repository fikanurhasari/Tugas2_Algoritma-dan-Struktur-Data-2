package TugasPraktikum2;
public class No2_PenguranganMatriks {
    public static void main (String[] args) {
    System.out.println("Fika Nur Hasari - 21092001");
    System.out.println("No.2 Pengurangan Matriks");
    
    int [][] A = {
        {3,  6  },
        {9,  12 },
        {15, 18 },
    };
        int [][] B = {
        {1, 3 },
        {5, 7 },
        {9, 11},
    };
    if ((A.length == B.length) && (A[0].length == B[0].length)) {
        int[][] C = new int [A.length][A[0].length] ;
        for (int i=0 ; i< A.length; i++){
            for(int j=0; j<A[0].length; j++) {
                C[i][j] = A [i][j] - B[i][j];
            }
        }
            for (int[] c: C) {
                for (int q: c) {
                    System.out.print (q+ " ");
                }
                System.out.println();
                }
            System.out.println(C[0] [1]);
        }
            System.out.println();
    }
    
}
