import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budjet = Double.parseDouble(scan.nextLine());
        String imput = scan.nextLine();
        double productsPrice = 0;
        int products = 0;
        int counter = 0;
        while (!imput.equals("Stop")) {
            double price = Double.parseDouble(scan.nextLine());
            counter++;
            products++;
            if (counter == 3) {
                counter = 0;
                price = price / 2;
            }
            budjet = budjet - price;
            if (budjet < 0) {
                System.out.printf("You don't have enough money!%n");
                System.out.printf("You need %.2f leva!", Math.abs(budjet));
                break;
            }
            productsPrice = productsPrice + price;
            imput = scan.nextLine();
        }
        if (budjet >= 0) {
            System.out.printf("You bought %d products for %.2f leva.", products, productsPrice);
        }
    }
}
