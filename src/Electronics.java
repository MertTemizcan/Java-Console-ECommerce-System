public class Electronics extends Product {

    private String brand;
    private int warranty;


    public Electronics(String productName, int productStock, double productPrice, String brand, int warranty) {
        super(productName, productStock, productPrice);
        setBrand(brand);
        setWarranty(warranty);
    }

    public String getBrand() {
        return this.brand;
    }

    public final void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Marka boş bırakılamaz");
        }

        this.brand = brand;
    }

    public int getWarranty() {
        return this.warranty;
    }

    public final void setWarranty(int warranty) {
        if (warranty < 0) {
            throw new IllegalArgumentException("Garanti negatif olamaz");
        }

        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return commonInfo() + String.format(" | Markası: %s | Garantisi: %d Ay", brand, warranty);
    }

}


