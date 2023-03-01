import java.util.*;
import static java.lang.System.exit;

public class kn{
    static void createColSuffixx(int arr[][]){
        for(int i=0;i<arr[0].length;i++){
            for(int j=1;j<arr.length;j++){
                arr[j][i]+=arr[j-1][i];
            }
        }
    }

    static void createSuffixx(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }

    static int bruteForceApproach(int arr[][],int r1,int l1,int r2,int l2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=l1;j<=l2;j++){
                sum+=arr[i][j];
            }
        }

        return sum;
    }

    static int rowWisePrefix(int arr[][],int r1,int l1,int r2,int l2){
        int sum=0;
        createSuffixx(arr);
        if(l1>0){
            for(int i=r1;i<=r2;i++){
                sum+=arr[i][l2]-arr[i][l1-1];
            }
        }
        else{
            for(int i=r1;i<=r2;i++){
                sum+=arr[i][l2];
            }
        }
        return sum;
    }

    static int columnWisePrefix(int arr[][],int r1,int l1,int r2,int l2){
        int sum=0;

        createColSuffixx(arr);

        int upper,lower,total;
        if(r1>0 && l1>0){
            upper=arr[r1-1][l2];
            lower=arr[r2][l1-1];
            total=arr[r2][l2];
            sum=total-(upper+lower)+arr[r1-1][l1-1];
        }
        else if(r1==0 && l1>0){
            total=arr[r2][l2];
            lower=arr[r2][l1-1];
            sum=total-lower;
        }
        else if(r1>0 && l1==0){
            total=arr[r2][l2];
            upper=arr[r1-1][l2];
            sum=total-upper;
        }
        else if(r1==0 && l1==0){
            sum=arr[r2][l2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Row:");
        int r=sc.nextInt();
        System.out.print("Enter the Number of Columns:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the Elements..");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter r1 l1 and r2 l2");
        int r1=sc.nextInt();
        int l1=sc.nextInt();
        int r2=sc.nextInt();
        int l2=sc.nextInt();

        System.out.println("\nIn Brute Force Method");
        System.out.println("Sum is: "+bruteForceApproach(arr,r1,l1,r2,l2));

        System.out.println("\nIn Row Prefix Method (Less Optimized)");
        System.out.println("Sum is: "+rowWisePrefix(arr,r1,l1,r2,l2));

        System.out.println("\nIn Column Prefix Method (Most Optimized)");
        System.out.println("Sum is: "+columnWisePrefix(arr,r1,l1,r2,l2));

        System.out.println("Thank You!!");
        exit(0);
    }
}
