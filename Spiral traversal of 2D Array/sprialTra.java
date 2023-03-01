import java.util.*;

public class kn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r,c;
        System.out.print("Enter the Number of Rows:");
        r=sc.nextInt();
        System.out.print("Enter the Number of Columns:");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the Elements...");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int totalElements=0,tr=0,br=r-1,lc=0,rc=r-1;
        while(totalElements<r*c){
           //top row
            for(int i=lc;i<=rc;i++){
                System.out.print(arr[lc][i]+" ");
                totalElements++;
            }
            tr++;
            //right column
            for(int i=tr;i<=br;i++){
                System.out.print(arr[i][br]+" ");
                totalElements++;
            }
            rc--;
            for(int i=rc;i>=lc;i--){
                System.out.print(arr[br][i]+" ");
                totalElements++;
            }
            br--;
            for(int i=br;i>=tr;i--){
                System.out.print(arr[i][lc]+" ");
                totalElements++;
            }
            lc++;
        }
    }
}
