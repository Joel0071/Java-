class Solution {

    static int small(int a,int b,int c){
        int smallest;
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        }
        else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }

        }
        return smallest;
    }



    public int minDistance(String st1, String st2) {
        int arr[][]=new int[st1.length()+1][st2.length()+1];
        arr[0][0]=0;
        int smallest;
        for(int i=0;i<st1.length()+1;i++){
            arr[i][0]=i;
        }
        for(int i=0;i<st2.length()+1;i++){
            arr[0][i]=i;
        }
        for(int i=1;i<st1.length()+1;i++){
            for(int j=1;j<st2.length()+1;j++){
                if(st1.charAt(i-1)==st2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=small(arr[i][j-1],arr[i-1][j-1],arr[i-1][j]);
                    arr[i][j]++;
                }
            }
        }
        return arr[st1.length()][st2.length()];
    }
}
