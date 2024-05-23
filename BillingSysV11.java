import java.util.*;

public class BillingSysV11 {
    public static void BillSystem(int n) {
        Scanner sc = new Scanner(System.in);
        int No[] = new int[n];
        String Items[] = new String[n];
        int Quantity[] = new int[n];
        float Price[] = new float[n];
        float Total[] = new float[100];
        int TotalQuantity = 0;
        // float DiscAmount;
        float DiscPer;
        float TotalAmount = 0;
        // float FinalAmount = 0;
        // int tempNo;

        ItemMaster(n, No, Items, Quantity, Price, Total);
        BillMaker(n, No, Items, Quantity, Price, Total, TotalQuantity, TotalAmount);
        System.out.println();

        System.out.println("\nTotal Quantity : " + TotalQuantity + "\n");
        System.out.print("Discount % : ");
        DiscPer = sc.nextFloat();

        System.out.println("\nTotal Amount    : " + TotalAmount);
        System.out.println("Discount Amount : " + DisAmount(TotalAmount, DiscPer));
        System.out.println("Final Amount    : " + FinAmount(TotalAmount));

        sc.close();
    }

    public static void ItemMaster(int n, int No[], String Items[], int Quantity[], float Price[], float Total[]) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            No[i] = i+1;
            System.out.print("Enter the Name of Food item no " + (i+1) + " : ");
            Items[i] = sc.next();
            Quantity[i] = 1;
            System.out.print("Enter the Price : ");
            Price[i] = sc.nextFloat();
        }
        sc.close();
    }

    public static void BillMaker(int n, int No[], String Items[], int Quantity[], float Price[], float Total[], int TotalQuantity, float TotalAmount) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int tempNo;
        do {
            System.out.print("No : ");
            tempNo = sc.nextInt();
            if(tempNo == 0) {
                break;
            }
            for(int j = 0; j < n; j++) {
                if(tempNo == No[j]) {
                    System.out.println("Items : " + Items[j]);
                    System.out.println("Quantity : " + Quantity[j]);
                    System.out.println("Price : " + Price[j]);
                    Total[i] = Quantity[j] * Price[j];
                    System.out.println("Total : " + Total[i]);
                    TotalQuantity++;
                    break;
                }
                
            }
            TotalAmount = TotalAmount + Total[i];
            i++;
        } while(tempNo != 0);

        sc.close();
    }

    public static float DisAmount(float TotalAmount, float DiscPer) {
        return (TotalAmount*DiscPer)/100;
    }

    public static float FinAmount(float TotalAmount) {
        return TotalAmount-DisAmount(TotalAmount, TotalAmount);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter No of Food Items : ");
        BillSystem(n = sc.nextInt());

        sc.close();
    }
}



/*
    No : 
    Item : 
    Quantity : 
    Price : 
    Total : 
 
    
 */