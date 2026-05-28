
public class Product {

    private String productId;
    private String productName;
    private int productStock;
    private double productPrice;


    public Product(String productId, String productName, int productStock, double productPrice) {
        setProductId(productId);
        setProductName(productName);
        setProductStock(productStock);
        setProductPrice(productPrice);
    }

    public void showInfos() {
        System.out.println();
        System.out.println("Adı:" + getProductName());
        System.out.println("ID:" + getProductId());
        System.out.println("Stok adedi:" + getProductStock());
        System.out.println("Fiyatı:" + getProductPrice());
    }


    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        if(productId == null || productId.trim().isEmpty()) {
            System.out.println("ID değeri boş bırakılamaz");
        } else {
            this.productId = productId;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.trim().isEmpty()) {
            System.out.println("Ürün adı boş bırakılamaz");
        } else {
            this.productName = productName;
        }
    }

    public int getProductStock() {
        return this.productStock;
    }

    public void setProductStock(int productStock) {
        if(productStock >= 0) {
            this.productStock = productStock;
        } else {
            System.out.println("Stok miktarı negatif olamaz");
        }
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        if(productPrice >= 0) {
            this.productPrice = productPrice;
        }  else {
            System.out.println("Ürün fiyatı negatif olamaz");
        }
    }


}
