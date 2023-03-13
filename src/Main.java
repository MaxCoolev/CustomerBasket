import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт"); // Вывод продуктов и цен
        }
        int sumProducts = 0; // Итоговая сумма чека
        int[] basket = new int[3];
        while (true) {
            System.out.println("Выберите товар и его количество или введите 'end' для завершения: ");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            String[] input = inputString.split(" ");
            int productNumber = Integer.parseInt(input[0]) - 1; // Номер продукта
            int productCount = Integer.parseInt(input[1]); // Количество продукта
            int currentPrice = prices[productNumber]; // Цена продукта в массиве
            sumProducts = sumProducts + (currentPrice * productCount);
            basket[productNumber] = basket[productNumber] + productCount;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("продукт: " + products[i]);
            System.out.println("количество: " + basket[i]);
            int priceOfProduct = basket[i] * prices[i];
            System.out.println("стоимость: " + priceOfProduct);
        }
        System.out.println("Общая цена: " + sumProducts + " руб.");
    }
}