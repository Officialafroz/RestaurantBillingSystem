import java.util.*;
public class BillingSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of food items : ");
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
        System.out.println();

        System.out.println("Running bill :- ");
        System.out.println("No  Items\tQuantity  Price ");

        int i = 0;
        do{  
            tempNo = sc.nextInt();
            if(tempNo == 0) {
                break;
            }
            for(int j = 0; j < n; j++) {
                if((tempNo) == No[j]) {
                    System.out.println("     " + Items[j] + "\t  " + Quantity[1] + "\t  " + Price[j]);
                    Total[i] = Quantity[1] * Price[j];
                    TotalQuantity++;
                } 
            }
            TotalAmount = TotalAmount + Total[i];
            tempNo = 0;
        } while(tempNo != 0);

        System.out.println("\nTotal Quantity : " + TotalQuantity + "\n");
        System.out.print("Discount % : ");
        DiscPer = sc.nextFloat();
        System.out.println("\nTotal Amount    : " + TotalAmount);
        DiscAmount = (TotalAmount*DiscPer)/100;
        System.out.println("Discount Amount : " + DiscAmount);
        FinalAmount = TotalAmount-DiscAmount;
        System.out.println("Final Amount    : " + FinalAmount);

        sc.close();

    }
}
