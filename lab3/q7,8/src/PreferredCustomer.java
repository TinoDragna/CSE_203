public class PreferredCustomer extends Customer{
    private double purchasesAmount;
    private double discountLevel;

    public PreferredCustomer() {
        this.purchasesAmount = 0;
        this.discountLevel = 0;
    }
    public PreferredCustomer(String name, String address, String phoneNum, String id, boolean isInMailingList,
            double purchasesAmount, double discountLevel) {
        super(name, address, phoneNum, id, isInMailingList);
        this.purchasesAmount = purchasesAmount;
        this.discountLevel = discountLevel;
    }

    public void discount() {
        if (purchasesAmount >= 2000) {
            discountLevel = 10.0;
        } else if (purchasesAmount >= 1500) {
            discountLevel = 7.0;
        } else if (purchasesAmount >= 1000) {
            discountLevel = 6.0;
        } else if (purchasesAmount >= 500) {
            discountLevel = 5.0;
        } else {
            discountLevel = 0.0;
        }
    }
    @Override
    public String toString() {
        return "PreferredCustomer [purchasesAmount=" + purchasesAmount + ", discountLevel=" + discountLevel
                + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getId()=" + getId()
                + ", getPhoneNum()=" + getPhoneNum() + "]";
    }
    public double getPurchasesAmount() {
        return purchasesAmount;
    }
    public void setPurchasesAmount(double purchasesAmount) {
        this.purchasesAmount = purchasesAmount;
        discount();
    }
    public double getDiscountLevel() {
        return discountLevel;
    }
    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    

}
