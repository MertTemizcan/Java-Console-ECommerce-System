import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        try {
            Electronics phone = new Electronics("Redmi Note 12 Pro", 5, 1500.0, "Xiaomi", 12);

            products.add(phone);
            phone.sell(2);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Food chickenBurger = new Food("Spicy Chicken Burger", 10, 350.0, "30.06.2027");
            products.add(chickenBurger);
            chickenBurger.sell(12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }





        System.out.println("---------- Ürün detayları ----------");
        for (Product p : products) {
            System.out.println(p);
            System.out.println("----------------------------");
        }




    }

}
