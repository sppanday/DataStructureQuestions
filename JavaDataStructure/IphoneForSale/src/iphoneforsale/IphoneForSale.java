package iphoneforsale;

import java.util.Scanner;

public class IphoneForSale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Himalayan Computer and Phones Store");
        System.out.println("Select your iPhone model.Please, Enter 1 for iPhone1 or 2 for iPhone2 , 3 for iPhone3 and 4 for iPhone 4 to make your Purchase. Thanke You.");
        System.out.println("iPhones    &   Prices");
        
        System.out.println("iPhone1 price = $650");
        System.out.println("iPhone2 price = $670");
        System.out.println("iPhone3 price = $400");
        System.out.println("iPhone4 price = $475");
        System.out.println("Input choice:");


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have purchased iPhone1 and you paid $650 for this purchase." + 
                        "\n" + "Remaining items with prices:" + "\n" + "iPhone2 = $670" + "\n" + "iPhone3 = $400" + 
                        "\n" + "iPhone4 = $ 475"+ "\n" + "Thanks For Shopping with us.Have a great day.");
                
                break;
            case 2:
                System.out.println("You have purchased iPhone2 and you paid $670 for this purchase." + 
                        "\n" + "Remaining items with prices:" + 
                        "\n" + "iPhone1 = $650" + "\n" + "iPhone3 = $400" + "\n" + "iPhone4 = $475" + 
                        "\n" + "Thanks For Shopping with us. Have a great day.");
                break;
            case 3:
                System.out.println("You have purchased iPhone3 and you paid $400 for this purchase." + 
                        "\n" + "Remaining items with prices:" + "\n" + "iPhone1 = $650" + "\n" + "iPhone2 = $670" + 
                        "\n" + "iPhone4 = $475" + "\n" + "Thanks For Shopping with us. Have a great day.");
                break;
            case 4:
                System.out.println("You have purchased iPhone4 and you paid $475 for this purchase." + 
                        "\n" + "Remaining items with prices:" + "\n" + "iPhone1 = 650" + 
                        "\n" + "iPhone2 = $670" + "\n" + "iPhone3 = $400" + 
                        "\n" + "Thanks For Shopping with us. Have a great day.");
                break;
            default:
                System.out.println("Your choice is invalid");
                break;
        }
        System.out.println(choice);
        
    }
    
}