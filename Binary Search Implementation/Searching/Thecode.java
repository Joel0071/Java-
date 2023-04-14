public class Binary_Search {
    public static void binarySearch(int[] num,int target){
        int st=0,en= num.length-1,mid;

        while(st<=en){
            mid=st+(en-st)/2;
            if(num[mid]==target){
                System.out.printf("The Number has been Found at %d Position",mid);
                return;
            } else if (target>num[mid]) {
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
    }

    public static void firstOccurence(int num[],int target){
        int st=0,en= num.length-1,mid,fo=-1;
        while(st<=en){
            mid=st+(en-st)/2;
            if(num[mid]==target){
                fo=mid;
                en=mid-1;

            } else if (target>num[mid]) {
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        System.out.printf("The Number has been Found at %d Position",fo);
    }

    public static void sqrt(int x){
        int st=0,en=x,mid,num=-1;
        while(st<=en){
            mid=st+(en-st)/2;
            long value=mid*mid;
            if((int)value==x){
                num=mid;
                break;
            } else if ((int)value>x) {
                en=mid-1;
            }
            else{
                st=mid+1;
                num=mid;
            }
        }
        System.out.print(num);
    }

    public static void main(String[] args) {
        int num[]={1,2,3,3,4,5};
        //Simple Binary Search
        binarySearch(num,5);

        //Finding the First Occurence using Binary Search Method
        firstOccurence(num,3);

        //Finding the Square Root using Binary Search Method
        sqrt(2147395599);
    }
}
