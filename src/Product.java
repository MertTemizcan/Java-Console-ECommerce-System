import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public abstract class Product {

    private final String productId;
    private String productName;
    private int productStock;
    private double productPrice;
    private static final Set<String> usedIds = new HashSet<>();
    private static final SecureRandom random = new SecureRandom();
    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


    public Product(String productName, int productStock, double productPrice) {
        this.productId = generateProductId();
        setProductName(productName);
        setProductStock(productStock);
        setProductPrice(productPrice);
    }

    private String generateProductId() {
        String id;
        do {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 11; i++) {
                int index = random.nextInt(characters.length());
                sb.append(characters.charAt(index));
            }

            id = sb.toString();

        } while (usedIds.contains(id));
        usedIds.add(id);
        return id;
    }

    public final void sell(int quantity) {
        if(quantity <= 0) {
            throw new IllegalArgumentException("Satış değeri negatif veya sıfır olamaz");
        } else if (quantity > productStock) {
            throw new IllegalArgumentException(getProductName() + " için yetersiz stok istenen: " + quantity + " Kalan Stok: " +  productStock);
        }

        productStock -= quantity;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public final void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Ürün adı boş bırakılamaz");
        }

        this.productName = productName;
    }

    public int getProductStock() {
        return this.productStock;
    }

    public final void setProductStock(int productStock) {
        if (productStock < 0) {
            throw new IllegalArgumentException("Stok adedi negatif olamaz");
        }

        this.productStock = productStock;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public final void setProductPrice(double productPrice) {
        if (productPrice < 0) {
            throw new IllegalArgumentException("Ürün fiyatı negatif olamaz");
        }

        this.productPrice = productPrice;
    }

    @Override
    abstract public String toString();

    protected String commonInfo() {
        return String.format("ID: %s | Ürün Adı: %s | Stok Adedi: %d | Fiyatı: %.2f TL", productId, productName, productStock, productPrice);
    }


}
