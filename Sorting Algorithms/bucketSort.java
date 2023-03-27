import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Bucket_Sort{

    public static void bucketSort(float arr[]){
        int n=arr.length;
        //Creating Buckets
        ArrayList<Float>[] buckets=new ArrayList[n];
        //Create Empty Buckets i.e make Empty lists inside these Buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }

        //Adding Elements to our Buckets
        for(int i=0;i<n;i++){
            int num=(int)arr[i]*10;
            buckets[num].add(arr[i]);
        }

        //Now Sorting Each Buckets
        for (int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //Now merging the Bucket
        int index=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currentlol=buckets[i];
            for(int j=0;j<currentlol.size();j++){
                arr[index++]=currentlol.get(j);
            }
        }
        for(float a:arr) System.out.print(a+" ");
    }

    public static void main(String[] args) {
        float arr[]={0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
    }
}
