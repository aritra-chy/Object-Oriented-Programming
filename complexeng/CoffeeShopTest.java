
public class CoffeeShopTest {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop("Caffe 24");
        coffeeShop.addBeverage(new Coffee("Espresso", 5.0));
        coffeeShop.addBeverage(new Coffee("Latte", 3.0));
        coffeeShop.addBeverage(new Coffee("Cappuccino", 4.0));
        coffeeShop.addBeverage(new Tea("Green Tea", 2.0));
        coffeeShop.addBeverage(new Tea("Black Tea", 2.0));
        coffeeShop.addBeverage(new Beverage("Coca Cola", 1.0));

        coffeeShop.addCustomer(new Customer("Aritra"));
        coffeeShop.addCustomer(new Customer("Prottoy"));
        coffeeShop.addCustomer(new Customer("Arman"));
        coffeeShop.addCustomer(new Customer("Tamim"));
        coffeeShop.addCustomer(new Customer("Niloy"));

        coffeeShop.displayMenu();
        
        coffeeShop.serveBeverage("Espresso", "Aritra");
        coffeeShop.serveBeverage("Cappuccino", "Prottoy");
        coffeeShop.serveBeverage("Green Tea", "Arman");
        coffeeShop.serveBeverage("Coca Cola", "Tamim");
        coffeeShop.displayCustomerOrders("Aritra");
        coffeeShop.displayCustomerOrders("Prottoy");
        coffeeShop.displayCustomerOrders("Arman");
        coffeeShop.displayCustomerOrders("Tamim");
    }
}