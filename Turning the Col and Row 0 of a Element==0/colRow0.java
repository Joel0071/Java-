import java.util.*;

public class Coursera_Lab{

    public static void setZeroes(int[][] matrix) {
        int row[]=new int[matrix.length];
        for (int i=0;i<row.length;i++) row[i]=-1;
        int col[]=new int[matrix[0].length];
        for(int i=0;i<col.length;i++) col[i]=-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void Display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        Display(arr);
        setZeroes(arr);
        System.out.println();
        Display(arr);
    }
}
