
public class Electronics extends Product{

    private String brand;
    private int warranty;


    public Electronics(String productId, String productName, int productStock, double productPrice, String brand, int warranty) {
        super(productId, productName, productStock, productPrice);
        setBrand(brand);
        setWarranty(warranty);
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Markası:" + getBrand());
        System.out.println("Garantisi:" + getWarranty() + " ay");
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty()) {
            System.out.println("Marka boş bırakılamaz");
        } else {
            this.brand = brand;
        }
    }

    public int getWarranty() {
        return this.warranty;
    }

    public void setWarranty(int warranty) {
        if(warranty >= 0) {
            this.warranty = warranty;
        } else {
            System.out.println("Garanti negatif olamaz");
        }
    }

}


