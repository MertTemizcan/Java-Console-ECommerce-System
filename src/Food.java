public class Food extends Product {

    private String expirationDate;

    public Food(String productName, int productStock, double productPrice, String expirationDate) {
        super(productName, productStock, productPrice);
        setExpirationDate(expirationDate);
    }


    public String getExpirationDate() {
        return this.expirationDate;
    }

    public final void setExpirationDate(String expirationDate) {
        if (expirationDate == null || expirationDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Son kullanma tarihi boş bırakılamaz");
        }

        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return commonInfo() + String.format(" | Son Kullanma Tarihi: %s", expirationDate);
    }
}
