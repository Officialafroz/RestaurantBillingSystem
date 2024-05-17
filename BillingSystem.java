import java.util.*;
public class BillingSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of food items : ");
        int n = sc.nextInt();
        int No[] = new int[n];
        String Items[] = new String[n];
        int Quantity[] = new int[n];
        float Price[] = new float[n];
        float Total[] = new float[n];
        int TotalQuantity = 0;
        float DiscAmount;
        float DiscPer;
        float TotalAmount = 0;
        float FinalAmount = 0;
        int tempNo;
        // int brk;

        for(int i = 0; i < n; i++) {
            No[i] = i+1;
            System.out.print("Enter the Name of Food item no " + (i+1) + " : ");
            Items[i] = sc.next();
            Quantity[i] = 1;
            System.out.print("Enter the Price : ");
            Price[i] = sc.nextFloat();
            
        }

        System.out.println("Running bill :- ");
        for(int i = 0; i < n; i++) {
            System.out.print("Enter ItemNo : ");
            tempNo = sc.nextInt();
            for(int j = 0; j < n; i++) {
                if((tempNo-1) == No[j]) {
                    System.out.println(No[j] + "  " + Items[j] + "  " + Quantity[1] + "  " + Price[j]);
                    Total[i] = Quantity[1] * Price[j];
                    TotalQuantity++;
                }
                
            }
            TotalAmount = TotalAmount + Total[i];
            tempNo = 0;
        }

        System.out.println("Total Quantity : " + TotalQuantity);
        System.out.println("Discount % : ");
        DiscPer = sc.nextFloat();
        System.out.println("Total Amount : " + TotalAmount);
        DiscAmount = (TotalAmount*DiscPer)/100;
        System.out.println("Discount Amount : " + DiscAmount);
        FinalAmount = TotalAmount-DiscAmount;
        System.out.println("Final Amount : " + FinalAmount);

        sc.close();

    }
}