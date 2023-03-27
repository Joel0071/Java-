import java.util.*;

public class countSort{

    public static void stablecountSort(int arr[]){
        //This is the stable one
        int max=0;

        //Finding the maximum element in the Array to know the Freq Array lenght
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        //Assigning the Frequency of each element
        int frqArr[]=new int[max+1];
        Arrays.fill(frqArr,0);
        for(int i=0;i<max+1;i++){
            frqArr[arr[i]]++;
        }

        //Prefix sum of freqArray
        for(int i=1;i<max+1;i++){
            frqArr[i]+=frqArr[i-1];
        }

        System.out.println("Prefix sum ..");
        for(int a:frqArr) System.out.print(a+" ");
        int output[]=new int[arr.length];
        //Assigning the Elements to their correct places in the output Array.
        for(int i= arr.length-1;i>=0;i--){
            int id=frqArr[arr[i]];
            output[--id]=arr[i];
            frqArr[arr[i]]--;
        }

        System.out.println();
        arr=output.clone();
        for(int a:arr) System.out.print(a+" ");
    }

    public static void countSort(int arr[]){
        //This is the non-stable one..
        int max=0;

        //Finding the maximum element in the Array to know the Freq Array lenght
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        //Assigning the Frequency of each element
        int frqArr[]=new int[max+1];
        Arrays.fill(frqArr,0);
        for(int i=0;i<max+1;i++){
            frqArr[arr[i]]++;
        }

        //Assigning the Numbers in the ans Array using the help of freqArray
        int count=0;
        for(int i=0;i<max+1;i++){
            for(int j=0;j<frqArr[i];j++){
                ans[count++]=i;
            }
        }
        for(int a:ans) System.out.print(a+" ");



    }

    public static void main(String[] args) {
        int arr[]={1,4,5,2,2,5};
        //countSort(arr);
        stablecountSort(arr);
    }
}
