package A_Array;

/**
 * @Classname E_Spiral_Matrix_II_L59M
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/12/28 21:22
 * @Created by maicaoboy
 */
public class E_Spiral_Matrix_II_L59M {
    public int[][] generateMatrix(int n) {
        int[][] matrix= new int[n][n];
        circleProcess(matrix, n, 1, 0);
        return matrix;
    }
    
    void circleProcess(int[][] matrix, int n, int cnt, int level) {
        int move = n - (level * 2);
        if(move == 0) return;
        if(move == 1) {
            matrix[level][level] = cnt++;
            return;
        }
        int edge = level + move - 1;
        for (int i = level; i < edge; i++) {
            matrix[level][i] = cnt++;
        }
        for (int i = level; i < edge; i++) {
            matrix[i][edge] = cnt++;
        }
        for (int i = edge; i > level; i--) {
            matrix[edge][i] = cnt++;
        }
        for (int i = edge; i > level; i--) {
            matrix[i][level] = cnt++;
        }
        circleProcess(matrix, n, cnt, level + 1);
    }
}
