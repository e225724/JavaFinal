package jp.ac.uryukyu.ie.e225724;

public class Option {
        public static void printMatrix(double[][] matrix){
            System.out.println(Option.deepToString(matrix));
        }
    
    public static void main(String[] args){
        double[][] matrix22_1 = {{0., 2.}, {4., 6.}};
        double[][] matrix23_1 = {{0., 1.}, {2., 3.}, {4., 10.}};
        
        System.out.println("\n# printMatrixの動作確認");
        printMatrix(matrix22_1);
        System.out.println("\n# printMatrixの動作確認");
        printMatrix(matrix23_1);

        }
    }
