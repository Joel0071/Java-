import java.util.*;

public class Coursera_Lab{

    public static void rotate(int[][] matrix) {

    }

    public static void Display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int matrix[][]){
        //Transpose
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        Display(matrix);
        int left,right;
        for(int i=0;i<matrix.length;i++){
            right=matrix[0].length-1;
            left=0;
            while(left<=right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.println();
        Display(matrix);
    }

    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,5},
                {4,5,6,5},
                {7,8,9,5}
        };
        rotateMatrix(arr);
    }
}
