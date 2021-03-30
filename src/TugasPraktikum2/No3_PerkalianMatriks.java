package TugasPraktikum2;
public class No3_PerkalianMatriks {
    public static void main(String[] args) {
        System.out.println("Fika Nur Hasari - 21092001");
        System.out.println("No.3 Perkalian Matriks");
    int [][] A = {
        {1, 2, 3},
        {4, 0, 1},
    };
    int [][] B = {
        {1, 2},
        {3, 1},
        {0, 2},
    };
    
    if(A[0].length == B.length) {   
       int[][] C = new int [A.length] [B[0].length];
       for (int i=0; i<A.length; i++) { 
            for (int j=0; j<B[0].length; j++) { 
                for (int k=0; k<A[0].length; k++) { 
                    C[i][j] += A[i][k] * B[k][j]; 
                }                                 
            }                                     
        }
        for (int[] c: C) {
            for (int i: c) {
                System.out.print (i+" ");
            }
            System.out.println();
        }
    }
    else {
        System.out.println("Ukuran kolom A tidak sama dengan baris B");
    }
  }
    
}
