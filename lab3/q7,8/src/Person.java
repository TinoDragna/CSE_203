public class Person {
    private String name;
    private String address;
    private String phoneNum;

    public Person() {
        this.name = null;
        this.address = null;
        this.phoneNum = null;
    }
    
    public Person(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", phoneNum=" + phoneNum + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
}
