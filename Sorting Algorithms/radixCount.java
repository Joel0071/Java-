import java.util.Arrays;

public class RadixCount{

    public static void stablecountSort(int arr[],int place){
        //Assigning the Frequency of each element
        int frqArr[]=new int[10];
        int output[]=new int[arr.length];
        Arrays.fill(frqArr,0);
        for(int i=0;i<arr.length;i++){
            frqArr[(arr[i]/place)%10]++;
        }

        //Prefix sum of freqArray
        for(int i=1;i<10;i++){
            frqArr[i]+=frqArr[i-1];
        }

        //Assigning the Elements to their correct places in the output Array.
        for(int i= arr.length-1;i>=0;i--){
            int id=frqArr[(arr[i]/place)%10];
            output[--id]=arr[i];
            frqArr[(arr[i]/place)%10]--;
        }
        for(int i=0;i<arr.length;i++) arr[i]=output[i];
    }

    public static void radixSort(int arr[]){
        int max=0;
        //Finding the maximum element in the Array to know the Freq Array lenght
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        //Call to Radix Sort
        for(int place=1;max/place>0;place*=10){
            stablecountSort(arr,place);
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={43,453,626,894,0,3};
        radixSort(arr);
    }
}
