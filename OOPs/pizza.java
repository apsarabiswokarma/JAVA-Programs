import java.util.Scanner;

public class Pizza {
    void show(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Standard Pizza");
            System.out.println("Deluxe Pizza");
            System.out.println("Enter your choice...");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter How much pizza you want to buy :");
                    int n = sc.nextInt();
                    System.out.println("How many extra toppings you want :");
                    int tns = sc.nextInt();
                    int tp_oftoppins1 = tns*20;
                    if(n%5 == 0){
                        int sn = n/5;
                        int st = sn*100;
                        int total1 = (((n*100)-st)+tp_oftoppins1);
                        System.out.println("Total prise = "+total1);
                    }
                    else {
                        int total = ((n * 100)+tp_oftoppins1);
                        System.out.println("Total prise =" + total);
                    }
                    break;

                case 2:
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter How much pizza you want to buy :");
                    int m = sc.nextInt();
                    System.out.println("How many extra toppings you want :");
                    int tnd = sc.nextInt();
                    int tp_oftoppins2 = tnd*20;
                    if(m%5 == 0){
                        int dn = m/5;
                        int dt = dn*100;
                        int total2 = (((m*100)-dt)+tp_oftoppins2);
                        System.out.println("Total prise = "+total2);
                    }
                    else {
                        int total = ((m * 100)+tp_oftoppins2);
                        System.out.println("Total prise =" + total);
                    }
                    break;
            }
        }
    }
}