import java.util.*;

class Practise{
    static void arrayReverse(int arr[][],int r,int c){
        int left,right,temp;
        for(int i=0;i<r;i++){
            left=0;
            right=c-1;
            while (left<right){
                temp=arr[i][left];
                arr[i][left++]=arr[i][right];
                arr[i][right--]=temp;
            }
        }

    }


    static void PrintArray(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of Rows:");
        int r=sc.nextInt();
        System.out.print("Enter the Number of Columns:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.print("Enter the Elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nArray before Reversal\n");
        PrintArray(arr,r,c);
        System.out.println("\nArray after Reversal\n");
        arrayReverse(arr,r,c);
        PrintArray(arr,r,c);
    }
}
