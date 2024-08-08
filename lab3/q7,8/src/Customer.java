public class Customer extends  Person{
    private String id;
    private boolean isInMailingList;

    public Customer() {
        super();
        this.id = null;
        this.isInMailingList = false;
    }
    
    public Customer(String name, String address, String phoneNum, String id, boolean isInMailingList) {
        super(name, address, phoneNum);
        this.id = id;
        this.isInMailingList = isInMailingList;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", isInMailingList=" + isInMailingList + ", getName()=" + getName() + ", getId()="
                + getId() + ", getAddress()=" + getAddress() + ", isInMailingList()=" + isInMailingList()
                + ", getPhoneNum()=" + getPhoneNum() + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isInMailingList() {
        return isInMailingList;
    }

    public void setInMailingList(boolean isInMailingList) {
        this.isInMailingList = isInMailingList;
    }

    

}
