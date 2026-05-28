
public class Food extends Product{

    private String expirationDate;

    public Food(String productId, String productName, int productStock, double productPrice, String expirationDate) {
        super(productId, productName, productStock, productPrice);
        setExpirationDate(expirationDate);
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Son kullanma tarihi:" + getExpirationDate());
    }


    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String  expirationDate) {
        if(expirationDate == null || expirationDate.trim().isEmpty()) {
            System.out.println("Son kullanma tarihi boş bırakılamaz");
        } else {
            this.expirationDate = expirationDate;
        }
    }
}
