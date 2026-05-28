
public class Main {

    public static void main(String[] args) {

        Product shoppingCart[] = new Product[2];

        Electronics phone = new Electronics("T178934", "Redmi Note 12 Pro", 5, 1500.0, "Xiaomi", 12);
        Food chickenBurger = new Food("H172436", "Spicy Chicken Burger", 10, 350.0, "30.06.2026");

        shoppingCart[0] = phone;
        shoppingCart[1] = chickenBurger;

        double totalAmount = 0;

        System.out.println("---------- Sepet detayları ----------");
        for(Product p : shoppingCart) {
            p.showInfos();
            totalAmount += p.getProductPrice();
            System.out.println("----------------------------");
        }

        System.out.println("Sepet toplam tutarı:" + totalAmount + " TL");




    }

}
