import java.util.Scanner;

class Encapsulate{
    private int c=0;
    private int arr[]=new int[10];
    void Addition(int a){
        if(c==10){
            System.out.println("Stack OverFlow!!");
        }
        else{
            arr[c]=a;
            System.out.println("Element Added!!!\n");
            c++;
        }
    }
  
    void Deletion(){
        if(c==0){
            System.out.println("\nStack UnderFlow!!\n");
        }
        else{
            c--;
            System.out.println("Top Element Deleted");
        }
    }
    void Display(){
        if(c==0){
            System.out.println("No Elements!!!");
        }
        else{
            System.out.println("Elements are as Follows....");
            for(int i=0;i<c;i++){
                System.out.println("->"+arr[i]+"/n");
            }
        }
    }
    void Top(){
        int top=arr[c];
        System.out.println("Top Element->"+c);
    }
}

class Hello{
    public static void main(String joel[]){
        int choice;
        
        Scanner sc=new Scanner(System.in);
        Encapsulate en=new Encapsulate();
        System.out.println("\n****Stack Using Java****\n\n");
        while(true){
            
            System.out.println("\n1.Add Elements\n2.Remove Elements\n3.Display all Elements\n4.Top Element\n5.Exit\n\n");
            System.out.print("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the Element to be Added:");
                    int a=sc.nextInt();
                    en.Addition(a);
                    break;
                case 2:
                    en.Deletion();
                case 3:
                    en.Display();
                    break;
                case 4:
                    en.Top();
                    break;
                case 5:
                    System.out.println("Thank You!!");
                    System.exit(1);
                    
            }
        }
    }
}
