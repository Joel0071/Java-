import java.util.*;

public class Coursera_Lab{
    public static void main(String joel[]){
        System.out.println("Days Of the Week\n");
        System.out.println("Start of output for Challenge Exercie\n\n");
        String Days_Of_Week[]={"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
        for(int i=0;i<7;i++){
            System.out.print(Days_Of_Week[i]+" ");
        }
        System.out.print("\n");
        for(int i=1;i<=31;i++){
            if(i==1){
                for(int j=0;j<20;j++){
                    System.out.print(" ");
                }
            }
            if(i<=9){
                System.out.print(i+"   ");
            }
            if(i>=10){
                System.out.print(i+"  ");
            }
            int choice=2;
            if(i==2 || i==9 || i==16 || i==23 || i==30){
                System.out.print("\n");
            }
        }
    }
}