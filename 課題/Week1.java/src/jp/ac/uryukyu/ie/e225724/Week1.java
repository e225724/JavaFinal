package jp.ac.uryukyu.ie.e225724;

public class Week1 {
    public static void printMatrix(double[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println();
        }
}
    
    public static double[][] computeAddMatrix(double[][] matrix_x, double[][] matrix_y){
        int matrix_x1 = matrix_x.length;
        int matrix_x2 = matrix_x[0].length;
        int matrix_y1 = matrix_y.length;
        int matrix_y2 = matrix_y[0].length;
        
        if(matrix_x1 != matrix_y1){
            System.err.println("行数がおかしい");
            System.exit(0);
        }else if(matrix_x2 != matrix_y2){
            System.err.println("列数がおかしい");
            System.exit(0);
        }

        double[][] result = new double[matrix_x1][matrix_x2];
        for(int i=0; i<matrix_x1; i++){
            for(int j=0; j<matrix_x2; j++){
                result[i][j] = matrix_x[i][j] + matrix_y[i][j];
                }   
            }
        
        return result;
        }
            
        
    public static void main(String[] args){
        double[][] matrix22_1 = {{0., 2.}, {4., 6.}};
        double[][] matrix22_2 = {{1., 2.}, {3., 4.}};
        double[][] matrix23_1 = {{0., 1.}, {2., 3.}, {4., 10.}};
        double[][] matrix23_2 = {{6., 7.}, {8., 9.}, {10., 11.}};

        System.out.println("\n# printMatrixの動作確認");

        //printMatrix(matrix22_1);
        printMatrix(matrix23_2);
        
        //以下は computeAddMatrix メソッドを実装したあとで実行する内容。
        //最初の動作確認時にはコメントアウトしておくと良い。
        System.out.println("\n# matrix22_1 + matrix22_2");
        computeAddMatrix(matrix22_1, matrix22_2);
        double[][] level2_1 = computeAddMatrix(matrix22_1, matrix22_2);
        printMatrix(level2_1);

        System.out.println("\n# matrix23_1 + matrix23_2");
        computeAddMatrix(matrix23_1, matrix23_2);
        double[][] level2_2 = computeAddMatrix(matrix23_1, matrix23_2);
        printMatrix(level2_2);


        System.out.println("\n# 行列サイズが異る場合");
        computeAddMatrix(matrix22_1, matrix23_1);
        double[][] level2_3 = computeAddMatrix(matrix22_1, matrix23_1);
        printMatrix(level2_3);
    }
    } 