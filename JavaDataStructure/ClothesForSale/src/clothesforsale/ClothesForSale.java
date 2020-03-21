package clothesforsale;

import java.util.Scanner;

public class ClothesForSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Clothe 1 = 1000");
        System.out.println("Clothe 2 = 1500");
        System.out.println("Clothe 3 = 670");
        System.out.println("Clothe 4 = 475");
        System.out.println("Input choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have purchased Clothe 1 = 1000" + "\n" + "Remaining items:" + "\n" + "Clothe 2" + "\n" + "Clothe 3" + "\n" + "Clothe 4");
                break;
            case 2:
                System.out.println("You have purchased Clothe 2 = 1500" + "\n" + "Remaining items:" + "\n" + "Clothe 1" + "\n" + "Clothe 3" + "\n" + "Clothe 4");
                break;
            case 3:
                System.out.println("You have purchased Clothe 3 = 670" + "\n" + "Remaining items:" + "\n" + "Clothe 1" + "\n" + "Clothe 2" + "\n" + "Clothe 4");
                break;
            case 4:
                System.out.println("You have purchased Clothe 4 = 475" + "\n" + "Remaining items:" + "\n" + "Clothe 1" + "\n" + "Clothe 2" + "\n" + "Clothe 3");
                break;
        }//end of switch
        System.out.println("choice");
    }//end of main
}//end of class