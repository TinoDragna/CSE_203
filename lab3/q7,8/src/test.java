public class test {
    public static void main(String[] args) {
        Customer customer = new  Customer(null, null, null, null, false);

        customer.setId("0123456");
        customer.setName("abc");
        customer.setAddress("a10,d1");
        customer.setInMailingList(true);
        
        System.out.println(customer);

        PreferredCustomer preferredCustomer = new PreferredCustomer(null, null, null, null, false, 0, 0);
        preferredCustomer.setId("1");
        preferredCustomer.setName("BBB");
        preferredCustomer.setPurchasesAmount(1000);
        System.out.println(preferredCustomer);

        
        preferredCustomer.setPurchasesAmount(3000);
        System.out.println(preferredCustomer);
    }

}
