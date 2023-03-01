import java.util.*;

public class kn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the n*n value for the Matrix: ");
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        int count=1,totalElements=0;
        int tr=0,br=n-1,rc=n-1,lc=0;
        while(totalElements<n*n){

            //top row
            for(int i=lc;i<=rc;i++){
                arr[lc][i]=count++;
                totalElements++;
            }
            tr++;

            //right column
            for(int i=tr;i<=br;i++){
                arr[i][br]=count++;
                totalElements++;
            }
            rc--;

            //bottom row
            for(int i=rc;i>=lc;i--){
                arr[br][i]=count++;
                totalElements++;
            }
            br--;

            //left column
            for(int i=br;i>=tr;i--){
                arr[i][lc]=count++;
                totalElements++;
            }
            lc++;

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
